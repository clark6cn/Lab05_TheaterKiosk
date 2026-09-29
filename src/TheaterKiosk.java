import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";
        System.out.println("How old are you?");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();
            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("You entered an invalid age: " + trash);
        }
    }
}
