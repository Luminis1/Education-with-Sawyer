import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Michaelle on 19.08.2015.
 */
public class Solution1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String inputData = reader.readLine();
        char[] numbers = inputData.toCharArray();

        String b2;
        String d;


        for (int i = 0; i < numbers.length; i++) {
            String a1 = Character.toString(numbers[i]);
            String a2 = a2 + a1;
        }
    }

        //double a = Double.parseDouble(a2);
        //double b = Double.parseDouble(b2);

        /*double a = Double.parseDouble(reader.readLine());
        String d = reader.readLine();
        double b = Double.parseDouble(reader.readLine());
        double result = 0;*/


       /* if (d.equals("+")) {
            result = method1(a, b);}
            else {if (d.equals("-")) {
                result = method2(a, b);}
            else {if (d.equals("*")) {
                result = method3(a, b);}
            else {if (d.equals("/")) {
                result = method4(a, b);}
                }
            }
        }
            System.out.println(result);
    }


    public static double method1 (double a, double b) {

        return a + b;
    }
    public static double method2 (double a, double b) {

        return a - b;
    }
    public static double method3(double a, double b) {

        return a * b;
    }
    public static double method4(double a, double b) {

        return a / b;
    }
    */
}
