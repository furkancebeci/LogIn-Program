import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, password;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Your Username = ");
        userName = input.nextLine();

        System.out.print("Your Password = ");
        password = input.nextLine();

        if (userName.equals("admin") && password.equals("password")) {
            System.out.println("You have successfully logged in!");
        } else if (!(userName.equals("admin")) && password.equals("password")) {
            System.out.println("Wrong username");
        } else if (userName.equals("admin") && !(password.equals("password"))) {
            System.out.print("Wrong Password. Enter 1 if you want to change your password, or any number if you don't = ");
            select = input.nextInt();
            if (select == 1) {
                System.out.print("Enter your new password = " + input.nextLine());
                String newPassword = input.nextLine();
                if (newPassword.equals("password")) {
                    System.out.print("Your password cannot be the same as your old password. Please enter another password = ");
                    newPassword = input.nextLine();
                    System.out.println("Your password has been successfully changed.");
                }
            } else {
                System.out.print("You have successfully logged out of the system.");
            }
        } else {
            System.out.println("Wrong username and password");
        }
    }
}
