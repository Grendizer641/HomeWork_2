package HomeWork_2;

public class HomeWork_2 {
    public static void main(String[] args) {
//        checkSum(8,7);
//        checkPositivity_1();
//        printText("Привет, Олег!", 5);
//        checkLeapYear(1992);
    }

    public static boolean checkSum(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <=20)
            return true;
        else
            return false;
    }

    public static void checkPositivity_1(int a){
        if(a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    public static boolean checkPositivity_2(int a){
        if(a >= 0)
            return false;
        else
            return true;
    }

    public static void printText(String a, int i){
        while (i > 0){
            System.out.println(a);
            i--;
        }
    }

    public static boolean checkLeapYear(int year){
        if (year % 4 != 0) {
            System.out.println("Не високосный");
            return false;
        }
        else if (year % 400 == 0){
            System.out.println("Високосный");
            return true;
        }
        else if (year % 100 == 0) {
            System.out.println("Не високосный");
            return false;
        }
        else {
            System.out.println("Високосный");
            return true;
        }
    }
}
