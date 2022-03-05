import java.util.Scanner;

public class ScannerTry {
    public static void main(String[] args) {
        java.util.Scanner goodBoy = new java.util.Scanner(System.in);
        System.out.println("tell me I am a good boy");
        String compliment = goodBoy.next();
        System.out.println("thanks :D");
        goodBoy.close();
    }
}
