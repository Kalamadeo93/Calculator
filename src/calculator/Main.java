package calculator;

import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] letters = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String firstValueRoman = null;
        String secondValueRoman = null;
        String resultValueRoman = "";
        int firstValueArabic = 0;
        int secondValueArabic = 0;
        int res = 0;
        int res1 = 0;
        boolean flag = false;
        String sign = "";

        Scanner sc = new Scanner(System.in);
        /*String all = sc.nextLine();
        String[] var1 = all.split(" ");
        String sign = var1[1];*/
        if(sc.hasNextInt()) {
            firstValueArabic = sc.nextInt();
            sign = sc.next();
            secondValueArabic = sc.nextInt();
            switch (sign) {
            case ("+") -> res = firstValueArabic + secondValueArabic;
            case ("-") -> res = firstValueArabic - secondValueArabic;
            case ("*") -> res = firstValueArabic * secondValueArabic;
            case ("/") -> res = firstValueArabic / secondValueArabic;
            }
            System.out.println(res);
        }
        else{
            firstValueRoman = sc.next();
            sign = sc.next();
            secondValueRoman = sc.next();
            switch (firstValueRoman) {
                case "I" -> firstValueArabic = 1;
                case "II" -> firstValueArabic = 2;
                case "III" -> firstValueArabic = 3;
                case "IV" -> firstValueArabic = 4;
                case "V" -> firstValueArabic = 5;
                case "VI" -> firstValueArabic = 6;
                case "VII" -> firstValueArabic = 7;
                case "VIII" -> firstValueArabic = 8;
                case "IX" -> firstValueArabic = 9;
                case "X" -> firstValueArabic = 10;
                /*default -> {
                    try {
                        throw new CalculatorException();
                    } catch (CalculatorException e) {
                        e.getMessage("Invalid enter", e);
                    }
                }*/
            }
            switch (secondValueRoman) {
                case "I" -> secondValueArabic = 1;
                case "II" -> secondValueArabic = 2;
                case "III" -> secondValueArabic = 3;
                case "IV" -> secondValueArabic = 4;
                case "V" -> secondValueArabic = 5;
                case "VI" -> secondValueArabic = 6;
                case "VII" -> secondValueArabic = 7;
                case "VIII" -> secondValueArabic = 8;
                case "IX" -> secondValueArabic = 9;
                case "X" -> secondValueArabic = 10;
                /*default -> {
                    try {
                        throw new CalculatorException();
                    } catch (CalculatorException e) {
                        e.getMessage("Invalid enter", e);
                    }
                }*/
            }
            switch (sign) {
                case ("+") -> res = firstValueArabic + secondValueArabic;
                case ("-") -> res = firstValueArabic - secondValueArabic;
                case ("*") -> res = firstValueArabic * secondValueArabic;
                case ("/") -> res = firstValueArabic / secondValueArabic;
            }
            try {
                if(res < 0){
                    throw new Exception("Result < 0");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
           /*M 1000   CM 900   D 500    CD 400  C 100  XC 90
             X 10     IX   9   V 5      IV 4    L 50   XL 40
             I 1  */

            while (res >= 1000) {
                        resultValueRoman += "M";
                        res -= 1000;
                    }
            while (res >= 900) {
                        resultValueRoman += "CM";
                        res -= 900;
                    }
            while (res >= 500) {
                        resultValueRoman += "D";
                        res -= 500;
                    }
            while (res >= 400) {
                        resultValueRoman += "CM";
                        res -= 400;
                    }
            while (res >= 100) {
                        resultValueRoman += "C";
                        res -= 100;
                    }
            while (res >= 90) {
                        resultValueRoman += "XC";
                        res -= 90;
                    }
            while (res >= 50) {
                        resultValueRoman += "L";
                        res -= 50;
                    }
            while (res >= 40) {
                        resultValueRoman += "XL";
                        res -= 40;
                    }
            while (res >= 10) {
                        resultValueRoman += "X";
                        res -= 10;
                    }
            while (res >= 9) {
                        resultValueRoman += "IX";
                        res -= 9;
                    }
            while (res >= 5) {
                        resultValueRoman += "V";
                        res -= 5;
                    }
            while (res >= 4) {
                        resultValueRoman += "IV";
                        res -= 4;
                    }
            while (res >= 1) {
                        resultValueRoman += "I";
                        res -= 1;
                    }

            System.out.println(resultValueRoman);
        }
        //int i = 0; i < letters.length; i++

    }
   /* public boolean checkRomanOrArabic(String[] var1){
        boolean flag;
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] letters = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    }*/
}
