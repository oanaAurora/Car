/**
 * Created by OanaAurora on 03.05.2018.
 */
public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4879;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    public Car(){

    }

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;

    }

    //Getters and setters

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public int getMinSpeed(){
        return this.minSpeed;
        }

    public double getWeight(){
        return this.weight;
    }

    public boolean getIsTheCarOn(){
        return this.getIsTheCarOn();
    }


    public void setMaxSpeed(int newMaxSpeed){
        this.maxSpeed = newMaxSpeed;
    }


    public void printVariables(){
        System.out.println("This is the max speed" + " "  + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
         System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMaxSpeed(){
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn(){
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar++;
            System.out.println("Someone get in");
        }else {
            System.out.println("The car is full" + numberOfPeopleInCar + "=" + maxNumberOfPeopleInCar);
        }
    }


    public void getOut(){
       if (numberOfPeopleInCar > 0){
           numberOfPeopleInCar--;
       }else {
           System.out.println("No one is in the car" + numberOfPeopleInCar);
       }
        System.out.println(numberOfPeopleInCar);
    }

    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        if(!isTheCarOn) {
            isTheCarOn = true;
        }else {
            System.out.println("the car is already on");
        }
    }


    public static void main(String[] args){
       Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();

      /*  System.out.println("Christmas Car: ");
        Car christmasPresent = new Car(550, 2000, false);
        christmasPresent.printVariables(); */


    }
}
