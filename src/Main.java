import java.util.Scanner;

// Iuliia Kuznetcova

public class Main {
    public static void main(String[] args) {
        // First level: 1.

        Scanner console = new Scanner(System.in);

        System.out.println("������� ���������� ������: ");
        double meter = console.nextDouble();

        // double resultInch = meter * 0.0254;

       double inch;
       inch = 0.0254;

        double resultInch = meter * inch;

        System.out.println(meter + " ������ " + "����� " + resultInch + " ������. ");

        // First level: 2.

       /* Scanner console = new Scanner(System.in);
        System.out.println("������� ���������� �����: ");

        *//*int minutes = console.nextInt();
        int years = minutes / 525600;
        int days = minutes / 1140;*//*

        double minutes = console.nextInt();

        double years = minutes / 525600.0;
        double days = minutes / 1140.0;

        System.out.println("���������� ���: " + years);
        System.out.println("���������� ����:"  + days);*/

        // First level: 3.


       /* int x = 20; //������ ���� ���������� ���������� ��� = 20
        int x1 = x + 50; //������ ��������� ��� �� 50
        int u = 100; //������ ���� ���������� ���������� u = 100
        int m = u * 2; //������ ���� ���������� ���������� m � ��� ���� ������ u
        double k = (1.0 / 5) * 1000; //���������, ����� ��������� �� ���������.

        System.out.println(k);*/

       /* int a = 1000;
        int b = 500;
        int sum = a + b;
        double discount = 0.1;
        *//*double discount_amount = sum * discount;
        double discount_price = sum - discount_amount;*//*

        int discount_amount = (int) ((int) sum * discount);
        int discount_price = sum - discount_amount;

        System.out.println("���� �� �������: " + discount_price);
        System.out.println("����� ������: " + discount_amount);*/

        /*� ����� ���������� ��������� �, � ���������, �� ����������.
        � �� ������, ��� ������ � ������ ����� �������, ���� ����� ����,
        ��� ������ ������� ���������� � ���. */
        }

    }
