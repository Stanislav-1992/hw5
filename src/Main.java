public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
                System.out.println("Такой версии приложения нет");
        }

        // Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int edgeDiviceYear = 2015;
        if (clientDeviceYear < edgeDiviceYear && clientOS == iOS) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientDeviceYear >= edgeDiviceYear && clientOS == iOS) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientDeviceYear < edgeDiviceYear && clientOS == android) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= edgeDiviceYear && clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой версии приложения нет");
        }

        // Задача 3
        System.out.println("Задача 3");
        int year = 2021; // високосный год начался с 1854
        if ((year > 1584) && (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println( year + " год не является високосным");
        }
        // Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20)
            System.out.println("Потребуется дней: 1");
        if (deliveryDistance < 60 && deliveryDistance >= 20) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не осуществялется");
        }

        // Задача 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
