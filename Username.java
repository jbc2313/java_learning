import java.util.Scanner;

public class Username {
    public String Uname;
    Scanner userObj = new Scanner(System.in);

    public Username() {
       System.out.println("Enter your username:");
       String username = userObj.nextLine();
       Uname = username;
    }


    public void Hi() {
        System.out.println("The username is: " + this.Uname);

    }
}
