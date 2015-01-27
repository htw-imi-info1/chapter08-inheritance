import java.util.*;
/**
 * Write a description of class CarAndVehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarAndVehicle
{
    class Vehicle {}
    class Car extends Vehicle {
        public int getNumberOfDoors(){
            return 5;
        }
    }
    public void difference(){
        Vehicle v = new Car();
        Car c = new Car();
        List<Car> cars = new ArrayList<>();
        cars.add(c);
        //cars.add(v);
        //c = v;
        c.getNumberOfDoors();
      //  v.getNumberOfDoors();
        
    }
}
