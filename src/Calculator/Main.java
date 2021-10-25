package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        String l = sc.next();
        int y = Integer.parseInt(sc.next());
        switch (l) {
            case ("+") -> System.out.println(x + y);
            case ("-") -> System.out.println(x - y);
            case ("*") -> System.out.println(x * y);
            case ("/") -> System.out.println(x / y);
        }


    }
}

