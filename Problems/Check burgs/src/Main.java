import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String city = reader.nextLine();
        System.out.println(city.endsWith("burg"));
    }
}