package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        String l = sc.next();
        int y = Integer.parseInt(sc.next());
        switch (l) {
            case ("+") -> res = x + y;
            case ("-") -> res = x - y;
            case ("*") -> res = x * y;
            case ("/") -> res = x / y;

        }
        System.out.println(res);

    }
}

