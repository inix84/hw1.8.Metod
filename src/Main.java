public class Main {
    public static void printIsLeapYear(int year) {
        boolean evenYear = isLeapYear(year);
        printIsLeapYearResult (year,evenYear);
    }
    private static boolean isLeapYear(int year) {
       return year % 4==0;
    }
    private static void printIsLeapYearResult(int year,boolean evenYear) {
        if (evenYear) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }
    public static void main(String[] args) {
       int year =2000;
        printIsLeapYear(year);
        }
}