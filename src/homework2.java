import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write a letter");
        String letter=input.next();
        switch (letter){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("sesli");
                break;
            case"b":
            case"c":
            case"d":
            case"f":
                System.out.println("sessiz");
                break;
            default:
                System.out.println("invalid character");

        }
    }
}
