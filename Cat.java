package L7;

import java.util.Random;

public class Cat {

    private String name;
    private boolean fullness = false;
    private int hunger;
    Random random = new Random();

    public Cat(String name){
        this.name = name;
        checkHunger();
    }

    public void eat(Plate2 plate){
        checkHunger();
        plate.decreaseFood(hunger);

        if(plate.getHungerAfterEaten() == 0){
            fullness = true;
        } else {
            fullness = false;
        }
    }

    public void checkHunger(){
        this.hunger = random.nextInt(8) + 3;
    }


    public void printInfo(){
       String message;
       message = this.fullness ? " сыт!" : " не наелся!";
        System.out.println(this + message);
    }

    @Override
    public String toString(){
        return "Котик " + name;
    }
}
