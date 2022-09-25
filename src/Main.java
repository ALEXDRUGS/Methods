import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2019);
        int currentYear = LocalDate.now().getYear();
        int clientOsIndex = 0;
        checkClientVersion(currentYear, clientOsIndex);
        int deliveryDistance = 95;
        deliveryCardsOfBank(deliveryDistance);
    }

    //Методы
    //Задание 1
    public static void checkLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    //Задание 2
    public static void checkClientVersion(int currentYear, int clientOsIndex) {
        String clientOs;
        if (clientOsIndex == 0) {
            clientOs = "iOS";
        } else {
            clientOs = "Android";
        }
        if (currentYear < 2015 && (clientOsIndex == 0 || clientOsIndex == 1)) {
            System.out.println("Скачайте облегченную версию приложения для " + clientOs);
        }
        if (currentYear >= 2015 && (clientOsIndex == 0 || clientOsIndex == 1)) {
            System.out.println("Скачайте  приложение для " + clientOs);
        }
    }

    //Задание 3
    public static void deliveryCardsOfBank(int deliveryDistance) {
        int day = 1;
        int min = 20;
        int interval = 40;
        int sum = deliveryDistance / interval;
        if (deliveryDistance <= min) {
            System.out.println("Потребуется дней - " + day);
        } else {
            for (int i = 1; i <= deliveryDistance; i++) {
                if (deliveryDistance % interval <= min) {
                    day = sum + 1;
                } else {
                    day = sum + 2;
                }
            }
            System.out.println("Потребуется дней - " + day);
        }
    }
}

