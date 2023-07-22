public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task20();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        System.out.println("Задача1");
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        } else {
            System.out.println("Установите версию для IOS по ссылке");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 1;
        short clientDeviceYear = 2003;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию для IOS по ссылке");
            }
        }
    }

    private static void task20() {
        System.out.println("Задача 2, второй вариант решения");
        byte clientOS = 0;
        int clientDeviceYear = 2023;
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите обегченную версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int daysOfDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах 20 км занимает " + daysOfDelivery + " сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает " + (daysOfDelivery + 1) + " cуток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает " + (daysOfDelivery + 1 + 1) + " cуток");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 2;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц осенний");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}