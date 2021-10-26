package calculator;


import java.util.Scanner;

public class RomTest {

    static int last = 2000;
    static int[] numbers =     {   1,   4,   5,    9,  10,  50, 100, 500, 1000 };
    static String[] letters =  { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public static String main (String[] args){

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
        if(n >= 1)
        {
            if(n == 1)
            {
                return "I";
            }
            /*else if (n == 2)
            {
                return one + one;
            }
            else if (n == 3)
            {
                return one + one + one;
            }
            else if (n==4)
            {
                return one + five;
            }
            else if (n == 5)
            {
                return five;
            }
            else if (n == 6)
            {
                return five + one;
            }
            else if (n == 7)
            {
                return five + one + one;
            }
            else if (n == 8)
            {
                return five + one + one + one;
            }
            else if (n == 9)
            {
                return one + ten;
            }*/

        }
        return "";


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