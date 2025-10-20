import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void sleepIn() {
        CodingBat cb = new CodingBat();
        assertEquals(true, cb.sleepIn(false, false));
        assertEquals(false, cb.sleepIn(true, false));
        assertEquals(true, cb.sleepIn(false, true));
        assertEquals(true, cb.sleepIn(true, true));
    }

    @org.junit.Test
    public void monkeyTrouble() {
        CodingBat cb = new CodingBat();
        assertEquals(true, cb.monkeyTrouble(true, true));
        assertEquals(true, cb.monkeyTrouble(false, false));
        assertEquals(false, cb.monkeyTrouble(true, false));
        assertEquals(false, cb.monkeyTrouble(false, true));
    }

    @org.junit.Test
    public void countEvens() {
        CodingBat cb = new CodingBat();
        assertEquals(3,  cb.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3,  cb.countEvens(new int[]{2, 2, 0}));
        assertEquals(0,  cb.countEvens(new int[]{1, 3, 5}));
        assertEquals(0,  cb.countEvens(new int[]{}));
        assertEquals(1,  cb.countEvens(new int[]{11, 9, 0, 1}));
        assertEquals(2,  cb.countEvens(new int[]{2, 11, 9, 0}));
        assertEquals(1,  cb.countEvens(new int[]{2}));
        assertEquals(2,  cb.countEvens(new int[]{2, 5, 12}));
    }

    @org.junit.Test
    public void helloName() {
        CodingBat cb = new CodingBat();
        assertEquals("Hello Bob!",  cb.helloName("Bob"));
    }
}