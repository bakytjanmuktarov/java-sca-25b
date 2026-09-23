import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int t = input.nextInt();

        int distance = v * t;
        int position = (distance % 109 + 109) % 109;

        System.out.println(position);
    }
}