import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write A B C or D");
        String letter=input.next();
        switch (letter){
            case "A":
            case "B":
            case "D":
                System.out.println("wrong answer");
                break;
            case "c":
                System.out.println("right answer");
                break;
            default:
                System.out.println("invalid" +
                        "answer");
        }
    }
}
