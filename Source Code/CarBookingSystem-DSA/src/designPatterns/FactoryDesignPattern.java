package designPatterns;

public class FactoryDesignPattern {

enum CarType{
    MINI, MICRO, SUV, SEDEAN;
}

abstract class Car {

    public double fare(double distTravelled) {
        return distTravelled;
    }
}

class Mini extends Car {

    public double fare(double distTravelled) {
        return 5 * distTravelled;

    }
}

class Micro extends Car {

    public double fare(double distTravelled) {
        return 6 * distTravelled;

    }
}

class SUV extends Car {

    public double fare(double distTravelled) {
        return 10 * distTravelled;

    }
}

class SEDEAN extends Car {

    public double fare(double distTravelled) {
        return 10 * distTravelled;

    }
}

class carType{
    //use getCar method to get object of type Car   
    public Car getCar(CarType carType){  
        switch(carType){
        case MINI:
            return new Mini();  
        case MICRO:
            return new Micro();  
        case SUV:
            return new SUV();  
        case SEDEAN:
            return new SEDEAN();     
        }
         return null;  
    }
}

public class Main
{
	public void main(String[] args) {
		Car mini = new carType().getCar(CarType.MINI);
		System.out.println("mini fare: ");
		System.out.println(mini.fare(10));
		
		Car auto = new carType().getCar(CarType.SUV);
		System.out.println("auto fare: ");
		System.out.println(auto.fare(10));
	}
}
}