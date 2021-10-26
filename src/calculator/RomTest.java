package calculator;


import java.util.Scanner;

public class RomTest {

    static int last = 2000;
    static int[] numbers =     {   1,   4,   5,    9,  10,  50, 100, 500, 1000 };
    static String[] letters =  { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public static void main(String[] args){

        //ввод числа
        System.out.println("Enter your Roman Numerals or Integer number:");
        Scanner cti = new Scanner(System.in);
        String a = cti.next();

        //проверяем входит ли строка "a" в массив "letters"
        boolean flag = false;
        for (String letter : letters)
            if (letter.equals(a)) {
                flag = true;
                break;
            }
        //объявление числововой переменной
        int n = Integer.parseInt(a);
        if (n >= 1) {
            if (n == 1) {
                a = "I";
                System.out.println(a);
            }
            else if (n == 2)
            {
                a = "II";
                System.out.println(a);
            }
            else if (n == 3)
            {
                a = "III";
                System.out.println(a);
            }
            else if (n==4)
            {
                a = "IV";
                System.out.println(a);
            }
            else if (n == 5)
            {
                a = "V";
                System.out.println(a);
            }
            else if (n == 6)
            {
                a = "VI";
                System.out.println(a);
            }
            else if (n == 7)
            {
                a = "VII";
                System.out.println(a);
            }
            else if (n == 8)
            {
                a = "VIII";
                System.out.println(a);
            }
            else if (n == 9)
            {
                a = "IX";
                System.out.println(a);
            }
            else if (n == 10) {
                a = "X";
                System.out.println(a);
            }

        }


        //flag = true значит будем иметь дело с римскими обозначением
        if(flag)
            System.out.println("Integer value = " +letterToNumber(a) );
            // тут уже самому можно доделать для перегона в римские по аналогии

    }
    private static int letterToNumber(String letter){
        return switch (letter) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> -1;
        };
    }
}