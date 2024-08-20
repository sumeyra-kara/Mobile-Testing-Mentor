package utils;

public enum Device {

    PIXEL_2(
            "emulator-5554",
            "11.0",
            "Pixel_2",
            "Android"
    );

    public String udid;
    public String version;
    public String deviceName;
    public String platformName;

    Device(String udid, String version, String deviceName, String platformName) {
        this.udid=udid;
        this.version=version;
        this.deviceName=deviceName;
        this.platformName=platformName;
    }
}
