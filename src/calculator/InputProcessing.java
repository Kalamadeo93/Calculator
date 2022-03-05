package calculator;
import java.util.*;

public class InputProcessing {
    public String sign;
    String[] userInput;
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] letters = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    //"1","2", "3", "4", "5", "6", "7", "8", "9", "10",
    int firstArabicValue;
    int secondArabicValue;
    String firstRomanValue;
    String secondRomanValue;
    boolean checkFirstVar;
    boolean checkSecondVar;
    ArabicResult ar = new ArabicResult();
    RomanResult rr = new RomanResult();
    Scanner sc = new Scanner(System.in);

    public void setUserInput() {
        userInput = sc.nextLine().split(" ");
    }
    public String[] getUserInput() {
        return userInput;
    }
    public void setSign(){
        sign = userInput[1];
    }

    public void checkInputFromUser(String[] userInput){

        try{
            firstArabicValue = Integer.parseInt(userInput[0]);
            secondArabicValue = Integer.parseInt(userInput[2]);
        }catch (Exception ignore){}
        for (int i : numbers) {
            checkFirstVar = Objects.equals(firstArabicValue, i);
            if (checkFirstVar) {
                break;
            }
        }
        for (int i : numbers) {
            checkSecondVar = Objects.equals(secondArabicValue, i);
            if (checkSecondVar) {
                break;
            }
        }
            if (checkFirstVar && checkSecondVar) {
                ar.calculate(firstArabicValue, sign, secondArabicValue);
            } else if (checkFirstVar ^ checkSecondVar) {
                try {
                    throw new Exception("Invalid input!");
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    System.exit(0);
                }
            }
        for (String i : letters) {
            checkFirstVar = Objects.equals(userInput[0], i);
            if (checkFirstVar) {
                break;
            }
        }
            for (String i : letters) {
            checkSecondVar = Objects.equals(userInput[2], i);
            if(checkSecondVar){
                break;
            }
        }
            if (checkFirstVar && checkSecondVar){
                firstRomanValue = userInput[0];
                secondRomanValue = userInput[2];
                rr.RomRes(firstRomanValue, sign, secondRomanValue);
            } else if (checkFirstVar ^ checkSecondVar){
                try {
                    throw new Exception("Invalid input!");
                }catch (Exception e){
                    System.err.println(e.getMessage());
                    System.exit(0);
                }
            }

        }

}