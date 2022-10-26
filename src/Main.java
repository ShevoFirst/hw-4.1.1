public class Main {
    public static void main(String[] args) {
        //задание 1.
        short clientOs = 1;
        switch (clientOs)
        {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
            break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
             break;
            default:
                System.out.println("не удалось определить операционную систему");
        }
        System.out.println();
        //задание 2
        int clientDeviceYear = 2012;
        switch (clientOs)
        {
            case 0:
                if (clientDeviceYear<2015){
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }else
                    System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 1:
                if (clientDeviceYear<2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }else
                    System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("не удалось определить операционную систему");
        }
        //задание 3
        int year = 2021;
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+"год является високосным");
        }else
            System.out.println(year+"год не является високосным");
        //задание 4
        int deliveryDistance=95;
        short deliveryTime;
        if (deliveryDistance<20){
            deliveryTime = 1;
        } else if (deliveryDistance>20 && deliveryDistance<60) {
            deliveryTime = 2;
        }else
            deliveryTime = 3;
        System.out.println("Потребуется дней: " + deliveryTime);
        System.out.println();
        //задание 4
        byte monthNum = 3;
        switch (monthNum){
            case 1:
            case 2:
                System.out.println("зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            case 12:
                System.out.println("зима");
                break;

            default:
                System.out.println("неправильно набран месяц");
        }


    }
}