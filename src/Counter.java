import static java.awt.SystemColor.text;

public class Counter {

    private int theRows;

    private int theSigns;

    private int theWords;

    public Counter() {

        theSigns = 0;
        theRows = 0;
        theWords = 0;


    }

    public void setText(String input1) {
        theRows = theRows + 1;
        theSigns = theSigns + input1.length();
    }

    public int getRowCount() {
        return theRows;
    }


    public int getSignCount() {
        return theSigns;
    }

    }

