
import java.util.HashMap;
import java.util.Map;

public class CarServiceStation {
    private Map<String, Map<String, Integer>> servicePrices;

    public CarServiceStation() {
        servicePrices = new HashMap<>();
        initializeServicePrices();
    }
    void initializeServicePrices (){
        Map<String, Integer> hatchbackPrices = new HashMap<>();
        hatchbackPrices.put("BS01", 2000);
        hatchbackPrices.put("EF01", 5000);
        hatchbackPrices.put("CF01", 2000);
        hatchbackPrices.put("BF01", 1000);
        hatchbackPrices.put("GF01", 3000);

        Map<String, Integer> sedanPrices = new HashMap<>();
        sedanPrices.put("BS01", 4000);
        sedanPrices.put("EF01", 8000);
        sedanPrices.put("CF01", 4000);
        sedanPrices.put("BF01", 1500);
        sedanPrices.put("GF01", 6000);

        Map<String, Integer> suvPrices = new HashMap<>();
        suvPrices.put("BS01", 5000);
        suvPrices.put("EF01", 10000);
        suvPrices.put("CF01", 6000);
        suvPrices.put("BF01", 2500);
        suvPrices.put("GF01", 8000);

        servicePrices.put("Hatchback", hatchbackPrices);
        servicePrices.put("Sedan", sedanPrices);
        servicePrices.put("SUV", suvPrices);
    }

    public void generateBill(Car car, Service[] services) {
        int totalBill = 0;

        System.out.println("Type of Car " + car.getType());
        System.out.println("Service Details:");

        for (Service service : services) {
            if (servicePrices.containsKey(car.getType()) && servicePrices.get(car.getType()).containsKey(service.getCode())) {
                int servicePrice = servicePrices.get(car.getType()).get(service.getCode());
                totalBill += servicePrice;
                System.out.println("Service Code: " + service.getCode() + ", Charges: " + servicePrice);
            }
        }

        System.out.println("Total Bill:- " + totalBill);

        if (totalBill > 10000) {
            System.out.println("Complimentary cleaning provided.");
        }
    }

}
