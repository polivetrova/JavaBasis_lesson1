package L6;

public class Dog extends Animal {

    double maxSwimDistance;

    public Dog(String name, double maxRunDistance, double maxJumpHeight, double maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight);
        this.maxSwimDistance = maxSwimDistance;
    }

    public Dog (String name){
        super(name);
        this.maxRunDistance = 500;
        this.maxJumpHeight = 0.5;
        this.maxSwimDistance = 10;
    }

    double maxRunDistance = this.getMaxRunDistance();
    double maxJumpHeight = this.getMaxJumpHeight();

    @Override
    public void run(double distance){
        String message = (distance >= 0 && distance <= maxRunDistance) ? " Бегу\n" : " Это выше моих сил\n";

        System.out.printf(this.toString() + "%s%n", message);
    }

    @Override
    public void jump(double height) {
        String message = (height >= 0 && height <= maxJumpHeight) ? " Прыжжжок!\n" : " Это выше моих сил\n";

        System.out.printf(this.toString() + "%s%n", message);
    }

    @Override
    public void swim(double distance) {
        String message = (distance >= 0 && distance <= maxSwimDistance) ? "Поплыли\n" : "Это выше моих сил\n";

        System.out.printf(this.toString() + "%s%n", message);
    }

    @Override
    public String toString(){
        return "Dog" + super.toString();
    }
}
