package authentication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class signup extends signin {

    public String[] asignup(HashSet<user> users){
        boolean flag=true;
        Scanner input=new Scanner(System.in);
        System.out.println("signup");
        System.out.println("Enter username");
        String username=input.next();
        for (authentication.user user : users) {
            if (username.equals(user.getUsername())) {
                flag = false;
                break;
            }
        }
        if(flag){

            System.out.println("Enter Password");
            String password=input.next();
            System.out.println("Enter Data");
            String data=input.next();
            return new String[]{username,password,data};
        }
        else{
            System.out.println("user already exist so login");
            return new String[]{""};
        }



    }
}
