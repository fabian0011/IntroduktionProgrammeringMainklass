import java.lang.constant.Constable;
import java.util.Scanner;

public class Del2 {
    public static void main(String[] args) {

        System.out.println("Write something");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        Counter textCounter = new Counter();


        while (!(text.equals("stop") || text.equals("Stop"))) {
            textCounter.setText(text);
            System.out.println("write something again");
            text = scan.nextLine();

        }

        System.out.println("you have written " + textCounter.getRowCount() + " rows total " + "and " + textCounter.getSignCount() +
                " characters.");

    }
}

