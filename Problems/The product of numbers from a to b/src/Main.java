import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        long result = a;

        for (int i = a + 1; i < b; i++) {
            result *= i;
            //long test = result;  # Testing purposes
            //System.out.println(test);
        }
        System.out.println(result);
    }
}