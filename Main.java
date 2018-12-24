package Test;

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User user = new User();

        System.out.println("Введите логин");
        user.setNickName(in.nextLine());
        System.out.println("Введите пароль");
        user.setPassword(in.nextLine());
        System.out.println("Введите имя");
        user.setFirstName(in.nextLine());
        System.out.println("Введите фамилию");
        user.setSecondName(in.nextLine());
        System.out.println("Введите отчество");
        user.setFatherName(in.nextLine());
        System.out.println("Введите email");
        user.setEmail(in.nextLine());
        System.out.println("Введите телефон");
        user.setPhoneNumber(in.nextLine());

        System.out.println("Желаете удалить или изменить данные?");
        String answer;
        answer = in.nextLine();
        if (answer.equals("да") || answer.equals("Да")) {
            int x = 1;

            while (x != 0) {
                System.out.println("Что желаете сделать?");
                String answer2;
                answer2 = in.nextLine();

                switch (answer2.toLowerCase()) {
                    case "удалить": {
                        System.out.println("Что хотите удалить?");
                        String answer3 = in.nextLine();
                        switch (answer3.toLowerCase()) {
                            case "имя":
                                user.deleteFirstName();
                                break;
                            case "фамилию":
                                user.deleteSecondName();
                                break;
                            case "отчество":
                                user.deleteFatherName();
                                break;
                            case "email":
                                user.deleteEmail();
                                break;
                            case "телефон":
                                user.deletePhoneNumber();
                                break;
                            default:
                                System.out.println("Таких данных нет");
                        }
                        break;
                    }
                    case "изменить": {
                        System.out.println("Что хотите изменить?");
                        String answer3 = in.nextLine();
                        switch (answer3.toLowerCase()) {
                            case "имя":
                                System.out.println("Введите имя");
                                user.changeFirstName(in.nextLine());
                                break;
                            case "фамилию":
                                System.out.println("Введите фамилию");
                                user.changeSecondName(in.nextLine());
                                break;
                            case "отчество":
                                System.out.println("Введите отчество");
                                user.changeFatherName(in.nextLine());
                                break;
                            case "email":
                                System.out.println("Введите email");
                                user.changeEmail(in.nextLine());
                                break;
                            case "телефон":
                                System.out.println("Введите номер телефона");
                                user.changePhoneNumber(in.nextLine());
                                break;
                            default:
                                System.out.println("Таких данных");
                        }
                        break;
                    }
                    default:
                        System.out.println("Такая функция не предусмотрена");
                }

                System.out.println("Хотите дальше изменить данные?");
                if (in.nextLine().equals("нет")) {
                    x = 0;
                }
            }

            //Переопределяем класс у user
            User admin = new Admin();

        }
    }
}
