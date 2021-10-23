package Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        String l = sc.next();
        int y = Integer.parseInt(sc.next());
        if (Objects.equals(l, "+")) {
            System.out.println(x + y);
        }
        if (Objects.equals(l, "-")) {
            System.out.println(x - y);
        }
        if (Objects.equals(l, "*")) {
            System.out.println(x * y);
        }
        if (Objects.equals(l, "/")) {
            System.out.println(x / y);
        }


    }
}
