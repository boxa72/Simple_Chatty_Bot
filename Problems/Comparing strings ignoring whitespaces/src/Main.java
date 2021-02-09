
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        String first = reader.nextLine();
        String second = reader.nextLine();
        String newFirst = first.replace(" ", "");
        String newSecond = second.replace(" ", "");
        System.out.println(newFirst.equals(newSecond));
    }
}