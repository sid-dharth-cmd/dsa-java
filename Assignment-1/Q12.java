import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        // Read all lines until input ends
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            lines.add(line);
        }

        // Print in reverse order
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }

        sc.close();
    }
}