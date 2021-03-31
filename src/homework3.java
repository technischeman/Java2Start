import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write integer");
        int number=input.nextInt();
        switch (number){
            case 9:
                System.out.println("Largest number with 1 digit");
                break;
            case 99:
                System.out.println(" Largest number with 2 digit");
                break;
            case 999:
                System.out.println("Largest number with 3 digit");
                break;
            default:
                System.out.println("wrong choice");
        }

    }
}
