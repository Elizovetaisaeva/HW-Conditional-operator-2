public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        var clientOS = 0;
        if (clientOS == 0) {
            System.out.println("cкачайте приложение для ios");
        } else {
            if (clientOS == 1) {
                System.out.println("cкачайте приложение для Android");
            } else {
                System.out.println(" IOS не поддерживается");

            }
        }

    }

    public static void task2() {
        var year = 2018;
        var os = 0;
    if (os == 0) {
            if (year >= 2015) {
                System.out.println("cкачайте приложение для iOS");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (os == 1) {
            if (year >= 2015) {
                System.out.println("cкачайте приложение для Android");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("такая версия iOS не поддерживается");
        }
    }


    public static void task3() {
        var year = 2021;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year > 1584;
        if (isLeapYear) {
            System.out.println(" год высокосный " + year);
        } else {
            System.out.println(" год НЕ высокосный " + year);
        }


    }

    public static void task4() {
        var deliveryDistance = 33;
        if (deliveryDistance < 20) {
            System.out.println("доставка займет 1 день" + deliveryDistance );
        } else if (deliveryDistance < 60) {
            System.out.println("доставка займет 2 деня " + deliveryDistance );
        } else if (deliveryDistance < 100) {
            System.out.println("доставка займет 3 деня " + deliveryDistance );
        } else {
            System.out.println("доставки нет");

        }
    }

    public static void task5() {
        var monthNumber = 3;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println( " Зима " + monthNumber );
                break;
            case 3:
            case 4:
            case 5:
                System.out.println( " Весна " + monthNumber );
                break;
            case 6:
            case 7:
            case 8:
                System.out.println( " Лето " + monthNumber );
                break;
            case 9:
            case 10:
            case 11:
                System.out.println( " Осень " + monthNumber );
                break;
            default:
                System.out.println( " такой месяц не суцествует " + monthNumber );
        }
    }


}
