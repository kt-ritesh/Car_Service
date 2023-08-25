
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Type of car (Hatchback, Sedan, SUV): ");
        String givenCar = sc.next();
        CarServiceStation serviceStation = new CarServiceStation();

        Car car = new Car(givenCar);
        List<Service> servicesList = new ArrayList<>();
        System.out.println("Basic Servicing -> BS01, \nEngine Fixing -> EF01, \nClutch Fixing -> CF01, " +
                "\nBrake Fixing -> BF01, \nGear Fixing -> GF01");
        System.out.println("Choose service one by one by there code and press 0 after all service");
        while(true){

            String code = sc.next();
            if(code.equals("0")) break;
            servicesList.add(new Service(code, 0));

        }

        Service[] services = servicesList.toArray(new Service[0]);

        serviceStation.generateBill(car, services);
    }
}