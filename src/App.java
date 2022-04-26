import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        var s = "Hello, World!";
        // Initiaize new StringBuilder object
        StringBuilder stringBuilder = new StringBuilder(s);
        // Implement reverse method, assign value to variable 'result'
        var result = stringBuilder.reverse();

        char[] sArray = s.toCharArray();

        var sArrayList = new ArrayList<Character>();
        var yarraS = new char[s.length()];
        // reverse order of ArrayList
        for (int i = 0; i < sArray.length; i++) {
            yarraS[i] = sArray[sArray.length - i - 1];
            // sArrayList.add(i, sArray[sArray.length - i - 1]);
        }

        // convert ArrayList to String
        String newArrayString = new String(yarraS);

        System.out.println(newArrayString);

        // Arrays.toArray(yarraS);

        // StringBuilder Result
        System.out.println(result);

        // result of for-loop-reverse-array method
        System.out.println(yarraS);

    }
}
