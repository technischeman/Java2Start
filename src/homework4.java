import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write moon name");
        String moon=input.next();
        switch (moon){
            case "ocak":
            case "mart":
            case "mayis":
            case "temmuz":
                System.out.println("bu ay 31 gün");
                break;
            case "nisan":
            case "haziran":
            case "eylül":
            case "ekim":
            case "kasim":
                System.out.println("bu ay 30 gündür");
                break;
            case "subat":
                System.out.println("28 ya da 29 gün");
                break;
            default:
                System.out.println("gecersiz ay");

        }


    }
}
