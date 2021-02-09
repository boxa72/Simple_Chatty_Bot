import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int result = 0;

        for (int i = a; i <= b; i++) {
            result += i;
        }
        System.out.println(result);
    }
}