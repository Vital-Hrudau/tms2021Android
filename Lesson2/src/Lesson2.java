import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2 {


    public static void main(String[] args) throws IOException {
        System.out.println(sum(10, 20));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(50, 49));
        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse());
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double average(int[] array) {
        int sum = 0;
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            result = sum / array.length;
        }
        return result;
    }

    public static int max(int[] array) {
        int imax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > imax) {
                imax = array[i];
            }
        }
        return imax;
    }

    public static double calculateHypotenuse() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write first int:");
        double int1 = Double.parseDouble(reader.readLine());
        System.out.println("Write second int:");
        double int2 = Double.parseDouble(reader.readLine());
        double hypotenuse = (int1 * int1) + (int2 * int2);
        return Math.sqrt(hypotenuse);
    }
}
