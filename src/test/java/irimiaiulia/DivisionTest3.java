package irimiaiulia;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest3 {

    @Test
    public void doRemainder() {
        Division div = new Division(5,2);
        assertEquals(1,div.doRemainder());
    }
}