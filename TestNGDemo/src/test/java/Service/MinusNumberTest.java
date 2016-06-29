package Service;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Service.MinusNumber.minusNum;
import static org.testng.Assert.*;

/**
 * Created by lishuode on 16/6/26.
 */
public class MinusNumberTest {
    @Parameters({"a","b"})
    @Test
    public void testMinusNum(String a ,String b) throws Exception {

//        Assert.assertEquals(2,minusNum());

        System.out.println("minus number : " +minusNum(a,b));

    }

}