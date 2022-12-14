package irimiaiulia;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest1 {

    @Test
    public void doQuotient() {
        Division div = new Division(5,2);
        assertEquals(2,div.doQuotient());

}
}