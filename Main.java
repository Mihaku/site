package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User user = new User();

        System.out.println("Введите логин");
        user.setNickName(in.nextLine());
        System.out.println("Введите пароль");
        user.setPassword(in.nextLine());

        //Переопределяем класс у user
        User admin = new Admin();

    }
}
