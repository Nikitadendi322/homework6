public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientIos = 0;
        if (clientIos == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientIos == 1) {
            System.out.println("Установите верси приложения для Android по ссылке");

        }


    }

    private static void task2() {
        System.out.println("Задача 2");
        int clientIos = 0;
        int clientDeviceYear = 2014;
        if (clientIos == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientIos == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию приложения для IOS по ссылке");

        }
        if (clientIos == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientIos == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android  по ссылке");

        }


    }

    private static void task3() {
        System.out.println("Задача 3");
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год" + year + "  - високостный");
        } else {
            System.out.println("Год" + year + "  - Не вискостный");
        }

    }

    private static void task4() {
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        if (deliveryDistance > 100) {
            days = -1;
        }
        System.out.println("Доставка займет" + days + "дня");
    }

    private static void task5() {
        System.out.println("Задача 5");
        int moth = 4;
        switch (moth) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц под номером" + moth + "относится к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц под номером" + moth + "относится к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц под номером" + moth + "относится к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц под номером" + moth + "относится к сезону осень");
            default:
                System.out.println("Нет такого месяца");
        }
    }
}
