package utils;

public enum App {
    API_Demos(
            "com.touchboarder.android.api.demos",
            "com.touchboarder.androidapidemos.MainActivity"
    ),
    CALCULATOR(
            "com.google.android.calculator",
            "com.android.calculator2.Calculator"
    )
    ;

    public String appPackage;
    public String appActivity;

    App(String appPackage, String appActivity) {
        this.appPackage=appPackage;
        this.appActivity=appActivity;
    }

}
