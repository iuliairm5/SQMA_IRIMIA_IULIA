package irimiaiulia;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest4 {

    @Test(expected = IllegalArgumentException.class)
    public void doRemainderException() {
        Division div = new Division(5,0);
        div.doRemainder();
    }
}