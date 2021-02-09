import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        System.out.println(word.toUpperCase().charAt(0) == 'J');
    }
}