package server.entities;

public class Vehicle {
    private String licencePlate;
    private long renavam;
    private String name;
    private String manufacturingDate;
    private Driver driver;

    public Vehicle() {}
    public Vehicle(String licencePlate, long renavam, String name, String manufacturingDate, Driver driver) {
        this.licencePlate = licencePlate;
        this.renavam = renavam;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.driver = driver;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public long getRenavam() {
        return renavam;
    }

    public void setRenavam(long renavam) {
        this.renavam = renavam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
