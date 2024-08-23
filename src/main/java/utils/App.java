package utils;

public enum App {
    API_Demos(
            "com.touchboarder.android.api.demos",
            "com.touchboarder.androidapidemos.MainActivity",
            ""
    ),
    CALCULATOR(
            "com.google.android.calculator",
            "com.android.calculator2.Calculator",
            ""
    )
    ;

    public String appPackage;
    public String appActivity;

    App(String appPackage, String appActivity) {
        this.appPackage=appPackage;
        this.appActivity=appActivity;
    }

    public  String appZipFile;

    App(String appPackage, String appActivity, String appZipFile) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
        this.appZipFile = appZipFile;
    }
}
