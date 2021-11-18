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
    @Test
    public void itShouldReturn6_givenVI(){
        Assert.assertEquals(6, RomanNumberConverter.toArabic("VI"));
    }
    @Test
    public void itShouldReturn7_givenVII(){
        Assert.assertEquals(7, RomanNumberConverter.toArabic("VII"));
    }
    @Test
    public void itShouldReturn8_givenVIII(){
        Assert.assertEquals(8, RomanNumberConverter.toArabic("VIII"));
    }
    @Test
    public void itShouldReturn10_givenX(){
        Assert.assertEquals(10, RomanNumberConverter.toArabic("X"));
    }
    @Test
    public void itShouldReturn15_givenXV(){
        Assert.assertEquals(15, RomanNumberConverter.toArabic("XV"));
    }
    @Test
    public void itShouldReturn4_givenIV(){
        Assert.assertEquals(4, RomanNumberConverter.toArabic("IV"));
    }
    @Test
    public void itShouldReturn9_givenIX(){
        Assert.assertEquals(9, RomanNumberConverter.toArabic("IX"));
    }
}
