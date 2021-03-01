import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write a day");
        String day=input.next();

        switch (day){
            case "friday":
                System.out.println("muslim day");;
                break;
            case "saturday":
                System.out.println("jewish day");
            case "sunday":
                System.out.println("christian day");
            default:
                System.out.println("false day");
        }
    }
}
