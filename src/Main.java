import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строчку для проверки IP-адреса ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Pattern p =Pattern.compile("(^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$)");
        Matcher m = p.matcher(input);
        if(m.find())
        {
            System.out.println("Вы ввели IP-адрес");

        }
        else {
            System.out.println("Вы ввели не IP-адрес");
        }
    }
}