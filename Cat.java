package L6;

public class Cat extends Animal{

    public Cat(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    public Cat (String name){
        super(name);
        this.maxRunDistance = 200;
        this.maxJumpHeight = 2;
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
        System.out.println(this.toString() + " Неа, у меня лапки\n");
    }

    @Override
    public String toString(){
        return "Cat" + super.toString();
    }
}
