import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TruVerification {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.length() <= 1) {
            System.out.println("The string shouldn't be empty");
        } else {
            System.out.println(searchForString(str));
        }
    }

    public static boolean searchForString(String string) {
        char[] chars = string.toCharArray();

        if (chars[0] == 121) {
            return false;
        } else if (chars[chars.length - 1] == 121) {
            return true;
        }
        return false;
    }
}
