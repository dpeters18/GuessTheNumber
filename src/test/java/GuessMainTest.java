import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class GuessMainTest {
    @Test
    void Parseable(){
        assertEquals("The line typed was not a number between 1 and 20.", GuessMain.Parseable("e"), "Yeah, no.");
        assertEquals("The line typed was not a number between 1 and 20.", GuessMain.Parseable(null), "Yeah, no.");
        assertEquals(2, GuessMain.Parseable("2"), "Yeah, no.");
        assertEquals(13, GuessMain.Parseable("13"), "Yeah, no.");
    }
    @Test
    void yesOrNo(){
        assertEquals("y",GuessMain.yesOrNo("y"),"Yeah, no.");
        assertEquals("n",GuessMain.yesOrNo("n"),"Yeah, no.");
        assertEquals(0,GuessMain.yesOrNo("234"),"Yeah, no.");
        assertEquals(0,GuessMain.yesOrNo(""),"Yeah, no.");
        assertEquals(0,GuessMain.yesOrNo("e"),"Yeah, no.");
    }
    @Test
    void rando(){
        assertTrue(21>GuessMain.rando()&&GuessMain.rando()>0);
        assertTrue(21>GuessMain.rando()&&GuessMain.rando()>0);
        assertTrue(21>GuessMain.rando()&&GuessMain.rando()>0);
        assertTrue(21>GuessMain.rando()&&GuessMain.rando()>0);
        assertTrue(21>GuessMain.rando()&&GuessMain.rando()>0);
    }
}
