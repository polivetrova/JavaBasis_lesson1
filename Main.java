package L112;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        method1(arr);
        method2(arr);
    }

    private static void doMath(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
        }
    }

    private static void method1(float[] arr) {
        long a = System.currentTimeMillis();
        doMath(arr);
        System.out.println("method1: " + (System.currentTimeMillis() - a) + "\n");
    }

    private static void method2(float[] arr) {
        float[] arr2 = new float[HALF];
        float[] arr3 = new float[HALF];

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr2, 0, HALF);
        System.arraycopy(arr, HALF, arr3, 0, HALF);

        new Thread(() -> {
            doMath(arr2);
        }).start();

        new Thread(() -> {
            doMath(arr3);
        }).start();

        System.arraycopy(arr2, 0, arr, 0, HALF);
        System.arraycopy(arr3, 0, arr, HALF, HALF);
        System.out.println("method2: " + (System.currentTimeMillis() - a) + "\n");
    }
}
