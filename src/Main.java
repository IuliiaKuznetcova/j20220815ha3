import java.util.Scanner;

// Iuliia Kuznetcova

public class Main {
    public static void main(String[] args) {
        // First level: 1.

        Scanner console = new Scanner(System.in);

        System.out.println("Введите количество метров: ");
        double meter = console.nextDouble();

        // double resultInch = meter * 0.0254;

       double inch;
       inch = 0.0254;

        double resultInch = meter * inch;

        System.out.println(meter + " метров " + "равно " + resultInch + " дюймов. ");

        // First level: 2.

       /* Scanner console = new Scanner(System.in);
        System.out.println("Введите количество минут: ");

        *//*int minutes = console.nextInt();
        int years = minutes / 525600;
        int days = minutes / 1140;*//*

        double minutes = console.nextInt();

        double years = minutes / 525600.0;
        double days = minutes / 1140.0;

        System.out.println("Количество лет: " + years);
        System.out.println("Количество дней:"  + days);*/

        // First level: 3.


       /* int x = 20; //должно быть объявление переменной икс = 20
        int x1 = x + 50; //должно увеличить икс на 50
        int u = 100; //должно быть объявление переменной u = 100
        int m = u * 2; //должно быть объявление переменной m в два раза больше u
        double k = (1.0 / 5) * 1000; //исправьте, чтобы результат не обнулялся.

        System.out.println(k);*/

       /* int a = 1000;
        int b = 500;
        int sum = a + b;
        double discount = 0.1;
        *//*double discount_amount = sum * discount;
        double discount_price = sum - discount_amount;*//*

        int discount_amount = (int) ((int) sum * discount);
        int discount_price = sum - discount_amount;

        System.out.println("Цена со скидкой: " + discount_price);
        System.out.println("Сумма скидки: " + discount_amount);*/

        /*С двумя последними заданиями я, к сожалению, не справилась.
        Я не поняла, что именно и почему нужно сделать, даже после того,
        как ответы решения сбрасывали в чат. */
        }

    }
