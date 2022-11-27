import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ip-адрес: ");
        String ip = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]))$");
        Matcher matcher = pattern.matcher(ip);
        if (matcher.find() == true) {
            System.out.println("Вы ввели валидный ip-адрес: " + ip);
        } else {
            System.out.println("Вы ввели какую-то хуйню");
        }
    }
}