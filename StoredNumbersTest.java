import org.junit.Assert;
import org.junit.Test;

public class StoredNumbersTest {
    public static void main(String[] args) {

        
    }
    @Test
    public void testMissing(){
        StoredNumbers sn = new StoredNumbers();
        int[] arr = {2,4,1,5,7,8,9,3};
        int a = sn.getMissing(arr);
        Assert.assertEquals(6, a);
    }
}
