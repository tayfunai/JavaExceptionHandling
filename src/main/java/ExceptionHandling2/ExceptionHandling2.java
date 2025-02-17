package ExceptionHandling2;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        System.out.println("Will create two Vehicle objects");

        Vehicle v1 = new Vehicle(), v2 = new Vehicle(4, 5000);
        v1.setPrice(22000);
        v2.setPrice(16700);

        System.out.println();
        System.out.println("Will create three Bus objects");

        Bus b1 = new Bus(2, 55000, 37), b2 = new Bus(3, 62000, 55), b3 = new Bus(b1), b4=null;


        System.out.println();
        System.out.println("Will create two Car objects");

        Car c1 = new Car(4, 12000, 5), c2 = new Car(2, 26000, 2);

        System.out.println();
        System.out.println("Will create two Sport Car objects");

        SportCar sc1 = new SportCar(4, 12000, 5, 3), sc2 = new SportCar(3, 12000, 5, 3);


        System.out.println();
        System.out.println("Will create two Race Car objects");

        RaceCar rc1 = new RaceCar(4, 67000, 2, 4, 400), rc2 = new RaceCar(3, 85000, 4, 4, 450);

        System.out.println("\nComparing some of the vehicles");
        System.out.println("==============================");

        try{
            if(v1 == null || v2 == null || b1 == null || b2 == null || b3 == null ||
                    b4 == null || c1 == null || c2 == null || sc1 == null ||
                    sc2 == null || rc1 == null || rc2 == null)
                throw new Exception("Utilization of a Null Pointer Detected. Will Terminate the Program.");

            if(b1.equals(b2))
                System.out.println("The two bus objects (b1 & b2) are equal");
            else
                System.out.println("The two bus objects (b1 & b2) are not equal");


            if(b1.equals(b3))
                System.out.println("The two bus objects (b1 & b3) are equal");
            else
                System.out.println("The two bus objects (b1 & b3) are not equal");

            if(sc1.equals(sc2))
                System.out.println("The two sport car objects (sc1 & sc2) are equal");
            else
                System.out.println("The two sport car objects (sc1 & sc2) are not equal");

            if(rc1.equals(rc2))
                System.out.println("The two race car objects (rc1 & rc2) are equal");
            else
                System.out.println("The two race car objects (rc1 & rc2) are not equal");


            System.out.println("\nComparing some vehicles from different classes");
            System.out.println("==============================================");

            // Now notice the following statements
            rc1.setPrice(6000);
            sc1.setPrice(6000);

            rc1.setNumOfDoors(2);
            sc1.setNumOfDoors(2);

            rc1.setNumOfSeats(2);
            sc1.setNumOfSeats(2);

            rc1.setGasConsumption(5);
            sc1.setGasConsumption(5);

            rc1.setHorsePower(300);


            if(rc1.equals(sc1))
                System.out.println("Race car rc1 & sport car sc1 are equal");
            else
                System.out.println("Race car rc1 & sport car sc1 are not equal");


            if(sc1.equals(rc1))
                System.out.println("Race car rc1 & sport car sc1 are equal");
            else
                System.out.println("Race car rc1 & sport car sc1 are not equal");


            if(b1.equals(b4))
                System.out.println("The two bus objects (b1 & b4) are equal");
            else
                System.out.println("The two bus objects (b1 & b4) are not equal");


            // Now try to compare b4 to b1

            if(b4.equals(b1))
                System.out.println("The two bus objects (b4 & b1) are equal");
            else
                System.out.println("The two bus objects (b4 & b1) are not equal");

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);

        }

        if(b1.equals(b2))
            System.out.println("The two bus objects (b1 & b2) are equal");
        else
            System.out.println("The two bus objects (b1 & b2) are not equal");


        if(b1.equals(b3))
            System.out.println("The two bus objects (b1 & b3) are equal");
        else
            System.out.println("The two bus objects (b1 & b3) are not equal");

        if(sc1.equals(sc2))
            System.out.println("The two sport car objects (sc1 & sc2) are equal");
        else
            System.out.println("The two sport car objects (sc1 & sc2) are not equal");

        if(rc1.equals(rc2))
            System.out.println("The two race car objects (rc1 & rc2) are equal");
        else
            System.out.println("The two race car objects (rc1 & rc2) are not equal");


        System.out.println("\nComparing some vehicles from different classes");
        System.out.println("==============================================");

        // Now notice the following statements
        rc1.setPrice(6000);
        sc1.setPrice(6000);

        rc1.setNumOfDoors(2);
        sc1.setNumOfDoors(2);

        rc1.setNumOfSeats(2);
        sc1.setNumOfSeats(2);

        rc1.setGasConsumption(5);
        sc1.setGasConsumption(5);

        rc1.setHorsePower(300);


        if(rc1.equals(sc1))
            System.out.println("Race car rc1 & sport car sc1 are equal");
        else
            System.out.println("Race car rc1 & sport car sc1 are not equal");


        if(sc1.equals(rc1))
            System.out.println("Race car rc1 & sport car sc1 are equal");
        else
            System.out.println("Race car rc1 & sport car sc1 are not equal");



        if(b1.equals(b4))
            System.out.println("The two bus objects (b1 & b4) are equal");
        else
            System.out.println("The two bus objects (b1 & b4) are not equal");


        // Now try to compare b4 to b1

        if(b4.equals(b1))
            System.out.println("The two bus objects (b4 & b1) are equal");
        else
            System.out.println("The two bus objects (b4 & b1) are not equal");

    }

}


class Book {}
class Painting{}
class Phones{}

// Vehicle Class
class Vehicle {

    // Attributes
    private int numOfDoors;
    private double price;


    // Constructors
    public Vehicle()	// default constructor
    {
        System.out.println("\nCreating a vehicle object using default constructor ....");

        numOfDoors = 4;
        price = 10000;
    }

    public Vehicle(int nd, double pr)
    {
        System.out.println("\nCreating a vehicle object using parameterized constructor ....");

        numOfDoors = nd;
        price = pr;
    }


    public Vehicle(Vehicle vec)	// copy constructor
    {
        System.out.println("\nCreating a vehicle object using copy constructor ....");

        numOfDoors = vec.numOfDoors;
        price = vec.price;
    }

    public int getNumOfDoors()
    {
        return numOfDoors;
    }

    public void setNumOfDoors(int nd)
    {
        numOfDoors = nd;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double pr)
    {
        price = pr;
    }

    public String toString()
    {
        return "This Vehicle has " + numOfDoors +
                " doors and it price is " + price + "$.";
    }

    //Override the equals() method from the Object class
    public boolean equals(Object x)
    {
        if (x == null || this.getClass() != x.getClass())
            return false;
        else
        {
            // cast the passed object to a Vehicle object
            Vehicle v = (Vehicle)x;
            return (this.numOfDoors == v.numOfDoors && this.price == v.price);
        }

    }
} // end of Vehicle class




// Bus Class - This is a derived class from the Vehicle Class; that is it
// inherits the Vehicle class
class Bus extends Vehicle{

    // Attributes
    private int passengerCapacity;

    // Constructors
    public Bus()	// default constructor
    {
        System.out.println("Creating a bus object using default constructor ....");

        passengerCapacity = 10;
    }

    public Bus(int pc)
    {
        System.out.println("Creating a bus object using parameterized constructor ....");

        passengerCapacity = pc;
    }

    public Bus(Bus b)
    {
        System.out.println("Creating a bus object using copy constructor ....");

        setNumOfDoors(b.getNumOfDoors());
        setPrice(b.getPrice());
        passengerCapacity = b.passengerCapacity;
    }


    // A constructor that would allow the setting of the price and the number of doors
    // and the passenger capacity
    public Bus(int nd, double pr, int pc)
    {

        this(pc); 	// Call the constructor that sets the passenger capacity

        System.out.println("Creating a bus object using parameterized constructor for full settings....\n");

        // Notice that we now cannot call super to set the other two attributes
        // (i.e. super(nd, pr);) since either "this" or 'super" must be the first
        // statement, and it is not possible to have both of them as such!
        setPrice(pr);
        setNumOfDoors(nd);

    }


    public int getPassangerCapacity()
    {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int pc)
    {
        passengerCapacity = pc;;
    }

    public String toString()
    {
        return "This Bus has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
                "$. The passenger capacity of this bus is " + passengerCapacity + ".";
    }

    // Override the setPrice() method
    public void setPrice(double pr)
    {
        if(pr < getPrice())
            System.out.println("The price of this bus will be reduced from " + getPrice() + "$ to " + pr + "$.");
        else if (pr > getPrice())
            System.out.println("The price of this bus will be increased from " + getPrice() + "$ to " + pr + "$.");
        else
            System.out.println("No change will be applied to this price of the bus.");

        super.setPrice(pr);
        // Notice that you cannot access "price" directly  since it is private to the base class
        // i.e. price = pr; would be illegal

    }


    public boolean equals(Object x)
    {
        if (x == null || this.getClass() != x.getClass())
            return false;
        else
        {
            // cast the passed object to a Bus object
            Bus b = (Bus)x;

            return (this.getNumOfDoors() == b.getNumOfDoors() &&
                    this.getPrice() == b.getPrice() &&
                    this.passengerCapacity == b.passengerCapacity);
        }
    }
}   // end of Bus class

//Car Class - This is a derived class from the Vehicle Class.
//For a Car object, we are interested in its number of seats
class Car extends Vehicle{

    // Attributes
    private int numOfSeats;

    // Constructors
    public Car()	// default constructor
    {
        System.out.println("Creating a car object using default constructor ....");

        numOfSeats = 5;
    }

    public Car(int nd, double pr, int ns)
    {
        super(nd, pr);
        System.out.println("Creating a car object using parameterized constructor ....");

        numOfSeats = ns;
    }

    public Car(Car c)
    {
        System.out.println("Creating a car object using copy constructor ....");
        setNumOfDoors(c.getNumOfDoors());
        setPrice(c.getPrice());
        numOfSeats = c.numOfSeats;
    }


    public int getNumOfSeats()
    {
        return numOfSeats;
    }

    public void setNumOfSeats(int ns)
    {
        numOfSeats = ns;;
    }

    public String toString()
    {
        return "This Car has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
                "$. The number of seats of this car is " + numOfSeats + ".";
    }

    public boolean equals(Object x)
    {
        if (x == null || this.getClass() != x.getClass())
            return false;
        else
        {
            // cast the passed object to a Car object
            Car c = (Car)x;

            return (this.getNumOfDoors() == c.getNumOfDoors() &&
                    this.getPrice() == c.getPrice() &&
                    this.numOfSeats == c.numOfSeats);
        }
    }
}   // end of Car class



//SportCar Class - This is a derived class from the Car Class
//For a SportCar object, we are interested in its gas consumption
// as gallon per 100 miles
class SportCar extends Car{

    // Attributes
    private double gasConsumption;

    // Constructors
    public SportCar()	// default constructor
    {
        System.out.println("Creating a sport car object using default constructor ....");

        gasConsumption = 4;
    }

    public SportCar(int nd, double pr, int ns, double gc)
    {
        super(nd, pr, ns);
        System.out.println("Creating a sport car object using parameterized constructor ....");
        gasConsumption = gc;
    }

    public SportCar(SportCar sc)
    {
        System.out.println("Creating a sport car object using copy constructor ....");

        setNumOfDoors(sc.getNumOfDoors());
        setPrice(sc.getPrice());
        setNumOfSeats(sc.getNumOfSeats());

        gasConsumption = sc.gasConsumption;
    }


    public double getGasConsumption()
    {
        return gasConsumption;
    }

    public void setGasConsumption(double gc)
    {
        gasConsumption = gc;;
    }

    public String toString()
    {
        return "This Sport Car has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
                "$. The number of seats of this Sport Car is " + getNumOfSeats() +
                "\nand its gas consumption is " + gasConsumption + " gallons/100-mile.";
    }

    public boolean equals(Object x)
    {
        System.out.println("Executing equals() from the SportCar Class");
        if (x == null || this.getClass() != x.getClass())
            return false;
        else
        {
            // cast the passed object to a SportCar object
            SportCar sc = (SportCar)x;

            return (this.getNumOfDoors() == sc.getNumOfDoors() &&
                    this.getPrice() == sc.getPrice() &&
                    this.getNumOfSeats() == sc.getNumOfSeats() &&
                    this.gasConsumption == sc.gasConsumption);
        }
    }
}   // end of Sport Car class



//RaceCar Class - This is a derived class from the SportCar Class
//For a RaceCar object, we are interested in its horse power
class RaceCar extends SportCar{

    // Attributes
    private int horsePower;

    // Constructors
    public RaceCar()	// default constructor
    {
        System.out.println("Creating a race car object using default constructor ....");

        horsePower = 400;
    }

    public RaceCar(int nd, double pr, int ns, double gc, int hp)
    {
        super(nd, pr, ns, gc);
        System.out.println("Creating a race car object using parameterized constructor ....");
        horsePower = hp;
    }

    public RaceCar(RaceCar rc)
    {
        System.out.println("Creating a race car object using copy constructor ....");

        setNumOfDoors(rc.getNumOfDoors());
        setPrice(rc.getPrice());
        setNumOfSeats(rc.getNumOfSeats());
        setGasConsumption(rc.getGasConsumption());

        horsePower = rc.horsePower;
    }


    public int getHorsePower()
    {
        return horsePower;
    }

    public void setHorsePower(int hp)
    {
        horsePower = hp;
    }

    public String toString()
    {
        return "This Race Car has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
                "$. The number of seats of this Race Car is " + getNumOfSeats() +
                "\nand its gas consumption is " + getGasConsumption() + " gallons/100-mile." +
                "The horse power of this Race Car is: " + horsePower + ".";
    }

    public boolean equals(Object x)
    {
        System.out.println("Executing equals() from the RaceCar Class");
        if (x == null || this.getClass() != x.getClass())
            return false;
        else
        {
            // cast the passed object to a RaceCar object
            RaceCar rc = (RaceCar)x;

            return (this.getNumOfDoors() == rc.getNumOfDoors() &&
                    this.getPrice() == rc.getPrice() &&
                    this.getNumOfSeats() == rc.getNumOfSeats() &&
                    this.getGasConsumption() == rc.getGasConsumption() &&
                    this.horsePower == rc.horsePower);
        }
    }
}   // end of Race Car class
