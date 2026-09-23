import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
        int x = (a * 100 + b) * n;
        int rb = x / 100;
        int k = x % 100;
        System.out.println(rb + " " + k);
    }
}