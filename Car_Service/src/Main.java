
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************************************* WELCOME TO CAR SERVICE STATION ***************************************************");
        GenerateBill generateBill = new GenerateBill();

        Car car = null;
        
            System.out.println("Select the type of car for Service : ");
            System.out.println("1:HatchBack");
            System.out.println("2:SUV");
            System.out.println("3:Sedan");
            System.out.println("Enter your choice : ");
            int carChoice = sc.nextInt();
            switch (carChoice){
                case 1 : {
                    car = new Car("Hatchback");
                    break;
                }

                case 2 : {
                    car = new Car("SUV");
                    break;
                }
                case 3 : {
                    car = new Car("Sedan");
                    break;
                }
            }
        
        
        List<String > servicesList = new ArrayList<>();
        while(true){
            System.out.println("Select the type servicing code : ");
            System.out.println("1:BS01");
            System.out.println("2:EF01");
            System.out.println("3:CF01");
            System.out.println("4:BF01");
            System.out.println("5:GF01");
            System.out.println("6:Generate Bill");
            System.out.println("7:Exit");

            System.out.println("Enter your choice : ");
            int serviceCode = sc.nextInt();
            switch (serviceCode){
                case 1 : {
                    servicesList.add("BS01");
                    break;
                }
                case 2 : {
                    servicesList.add("EF01");
                    break;
                }
                case 3 : {
                    servicesList.add("CF01");
                    break;
                }
                case 4 : {
                    servicesList.add("BF01");
                    break;
                }
                case 5 : {
                    servicesList.add("GF01");
                    break;
                }
                case 6 : {
                    generateBill.generateBill(car, servicesList);
                    return;
                }
                case 7 : {
                    return;
                }
                default:{
                    System.out.println("Enter valid service code");
                    break;
                }
            }
        }
    }
}