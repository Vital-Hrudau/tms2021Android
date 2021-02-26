import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextFormater textFormater = new TextFormater();
        try {
            System.out.println("Введите строку:");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            FileOutputStream fos = new FileOutputStream("D://tms2021Android1//Lesson9//string.txt");
            s = new StringBuilder(s).reverse().toString();
            byte[] bytes = s.getBytes();
            fos.write(bytes, 0, bytes.length);

            textFormater.readFile();
            textFormater.splitText();
            textFormater.chooseFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

