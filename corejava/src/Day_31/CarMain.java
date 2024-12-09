package Day_31;

public class CarMain {
	
	public static void display(Car c) {
		System.out.println("Car Brand:"+c.getBrand());
		System.out.println("Car Model:"+c.getModel());
		System.out.println("Car Year:"+c.getYear());
		System.out.println("Driver Name:"+c.getDriver().getName());
		System.out.println("Driver Age:"+c.getDriver().getAge());
		System.out.println("=====================================================");
	}

	public static void main(String[] args) {
		Driver driver1 = new Driver("John", 30);
        Car car1 = new Car("Hyundai", "Creta", 2020, driver1);
        
        System.out.println("Original Car Details:");
        display(car1);
                
        Car car2 = new Car(car1);
        System.out.println("Copied Car Details:");
        display(car2);

        Driver driver2 = new Driver("Logan", 35);
        car1.changeDriver(driver2);
        
        System.out.println("Original Car Details after Changing Driver:");
        display(car1);
        
        System.out.println("Copied Car Details after Changing Driver in Original Car:");
        display(car2);
	}

}

/*
Original Car Details:
Car Brand:Hyundai
Car Model:Creta
Car Year:2020
Driver Name:John
Driver Age:30
=====================================================
Copied Car Details:
Car Brand:Hyundai
Car Model:Creta
Car Year:2020
Driver Name:John
Driver Age:30
=====================================================
Original Car Details after Changing Driver:
Car Brand:Hyundai
Car Model:Creta
Car Year:2020
Driver Name:Logan
Driver Age:35
=====================================================
Copied Car Details after Changing Driver in Original Car:
Car Brand:Hyundai
Car Model:Creta
Car Year:2020
Driver Name:John
Driver Age:30
*/

/*
Create a Main class that creates a Car object and sets its attributes and the attributes of its driver. 
Then, create a copy of the Car object using the copy constructor and print the attributes of both the 
original and the copy of the Car objects to confirm that the copy constructor works correctly.
Finally, use the changeDriver() method to change the driver of the original Car object, and print 
the attributes of both the original and the copy of the Car objects again to confirm that the copy 
constructor created a deep copy of the Driver object and that the changeDriver method did not affect 
the driver of the copy of the Car object.


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input :
               Driver driver1 = new Driver("John", 30);
               Car car1 = new Car("Hyundai", "Creta", 2020, driver1);
               Driver driver2 = new Driver("Logan", 35);

sample output : 
              Original Car Details:
              Car Brand: Hyundai
              Car Model: Creta
              Car Year: 2020
              Driver Name: John
              Driver Age: 30
              
              Copied Car Details:
              Car Brand: Hyundai
              Car Model: Creta
              Car Year: 2020
              Driver Name: John
              Driver Age: 30

              Original Car Details after Changing Driver:
              Car Brand: Hyundai
              Car Model: Creta
              Car Year: 2020
              Driver Name: Logan
              Driver Age: 35

              Copied Car Details after Changing Driver in Original Car:
              Car Brand: Hyundai
              Car Model: Creta
              Car Year: 2020
              Driver Name: John
              Driver Age: 30
*/