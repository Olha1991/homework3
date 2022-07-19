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

        // Task 4

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Delivery will take 1 day");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Delivery will take 2 day");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Delivery will take 3 day");
        } else {
            System.out.println(" No delivery");
        }

        // Task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
            default:
                System.out.println("Doesn't exist");
        }
    }
}