package SmartDevice.SmartPhoneState;

import SmartDevice.SmartPhone;

abstract public class SmartPhoneState {
    public SmartPhone smartPhone;

    public SmartPhoneState(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }

    abstract public String unlock();
    abstract public String openCamera();
    abstract public String takePhoto();
}
