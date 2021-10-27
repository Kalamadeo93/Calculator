package calculator;

import java.util.Scanner;
public class TryDefineType {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        String y;
        if (sc.hasNextInt()){
            x = sc.nextInt();
            System.out.println(x);
        } else {
            if (sc.hasNext()){
                y = sc.nextLine();
                System.out.println(y);
            }
        }


    }
}
