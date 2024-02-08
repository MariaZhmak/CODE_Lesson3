import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("\t\tДобро пожаловать в конвертер ГБ");
//        System.out.println("B " + 7 + " ГБ: " + (7 * 1024) + " МБ ");

//        System.out.println("Температура по цельсию: " + 32);
//        System.out.println(32 + " градуса по цельси это " + (32 * 1.8 + 32) + "градусов по фаренгейту");

//        System.out.println(100 + " рублей это " + (100 * (1 / 62.08)) + " долларов");
//        System.out.println(100 + " рублей это " + (100 * (1 / 60.55)) + " евро");

        // Пользователи сами вносят значения температуры
//        System.out.println("\t***Конвертер температуры***");
//        System.out.println("Введите температуру в градусах Цельсия:");
//        int f = new Scanner(System.in).nextInt();
//        int coof1 = 32;
//        double coof2 = 1.8;
//        System.out.println(f + " градуса по цельсию это " + (f * coof2 + coof1) + " градусов по фаренгейту");

        // Пользователи сами вносят значения валюты
        System.out.println("\t***Конвертер валют***");
        System.out.println("Введите значение суммы в рублях");
        double rub = new Scanner(System.in).nextDouble();
        System.out.println("Введите актуальный курс доллара");
        double dol = new Scanner(System.in).nextDouble();
        System.out.println("Введите актуальный курс евро");
        double eur = new Scanner(System.in).nextDouble();

        System.out.println(rub + " рублей это " + (rub * (1 / dol)) + " долларов");
        System.out.println(rub + " рублей это " + (rub * (1 / eur)) + " евро");

    }
}
