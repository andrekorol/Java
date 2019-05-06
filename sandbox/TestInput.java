import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TestInput {
    public static void main(String[] args) {
        final List<String> inputs = new ArrayList<String>();
        final Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("> ");
            inputs.add(in.next());
        }
        System.out.println(inputs);
    }
}
