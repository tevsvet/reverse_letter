import java.util.Scanner;
import static com.pack.Reversal.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = in.nextLine();

        System.out.println(reverseWithoutNumbers(string));
    }
}