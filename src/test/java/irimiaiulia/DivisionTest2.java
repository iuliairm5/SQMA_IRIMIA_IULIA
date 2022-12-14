package irimiaiulia;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest2 {

    @Test(expected = IllegalArgumentException.class)
    public void doQuotientException() {
        Division div = new Division(5,0);
        div.doQuotient();
    }
}