package calculator;

import java.util.Scanner;

public class dsf {
    public class RomanToInt {

        static int last = 2000;
        static int numbers[]  =     {   1,   4,   5,    9,  10,  50, 100, 500, 1000 };
        static String letters[]  =  { "I", "IV", "V", "IX", "X", "L", "C", "D", "M"};
        public static void main (String[] args){

            //ввод числа
            System.out.println("Enter your Roman Numerals or Integer number:");
            Scanner cti = new Scanner(System.in);
            String a = cti.next();

            //проверяем входит ли строка "a" в массив строк массива "letters"
            boolean flag = false;
            for(int i = 0;i < letters.length;i ++)
                if(letters[i].equals(a))
                    flag = true;

            //flag = true значит будем иметь дело с римскими обозначением
            if(flag)
                System.out.println("Integer value = " +letterToNumber(a) );
            else ;// тут уже самому можно доделать для перегона в римские по аналогии
        }
        private static int letterToNumber(String letter){
            return switch (letter) {
                case "I" -> 1;
                case "IV" -> 4;
                case "V" -> 5;
                case "IX" -> 9;
                case "X" -> 10;
                case "L" -> 50;
                case "C" -> 100;
                case "D" -> 500;
                case "M" -> 1000;
                default -> -1;
            };
        }
    }
}
