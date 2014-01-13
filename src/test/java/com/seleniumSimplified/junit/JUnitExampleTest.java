package com.seleniumSimplified.junit;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by meads on 09/12/2013.
 */
public class JUnitExampleTest {

    @Test

    public void twoPlusTwoEqualsFour(){

        assertEquals("2+2=4", 4, 2 + 2);
    }

}

