import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите кол-во IP-адресов");
        Scanner n1 = new Scanner(System.in);
        int n = n1.nextInt();
        System.out.println("Введите строчку для проверки IP-адреса ");
        Scanner in = new Scanner(System.in);
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = in.nextLine();
        }
        String sample = "^((25[0-5]|2[0-4][0-9]|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4][0-9]|1\\d\\d|[1-9]?\\d)$";
        Pattern pattern = Pattern.compile(sample);
        System.out.println("Найденные IP-адреса");
        for (String Sample : input) {
            Matcher mat = pattern.matcher(Sample);
            if(mat.matches()){
                System.out.println(Sample);
            }
        }
    }
}