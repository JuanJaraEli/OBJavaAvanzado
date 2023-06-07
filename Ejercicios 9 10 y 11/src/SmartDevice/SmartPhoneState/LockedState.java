package SmartDevice.SmartPhoneState;

import SmartDevice.SmartPhone;

public class LockedState extends SmartPhoneState{
    public LockedState(SmartPhone smartPhone){
        super(smartPhone);
    }

    @Override
    public String unlock() {
        smartPhone.changeState(new UnlockedState(smartPhone));
        return smartPhone.getModel() + " is unlocked.";
    }

    @Override
    public String openCamera() {
        return "You must unlock your " + smartPhone.getModel() + " to open the camera.";
    }

    @Override
    public String takePhoto() {
        return "You must unlock your " + smartPhone.getModel() + " and open the camera, to take photos.";
    }
}
