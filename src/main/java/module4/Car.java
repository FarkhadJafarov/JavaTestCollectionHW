package module4;

public class Car {

    private String brand;
    private String model;
    private String bodyType;
    private short year;
    private byte passenger;
    private int engineVolume;
    private short enginePower;
    private byte fuelConsumption;
    private int cost;

    public Car(String brand,
        String model,
        String bodyType,
        short year,
        byte passenger,
        int engineVolume,
        short enginePower,
        byte fuelConsumption,
        int cost) {
        this.brand           = brand;
        this.model           = model;
        this.bodyType        = bodyType;
        this.year            = year;
        this.passenger       = passenger;
        this.engineVolume    = engineVolume;
        this.enginePower     = enginePower;
        this.fuelConsumption = fuelConsumption;
        this.cost            = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public byte getPassenger() {
        return passenger;
    }

    public void setPassenger(byte passenger) {
        this.passenger = passenger;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public short getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(short enginePower) {
        this.enginePower = enginePower;
    }

    public byte getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(byte fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public  void GetInfo()
    {
        System.out.println("марка: " +brand);
        System.out.println("модель: " +model);
        System.out.println("тип кузова: " +bodyType);
        System.out.println("год выпуска: " +year);
        System.out.println("пасажировместимость: " +passenger);
        System.out.println("объем двигателя: " +engineVolume);
        System.out.println("мощность двигателя (л.с.): " +enginePower);
        System.out.println("расход топлива: " +fuelConsumption);
        System.out.println("стоимость: " +cost);
        
    }
}
