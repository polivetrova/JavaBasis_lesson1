package L7;

public class Plate2 {

    private int food;
    private int plateSize;
    private int hungerAfterEaten;

    public Plate2(int food, int plateSize){
        this.food = food;
        this.plateSize = plateSize;
    }

    public void addFood(int food){
        if((plateSize - this.food) >= food){
            this.food += food;
            System.out.println(this);
        }
        food -= (plateSize - this.food);
        this.food = plateSize;

        System.out.println("Миска наполнена. Вы насыпали " + food + " лишних порций!");
    }

    public void decreaseFood(int hunger){

        if((food - hunger) <= 0){
            hungerAfterEaten = (food - hunger) * -1;
            food = 0;

        } else {
            hungerAfterEaten = 0;
            food -= hunger;
        }
    }

    public void printInfo(){

        if(food <= 0){
            System.out.println("Миска пуста!");
        } else {
            System.out.println(this);
        }
    }

    @Override
    public String toString(){
        return "Plate: food = " + food;
    }

    public int getHungerAfterEaten() {
        return hungerAfterEaten;
    }
}
