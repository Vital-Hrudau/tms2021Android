import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class TextFormater implements Reader {
    String str;
    String[] words;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;

    @Override
    public void readFile() {
        try {
            String filename;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название файла (text.txt):");
            filename = scanner.nextLine();
            FileReader fileReader = new FileReader("D://tms2021Android1//Lesson9//" + filename);
            char[] buf = new char[256];
            int i;
            while ((i = fileReader.read(buf)) > 0) {
                if (i < 256) {
                    buf = Arrays.copyOf(buf, i);
                }
                str = new String(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void splitText() {
        count1 = 0;
        count2 = 0;
        count3 = 0;
        int sumsentence = 0; // кол-во предложений
        words = str.split("\\.");
        for (int i = 0; i < words.length; i++) {
            sumsentence++;
        }
        System.out.println("Кол-во предложений: " + sumsentence);
        for (String subStr : words) {
            System.out.println(subStr);
        }
    }

    public void chooseFile() throws IOException {
        try {
            System.out.println("Идет запись в файл нужных срок...");
            String[] s;
            File newText = new File("D://tms2021Android1//Lesson9//newText.txt");
            FileOutputStream fos = new FileOutputStream(newText);
            for (int b = 0; b < words.length; b++) {
                s = words[b].split(" ");
                for (int c = 0; c < s.length; c++) {
                    if (s[c].equals(new StringBuilder((s[c])).reverse().toString())) {
                        byte[] bytes = words[b].getBytes();
                        fos.write(bytes, 0, bytes.length);
                    } else if (s.length > 2 && s.length < 6) {
                        byte[] bytes = words[b].getBytes();
                        fos.write(bytes, 0, bytes.length);
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
