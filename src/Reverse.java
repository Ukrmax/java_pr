import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        String[] arr = str.split("");
        String[] res = new String[arr.length];

        for (int j = 0, i = arr.length - 1; i >= 0; i--, j++) {
            res[j] = arr[i];
        }

        String reversedStr = String.join("", res);
        System.out.println(reversedStr);

    }

}
