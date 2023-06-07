package SmartDevice;

public class Main {
    public static void main(String[] args) {
        SmartPhone iPhone13 = new SmartPhoneBuilder("Apple")
                .setModel("iPhone 13")
                .setReleaseYear(2019)
                .setOperatingSystem("iOS")
                .build();


        System.out.println(iPhone13.smartPhoneState.unlock());
        System.out.println("");
        System.out.println(iPhone13.smartPhoneState.openCamera());
        System.out.println("");
        System.out.println(iPhone13.smartPhoneState.takePhoto());
    }
}
