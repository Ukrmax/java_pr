import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        String str1 = bufferedReader.readLine();

        if (str.length() < 2 || str1.length() < 2) {
            System.out.println("String should have at least length 2");
        }
            System.out.println(str.substring(1) + " " + str1);
    }
}
