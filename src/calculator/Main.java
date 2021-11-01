package calculator;

import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] letters = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String firstValueRoman = "";
        String secondValueRoman = "";
        int firstValueArabic = 0;
        int secondValueArabic = 0;
        int res = 0;


        Scanner sc = new Scanner(System.in);
        String all = sc.nextLine();
        String[] var1 = all.split(" ");
        firstValueArabic = Integer.parseInt(var1[0]);
        secondValueArabic = Integer.parseInt(var1[2]);
        String sign = var1[1];

        switch (sign) {
            case ("+") -> res = firstValueArabic + secondValueArabic;
            case ("-") -> res = firstValueArabic - secondValueArabic;
            case ("*") -> res = firstValueArabic * secondValueArabic;
            case ("/") -> res = firstValueArabic / secondValueArabic;

        }
        System.out.println(res);
    }
    public boolean checkRomanOrArabic(String[] var1){
        boolean flag;
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        if (var1[0].contains(numbers))
        {



        } else {
            if (sc.hasNext())
            {
                y = sc.nextLine();
            }
        }


    }
}
