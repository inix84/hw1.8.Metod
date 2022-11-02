public class Main {
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

    public static void main(String[] args) {
        int year = 2000;
        printIsLeapYear(year);
        System.out.println();
        System.out.println("задание 2");
        System.out.println();

        int clientOS = 0;
        int clientDeviceYear = 2015;

        offerLiteVersion(clientOS, clientDeviceYear);
    }
    public static void offerLiteVersion(int clientOS, int clientDeviceYear) {
        boolean YearUntil2015 = УсловиеСтарья(clientDeviceYear);
        boolean iOS = УсловиеОС(clientOS);
        printResultOS(iOS);
        printResultDeviceYear(YearUntil2015);
    }
    private static boolean УсловиеСтарья(int clientDeviceYear) {
        return (clientDeviceYear >= 2015);
    }
    private static boolean УсловиеОС(int clientOS) {
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
}