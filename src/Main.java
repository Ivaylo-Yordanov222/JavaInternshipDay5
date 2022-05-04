import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        double fuelPrice = scanner.nextDouble();
        double distance = 0;
        scanner.nextLine();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Double[] distances = new Double[n];
        for(int i = 0; i < n; i++){
            String[] vehicleRow = scanner.nextLine().split(", ");
            Vehicle vehicle;
            VehicleTypes type;
            String model, color;
            int power, yearProduced, weight;
            double fuelConsumption;

            type = VehicleTypes.valueOf(vehicleRow[0]);
            model = vehicleRow[1];
            power = Integer.parseInt(vehicleRow[2]);
            fuelConsumption = Double.parseDouble(vehicleRow[3]);
            yearProduced = Integer.parseInt(vehicleRow[4]);
            distance = Double.parseDouble(vehicleRow[5]);
            distances[i] = distance;
            if(vehicleRow.length > 6 ){
                weight = Integer.parseInt(vehicleRow[6]);
                color = vehicleRow[7];
                vehicle = new Vehicle(type,model,power,fuelConsumption,yearProduced,weight,color);
            }else{
                vehicle = new Vehicle(type,model,power,fuelConsumption,yearProduced);
            }
            vehicles.add(vehicle);
        }
        int j = 0;
        for(Vehicle v : vehicles)
        {
            System.out.println(v
                    + " Insurance cost: "+ String.format("%.2f",v.getInsurancePrice())
                    +" - Travel cost: "+String. format("%.2f", v.calculateTripPrice(fuelPrice,distances[j])));
            j++;
        }
    }
}