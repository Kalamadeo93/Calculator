package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        String all = sc.nextLine();
        String[] var1 = all.split(" ");
        int x = Integer.parseInt(var1[0]);
        int y = Integer.parseInt(var1[2]);
        String l = var1[1];
        switch (l) {
            case ("+") -> res = x + y;
            case ("-") -> res = x - y;
            case ("*") -> res = x * y;
            case ("/") -> res = x / y;

        }
        System.out.println(res);
    }
}
