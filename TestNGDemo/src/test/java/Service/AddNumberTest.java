package Service;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Service.AddNumber.addNum;
import static org.testng.Assert.*;

/**
 * Created by lishuode on 16/6/26.
 */
public class AddNumberTest {
    @Parameters({"a","b"})
    @Test
    public void testAddNum(String a ,String b) throws Exception {

        Assert.assertEquals(9,addNum(a,b));

        System.out.println("add number : " + addNum(a,b));

    }

}