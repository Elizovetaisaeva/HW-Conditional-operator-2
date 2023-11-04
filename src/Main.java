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
            System.out.println("cкачайте приложение для IOS");
        } else {   if (clientOS == 1) {
                System.out.println("cкачайте приложение для Android");
            } else {
                    System.out.println(" IOS не поддерживается");

                        }
                    }

                }

    public static void task2() {
        var year = 2018;
        if (year == 0) {
            if (year >= 2015) {
                System.out.println("cкачайте приложение для iOS");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (year == 1) {
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
        boolean isLeapYear = (year % 4 ==0 && year % 100 != 0 || year % 400 == 0) && year > 1584;
        if (isLeapYear) {
            System.out.println( " год высокосный " + year );
        } else {
            System.out.println( " год НЕ высокосный " + year );
        }


    }

    public static void task4() {
        var deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println( "Потребуется " + deliveryDistance + " дней + срок доставки " );
        } else if (deliveryDistance < 60) {
            System.out.println( "Потребуется " + deliveryDistance + " дней + срок доставки " );
        } else if (deliveryDistance < 100) {
            System.out.println( "Потребуется " + deliveryDistance + " дней + срок доставки " );
        } else {
            System.out.println("доставки нет");

        }
    }

    public static void task5() {


    }
}
