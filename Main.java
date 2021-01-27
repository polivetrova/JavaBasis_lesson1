package L5;

public class Main extends Thread{

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1F;
        }

        method1(arr);
        method2(arr);
    }

    private static void method1(float[] arr){

        long timeStart = System.currentTimeMillis();
        runArray(arr);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Метод 1: " + (timeEnd - timeStart));

    }

    private static void method2(float[] arr){

        float[] a1 = new float[h];
        float[] a2 = new float[h];

        long timeStart = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        new Thread(() -> runArray(a1));
        new Thread(() -> runArray(a2));

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long timeEnd = System.currentTimeMillis();

        System.out.println("Метод 2: " + (timeEnd - timeStart));
    }

    private static void runArray(float[] arr) {
        for(int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (float)i / 5) * Math.cos(0.2f + (float)i / 5) * Math.cos(0.4f + (float)i / 2));
        }
    }
}
