public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else
            System.out.println(year + " год не является високосным");
    }


    public static void task1() {
        System.out.println("Задача 1");
        int year = 2300;
        checkYear(year);
    }

    public static void method(int clientOs, int clientDeviceYear) {
        if (clientDeviceYear > 2014) {
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear < 2015) {
            if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int clientOs = 0; // введите свой вариант
        int clientDeviceYear = 2014; //введите год
        method(clientOs, clientDeviceYear);
    }

    public static int daysCount(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance < 101) {
            if ((deliveryDistance > 20) && (deliveryDistance < 101)) {
                days++;
            }
            if ((deliveryDistance > 60) && (deliveryDistance < 101)) {
                days++;
            }
            System.out.println("Потребуется дней:" + days);
        } else System.out.println("доставки нет.");

        return days;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        daysCount(deliveryDistance);
    }
}