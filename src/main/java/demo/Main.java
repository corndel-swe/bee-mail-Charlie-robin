package demo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SmartHome smartHome = SmartHome.getInstance();
        SmartHome home = SmartHome.getInstance();

        System.out.println(smartHome);
        System.out.println(home);

        SmartCamera cameraLivingRoom = new SmartCamera("Living Room");
        SmartCamera cameraKitchen = new SmartCamera("Kitchen");
        SmartLight lightLivingRoom = new SmartLight("Living Room");
        SmartLight lightKitchen = new SmartLight("Kitchen");

        smartHome.addDevice(List.of(cameraLivingRoom, cameraKitchen, lightLivingRoom, lightKitchen));

        cameraLivingRoom.detectMotion();
    }
}
