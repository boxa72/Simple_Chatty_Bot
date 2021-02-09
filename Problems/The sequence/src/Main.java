import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        int count = number;

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                if (count > 0) {
                    System.out.print(i + " ");
                    count--;
                }

            }
            
        }
    }
}
