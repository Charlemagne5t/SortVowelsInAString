import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void sortVowelsTest1(){
        String s = "lEetcOde";
        String expected = "lEOtcede";
        String actual = new Solution().sortVowels(s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortVowelsTest2(){
        String s = "lYmpH";
        String expected = "lYmpH";
        String actual = new Solution().sortVowels(s);

        Assert.assertEquals(expected, actual);
    }
}
