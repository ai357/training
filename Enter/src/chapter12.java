import java.util.*;

public class chapter12 {

public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello" + name);
        if (name.equals("Java")) {
            System.out.println("Welcome");
        } else if (name.equals("JAVA")){
            System.out.println("Good");
        } else {
            System.out.println("Good morning");
        }
    
    

        String greeting = "Hello paiza";
        for (int i = 0; i < 4; i++) {
            System.out.println(greeting);
        }

        Scanner scann = new Scanner(System.in);
        int count = scann.nextInt();
        System.out.println(count);

        for (int i = 0; i < count; i++){
            System.out.println("Hello paiza");
        }
}
}