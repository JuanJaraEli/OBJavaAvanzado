package SmartDevice;

public class SmartPhoneBuilder {
    SmartPhone smartPhone;

    public SmartPhoneBuilder(String manufacturer){
        smartPhone = new SmartPhone();
        smartPhone.manufacturer = manufacturer;
    }

    public SmartPhoneBuilder setModel(String model){
        smartPhone.model = model;
        return this;
    }

    public SmartPhoneBuilder setReleaseYear(int releaseYear){
        smartPhone.releaseYear = releaseYear;
        return this;
    }

    public SmartPhoneBuilder setOperatingSystem(String operatingSystem){
        smartPhone.operatingSystem = operatingSystem;
        return this;
    }

    public SmartPhone build(){
        return this.smartPhone;
    }
}
