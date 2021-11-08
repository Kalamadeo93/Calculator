package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String[] letters = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String firstValueRoman;
        String secondValueRoman;
        String resultValueRoman = "";
        int firstValueArabic = 0;
        int secondValueArabic = 0;
        int res = 0;
        String sign;

        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            try{
                firstValueArabic = sc.nextInt();
            }catch (InputMismatchException e){
                System.err.println("Invalid enter! Use integer number's from 0 to 10 or from I to X");
                System.exit(0);
            }
            sign = sc.next();
            try{
                secondValueArabic = sc.nextInt();
            }catch (InputMismatchException e){
                System.err.println("Invalid enter! Use integer number's from 0 to 10 or from I to X");
                System.exit(0);
            }
            if (firstValueArabic < 0 | firstValueArabic > 10){
                try{
                    throw new Exception("Invalid enter! Use integer number's from 0 to 10 or from I to X");
                }catch (Exception e){
                    System.err.println(e.getMessage());
                    System.exit(0);
                }
            }

            if (secondValueArabic < 0 | secondValueArabic > 10){
                try{
                    throw new Exception("Invalid enter! Use integer number's from 0 to 10 or from I to X");
                }catch (Exception e){
                    System.err.println(e.getMessage());
                    System.exit(0);
                }
            }

            switch (sign) {
                case ("+") :
                    res = firstValueArabic + secondValueArabic;
                    break;
                case ("-") :
                    res = firstValueArabic - secondValueArabic;
                    break;
                case ("*") :
                    res = firstValueArabic * secondValueArabic;
                    break;
                case ("/") :
                    try {
                        res = firstValueArabic / secondValueArabic;
                    }catch (ArithmeticException e) {
                        System.err.println("Division by zero!");
                        System.exit(0);
                    }
                    break;
                    }
            System.out.println(res);
        }
        else{
            boolean flag = false;
            firstValueRoman = sc.next();
            for(String s : letters){
                flag = firstValueRoman == s;
            }
            if(flag) {
                try {
                    throw new Exception("Invalid enter! Use integer number's from 0 to 10 or from I to X");
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    System.exit(0);
                }
            }
            sign = sc.next();
            secondValueRoman = sc.next();
            for(String s : letters){
                flag = secondValueRoman == s;
            }
            if(flag) {
                try {
                    throw new Exception("Invalid enter! Use integer number's from 0 to 10 or from I to X");
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    System.exit(0);
                }
            }

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
                default -> {
                    try {
                        throw new Exception("Invalid enter! Use integer number's from 0 to 10 or from I to X");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                        System.exit(0);
                    }
                }
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
                default -> {
                    try {
                        throw new Exception("Invalid enter! Use integer number's from 0 to 10 or from I to X");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                        System.exit(0);
                    }
                }
            }
            switch (sign) {
                case ("+") -> res = firstValueArabic + secondValueArabic;
                case ("-") -> res = firstValueArabic - secondValueArabic;
                case ("*") -> res = firstValueArabic * secondValueArabic;
                case ("/") -> res = firstValueArabic / secondValueArabic;

            }
            if(res < 1){
                try{
                    throw new Exception("Result is incorrect! Can't be negative!");
                }catch (Exception e){
                    System.err.println(e.getMessage());
                    System.exit(0);
                }

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


    }
}
