import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class CounterTest {

    @Test
    public void testCountRows() {

        Counter myRows = new Counter();

        int expected = 0;
        int acutal = myRows.getRowCount();

        assertEquals(expected, acutal);

    }

    @Test
    public void testCountRows2() {
        Counter textCounter = new Counter();

        textCounter.setText("Hejsan");
        int expected = 1;
        int acutal = textCounter.getRowCount();

        assertEquals(expected, acutal);
    }

    @Test
    public void testCountRows3() {


        Counter textCounter = new Counter();

        textCounter.setText("Hejsan");
        textCounter.setText("hej");
        int expected = 2;
        int acutal = textCounter.getRowCount();

        assertEquals(expected, acutal);

    }
    @Test
    public void testCountSigs() {
        //Arrange
        Counter textCounter = new Counter();
        //Act
        textCounter.setText("Hejsan");
        int expected = 6;
        int acutal = textCounter.getSignCount();
        //Assert
        assertEquals(expected, acutal);

    }
}