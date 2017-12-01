package NN0414;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class test1Test {
    @Test
    public void equals() throws Exception {
        test1 test2 = new test1(2);
        boolean result = test2.equals(1);
        Assert.assertEquals(false,result);
    }

}
