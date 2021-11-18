import org.junit.Assert;
import org.junit.Test;

public class ArabicNumberConverterUT {
    @Test
    public void itShouldReturn1_GivenI(){
        Assert.assertEquals(1, RomanNumberConverter.toArabic("I"));
    }
}
