import org.junit.Assert;
import org.junit.Test;

public class ArabicNumberConverterUT {
    @Test
    public void itShouldReturn1_GivenI(){
        Assert.assertEquals(1, RomanNumberConverter.toArabic("I"));
    }
    @Test
    public void itShouldReturn2_GivenII(){
        Assert.assertEquals(2, RomanNumberConverter.toArabic("II"));
    }
    @Test
    public void itShouldReturn3_GivenIII(){
        Assert.assertEquals(3, RomanNumberConverter.toArabic("III"));
    }
    @Test
    public void itShouldReturn5_GivenV(){
        Assert.assertEquals(5, RomanNumberConverter.toArabic("V"));
    }
}
