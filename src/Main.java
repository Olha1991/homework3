public class Main {
    public static void main(String[] args) {

        // Task 1
        // iSO = 0, Android =1.

        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Install the iSO version of the app from the reference");
        } else if (clientOs == 1) {
            System.out.println("Install the Android version of the app from the reference");
        } else {
            System.out.println("App not available");
        }

        // Task 2

        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("iSO version will work correctly");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Install the lite version for iSO");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Android version will work correctly");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Install the lite version for Android");
        } else {
            System.out.println("Yours device is not supported by any version");
        }

        // Task 3

        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "it's the leap year");
        } else {
            System.out.println(year + "it's not the leap year");
        }


    }
}