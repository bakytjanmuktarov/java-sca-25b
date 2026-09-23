import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int z = n % 1440;
        int x= ((z / 60) + 24) % 24;
        int c = (z % 60 + 60) % 60;

        System.out.println(x + " " + c);
    }
}