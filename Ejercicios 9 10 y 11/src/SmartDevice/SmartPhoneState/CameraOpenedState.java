package SmartDevice.SmartPhoneState;

import SmartDevice.SmartPhone;

public class CameraOpenedState extends SmartPhoneState{
    public CameraOpenedState(SmartPhone smartPhone){
        super(smartPhone);
    }

    @Override
    public String unlock() {
        return "Your" + smartPhone.getModel() +  " is already unlocked! >:C";
    }

    @Override
    public String openCamera() {
        return "Camera is also opened! >:C";
    }

    @Override
    public String takePhoto() {
        System.out.println("Taking picture...");
        return "The picture has been stored in the gallery.";
    }
}

