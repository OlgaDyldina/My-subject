import java.util.Scanner;

public class Pasword {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your pasword:");
        String PW = sc.nextLine();
        if (PW.length() <8 || PW.length() >15) {
            do {
                System.out.println("Password lenght must be from 8 to 15 characters");
                PW = sc.nextLine();
            }
            while (PW.length() > 8 || PW.length() < 15);
        }
        System.out.printf("%s, Your new password: %s", name, PW);
    }
}
