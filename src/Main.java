public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int year = 2000;
        printIsLeapYear(year);
        System.out.println();
        System.out.println("задание 2");

        int clientOS = 0;
        int clientDeviceYear = 2015;
        offerLiteVersion(clientOS, clientDeviceYear);

        System.out.println();
        System.out.println();
        System.out.println("задание 3");

        int deliveryDistance = 100;
        printDays(deliveryDistance);
    }



    public static void printIsLeapYear(int year) {
        boolean evenYear = isLeapYear(year);
        printIsLeapYearResult(year, evenYear);
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0);
    }

    private static void printIsLeapYearResult(int year, boolean evenYear) {
        if (evenYear) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }




    public static void offerLiteVersion(int clientOS, int clientDeviceYear) {
        boolean YearUntil2015 = JunkCondition(clientDeviceYear);
        boolean iOS = conditionOS(clientOS);
        printResultOS(iOS);
        printResultDeviceYear(YearUntil2015);
    }
    private static boolean JunkCondition(int clientDeviceYear) {
                return (clientDeviceYear >= 2022);
    }
    private static boolean conditionOS(int clientOS) {
        return (clientOS == 0);
    }
    private static void printResultOS(boolean clientOS) {
        if (clientOS) {
            System.out.print("По ссылке установите для iOS ");
        } else {
            System.out.print("По ссылке установите для Android ");
        }
    }
    private static void printResultDeviceYear(boolean clientDeviceYear) {
        if (clientDeviceYear) {
            System.out.print("версию приложения");
        } else {
            System.out.print("lite-версию приложения");
        }
    }




    private static void printDays(int deliveryDistance) {
        int i=DeliveryDays(deliveryDistance);
        System.out.print("Потребуется дней: "+i);
    }

    public static int DeliveryDays(int deliveryDistance) {
        int c = deliveryDistance-20;
        if (c < 0) {
            return 1;
        } else {
            int b= 2+(c/40);
           return b;
        }
    }

    }