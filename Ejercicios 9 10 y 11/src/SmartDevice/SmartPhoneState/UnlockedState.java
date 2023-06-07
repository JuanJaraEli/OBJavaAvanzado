package SmartDevice.SmartPhoneState;

import SmartDevice.SmartPhone;

public class UnlockedState extends SmartPhoneState{
    public UnlockedState(SmartPhone smartPhone){
        super(smartPhone);
    }

    @Override
    public String unlock() {
        return "The phone is already unlocked.";
    }

    @Override
    public String openCamera() {
        smartPhone.changeState(new CameraOpenedState(smartPhone));
        return "Camera opened.";
    }

    @Override
    public String takePhoto() {
        return "The camera must be opened to take photos." ;
    }
}
