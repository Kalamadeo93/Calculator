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
    public String getSign(){
        return sign;
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
            }
            else if (!checkFirstVar && !checkSecondVar) {
                System.out.println("::dsfg");

            } else {
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
            }else if(!checkFirstVar && !checkSecondVar) {
                System.out.println("fffff");
            } else{
                try {
                    throw new Exception("Invalid input!");
                }catch (Exception e){
                    System.err.println(e.getMessage());
                    System.exit(0);
                }
            }

        }

    }
    /*public ArrayList ArabicInput(int x, int y) {
        ArrayList<Integer> arabicVar = new ArrayList<>();
        arabicVar.set(0, x);
        arabicVar.set(1, y);
        return arabicVar;
    }*/
        /*try {
            firstValueArabic = Integer.parseInt(tempVariable1);
            secondValueArabic = Integer.parseInt(tempVariable2);
        }catch (Exception e) {
            boolean flag = false;
            for (String s : letters) {
                flag = Objects.equals(tempVariable1, s);
                if (flag) {
                    firstValueRoman = tempVariable1;
                    romanVar.add(firstValueRoman);
                }
            }
                if (romanVar.size() != 1){
                    try {
                        throw new Exception("Out of range, use number's from 0 to 10 or from I to X");
                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());
                        System.exit(0);
                    }
                }
            for (String s : letters) {
                flag = Objects.equals(tempVariable2, s);
                if (flag) {
                    secondValueRoman = tempVariable2;
                    romanVar.add(secondValueRoman);
                }
            }
            if (romanVar.size() != 2){
                try {
                    throw new Exception("Out of range, use number's from 0 to 10 or from I to X");
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                    System.exit(0);
                }
            }
        }
        for(int i : numbers) {
            if(Objects.equals(firstValueArabic, i)){
                succParse1 = true;
            }
            if(Objects.equals(secondValueArabic, i)){
                succParse2 = true;
            }
        }
        if (succParse1 && succParse2){
            arabicVar.add(firstValueArabic);
            arabicVar.add(secondValueArabic);
        }
        return new ArrayList<>(arabicVar, romanVar);*/

        /*try {
            throw new Exception("Out of range, use number's from 0 to 10");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }*/
        //System.out.println(arabicVar + "" + romanVar)


