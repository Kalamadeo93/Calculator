package calculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
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
}
