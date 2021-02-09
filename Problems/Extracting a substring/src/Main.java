import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(word.substring(num1, num2 + 1));
    }
}