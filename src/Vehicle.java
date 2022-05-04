import java.time.LocalDate;

public class Vehicle {
    private VehicleTypes type;
    private String model;
    private int power;
    private double fuelConsumption;
    private int yearProduced;
    private final String licenseNo;
    private int weight;
    private String color;
    private static int registrationNumberId;

    public Vehicle(VehicleTypes type, String model, int power, double fuelConsumption, int yearProduced) {
        Vehicle.registrationNumberId++;
        this.licenseNo = String.format("%04d", Vehicle.registrationNumberId);
        this.setType(type);
        this.setModel(model);
        this.setPower(power);
        this.setFuelConsumption(fuelConsumption);
        this.setYearProduced(yearProduced);
    }

    public Vehicle(VehicleTypes type, String model, int power, double fuelConsumption, int yearProduced, int weight, String color) {
        Vehicle.registrationNumberId++;
        this.licenseNo = String.format("%04d", Vehicle.registrationNumberId);
        this.setType(type);
        this.setModel(model);
        this.setPower(power);
        this.setFuelConsumption(fuelConsumption);
        this.setYearProduced(yearProduced);
        this.setWeight(weight);
        this.setColor(color);
    }

    public VehicleTypes getType() {
        return type;
    }

    public void setType(VehicleTypes type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public void setYearProduced(int yearProduced) {
        this.yearProduced = yearProduced;
    }

    public String getLicenseNo() {

        return this.licenseNo;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        if(this.color == null)
        {
            this.setColor("N/A");
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateTripPrice(double fuelPrice,double distance){
        return (distance/100) * this.getFuelConsumption() * fuelPrice;
    }

    public double getInsurancePrice(){
        int carAge = LocalDate.now().getYear() - this.getYearProduced();

        double typeCoefficient;

        switch (this.getType()){
            case car:
                typeCoefficient = 1.00;
                break;
            case suv:
                typeCoefficient = 1.12;
                break;
            case truck:
                typeCoefficient = 1.20;
                break;
            case motorcycle:
                typeCoefficient = 1.50;
                break;
            default:
                typeCoefficient = 1;
        }

        return (0.16*this.getPower())
                *(1.25*carAge)
                *(0.05*this.getFuelConsumption())
                * typeCoefficient;
    }

    public String toString(){
        return this.getLicenseNo()+" - "+this.getModel()+", "+this.getYearProduced()+", "+this.getColor();
    }
}
