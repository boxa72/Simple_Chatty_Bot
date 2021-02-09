import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int busHeight = reader.nextInt();
        int numBridges = reader.nextInt();
        boolean crash = true;

        for (int i = 1; i < numBridges; i++) {
            int bridgeHeight = reader.nextInt();
            if (bridgeHeight <= busHeight) {
                crash = false;
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }
        if (crash) {
            System.out.println("Will not crash");
        }
    }
}