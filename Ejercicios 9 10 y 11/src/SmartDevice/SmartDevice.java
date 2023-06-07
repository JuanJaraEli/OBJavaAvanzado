package SmartDevice;

public abstract class SmartDevice {

    public String manufacturer;
    public String model;
    public int releaseYear;
    public String operatingSystem;

    public SmartDevice(){}

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
