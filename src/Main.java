public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой версии приложения нет");
        }

        // Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 3
        System.out.println("Задача 3");
        int year = 2021; // високосный год начался с 1984
        switch (year) {
            case 1984:
            case 1988:
            case 1992:
            case 1996:
            case 2000:
            case 2004:
            case 2008:
            case 2012:
            case 2016:
            case 2020:
            case 2024:
                System.out.println(year + " год является високосным");
                break;
            default:
                System.out.println(year + " год не является високосным");
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
