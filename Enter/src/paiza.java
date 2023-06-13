// Java練習
/*
 * 行をまたいでコメント
 */

import java.util.*;  //文字をimportするためのもの

public class paiza {
    public static void main(String[] args) {
        System.out.println("Hello world"); //同じ行にもコメントできる
        System.out.println("Hello paiza");
        System.out.println("世界の皆さん、こんにちは");
        System.out.println(100 + 30);
        System.out.println(100 / 30);
        System.out.println((100 + 3) * 3);
        String greeting = "Hello world";
        System.out.println(greeting);

        int num = 100;
        System.out.println(num);

        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        System.out.println("HEllo" + text);
        String main = scan.next();
        System.out.println(main);

        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        System.out.println(number * 10);

        Scanner scannn = new Scanner(System.in);
        int number1 = scannn.nextInt();
        System.out.println(number1);

        if (number == 10) {
            System.out.println("10");
        } else if (number > 10) {
            System.out.println("Good morning");
        } else {
            System.out.println("Goodbye");
        }

        

    }
}

