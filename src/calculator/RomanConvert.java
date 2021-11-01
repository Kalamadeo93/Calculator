package calculator;

import java.util.Scanner;
public class RomanConvert {
    int x;
    String y;
    int res;
    String res1;

    private String arabicToRoman(){
        switch (x) {
            case 1 -> res1 = "I";
            case 2 -> res1 = "II";
            case 3 -> res1 = "III";
            case 4 -> res1 = "IV";
            case 5 -> res1 = "V";
            case 6 -> res1 = "VI";
            case 7 -> res1 = "VII";
            case 8 -> res1 = "VIII";
            case 9 -> res1 = "IX";
            case 10 -> res1 = "X";
            default -> res1 = null;
        }
        return res1;
    }
    private int romanToArabic(){
        switch (y) {
            case "I" -> res = 1;
            case "II" -> res = 2;
            case "III" -> res = 3;
            case "IV" -> res = 4;
            case "V" -> res = 5;
            case "VI" -> res = 6;
            case "VII" -> res = 7;
            case "VIII" -> res = 8;
            case "IX" -> res = 9;
            case "X" -> res = 10;
            default -> res = 0;
        }
        return res;
    }


    public void start(String[] args){
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt())
        {
            x = sc.nextInt();
            System.out.println(arabicToRoman());

        } else {
            if (sc.hasNext())
            {
                y = sc.nextLine();
                System.out.println(romanToArabic());
            }
        }


    }
}