package designPatterns;

public class BridgeDesignPattern {
	abstract class Vehicle {
	    protected Workshop Customer1;
	    protected Workshop Customer2;
	  
	    protected Vehicle(Workshop Customer1, Workshop Customer2)
	    {
	        this.Customer1 = Customer1;
	        this.Customer2 = Customer2;
	    }
	  
	    abstract public void manufacture();
	}
	  
	class Car extends Vehicle {
	    public Car(Workshop Customer1, Workshop Customer2)
	    {
	        super(Customer1, Customer2);
	    }
	  
	    @Override
	    public void manufacture()
	    {
	        System.out.print(" Customer1 ");
	        Customer1.work();
	        Customer2.work();
	    }
	}

	class Bike extends Vehicle {
	    public Bike(Workshop Customer1, Workshop Customer2)
	    {
	        super(Customer1, Customer2);
	    }
	  
	    @Override
	    public void manufacture()
	    {
	        System.out.print("Customer2 ");
	        Customer1.work();
	        Customer2.work();
	    }
	}
	interface Workshop
	{
	    abstract public void work();
	}
	class Produce implements Workshop {
	    @Override
	    public void work()
	    {
	        System.out.print("Picked up");
	    }
	}
	class Assemble implements Workshop {
	    @Override
	    public void work()
	    {
	        System.out.print(" And");
	        System.out.println(" Dropped in the location.");
	    }
	}
	class BridgePattern {
	    public static void main(String[] args)
	    {
	        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
	        vehicle1.manufacture();
	        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
	        vehicle2.manufacture();
	    }
	}

}
