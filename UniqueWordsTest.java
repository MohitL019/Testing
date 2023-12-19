//Write a program to find all unique words and their count in paragraphs(big text), 
//create only methods which return the results
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
public class UniqueWordsTest {
    public static void main(String[] args) {
        UniqueWordsTest uwt = new UniqueWordsTest();
        uwt.testCount();
    }
    @Test
    public void testCount(){
        UniqueWords unique = new UniqueWords();
        String s = "Hello I am Mohit I am from satara";
        Map<String, Integer> map = new HashMap<>();
        map.put("satara", 1);
        map.put("Hello", 1);
        map.put("I", 2);
        map.put("from", 1);
        map.put("Mohit", 1);
        map.put("am", 2);
       
        Assert.assertEquals(map, unique.getCount(s));   
    }
}
