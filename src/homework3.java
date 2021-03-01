import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write integer");
        int number=input.nextInt();
        switch (number){
            case 9:
                System.out.println("bir basanakli en büyük");
                break;
            case 99:
                System.out.println("iki basamakli en büyük");
                break;
            case 999:
                System.out.println("üc basamakli en büyük");
                break;
            default:
                System.out.println("yorum yok");
        }

    }
}
