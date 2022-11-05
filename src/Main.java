public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        int part = 15_000;
        int i = 0;
        int count = 0;
        double total = 0;
        double percent = 0.01;
        while (total < 2_459_000) {
            total = (total + part) * (1 + percent);
            System.out.println(total);
            count = count + 1;
        }
        System.out.println("Месяц " + count + ", сумма накоплений равна " + total + " рублей");

        //Задание 2
        System.out.println("Задание 2");
        int number = 0;
        while (number < 10) {
            number += 1;
            System.out.print(number + " ");
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        double Y = 12_000_000;

        for (int year = 1; year <= 10; year++) {
            double fertility = (Y / 1_000) * 12;
            double mortality = (Y / 1_000) * 8;
            Y = Y + (fertility - mortality);
            System.out.println("Год " + year + ", численность населения составляет " + (int) Y);
        }
    }
}