package SmartDevice;

import SmartDevice.SmartPhoneState.LockedState;
import SmartDevice.SmartPhoneState.SmartPhoneState;

public class SmartPhone extends SmartDevice{
    public SmartPhoneState smartPhoneState;

    @Override
    public String toString() {
        return "SmartPhone{" +
                "Manufacturer='" + manufacturer + '\'' +
                ", Model='" + model + '\'' +
                ", Release year=" + releaseYear +
                ", Operating system='" + operatingSystem + '\'' +
                '}';
    }

    public SmartPhone(){
        smartPhoneState = new LockedState(this);
    }

    public void changeState(SmartPhoneState smartPhoneState){
        System.out.println("Initial state: " + this.smartPhoneState.getClass().getName());
        this.smartPhoneState = smartPhoneState;
        System.out.println("Final state: " + this.smartPhoneState.getClass().getName());
    }

    public SmartPhoneState getSmartPhoneState() {
        return smartPhoneState;
    }
}
