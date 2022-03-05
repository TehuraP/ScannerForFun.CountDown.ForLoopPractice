import java.util.Scanner;

public class SFF2 {
    public static void main(String[] args) {

        Scanner whatComputerSays = new Scanner(System.in);
        System.out.println("From 1 to 10, how nice am I?");

        String whatIsay = whatComputerSays.next();

        while (!whatIsay.equals("0")) {
            if (whatIsay.equals("1") || whatIsay.equals("2")) {
                System.out.println("Well, that's not so nice");
                whatIsay = whatComputerSays.next();
            } else if (whatIsay.equals("3") || whatIsay.equals("4")) {
                System.out.println("Well, it could be worse");
                whatIsay = whatComputerSays.next();
            } else if (whatIsay.equals("5") || whatIsay.equals("6")) {
                System.out.println("Well, thanks!");
                whatIsay = whatComputerSays.next();
            } else if (whatIsay.equals("7") || whatIsay.equals("8")) {
                System.out.println("Hey, that's great!");
                whatIsay = whatComputerSays.next();
            } else if (whatIsay.equals("9") || whatIsay.equals("10")) {
                System.out.println("I fookin knew it!");
                whatIsay = whatComputerSays.next();
            } else {
                System.out.println("that's not what I asked");
                whatIsay = whatComputerSays.next();

            }
        }
        System.out.println("well, fuck you too");

        whatComputerSays.close();
    }
}