import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterUT {
    @Test
    public void itShouldReturnI_Given1(){
        Assert.assertEquals("I", RomanNumberConverter.toRoman(1));
    }
    @Test

    public void itShouldReturnII_Given2() {
        Assert.assertEquals("II", RomanNumberConverter.toRoman(2));
    }
    @Test
    public void itShouldReturnIII_Given3() {
        Assert.assertEquals("III", RomanNumberConverter.toRoman(3));
    }
    @Test
    public void itShouldReturnV_Given5(){
        Assert.assertEquals("V", RomanNumberConverter.toRoman(5));
    }
    @Test
    public void itShouldReturnVIAndVII_Given6And7(){
        Assert.assertEquals("VI", RomanNumberConverter.toRoman(6));
        Assert.assertEquals("VII", RomanNumberConverter.toRoman(7));
    }
    @Test
    public void itShouldReturnX_Given10(){
        Assert.assertEquals("X", RomanNumberConverter.toRoman(10));
    }
    @Test
    public void itShouldReturnXX_Given20(){
        Assert.assertEquals("XX", RomanNumberConverter.toRoman(20));
    }
    @Test
    public void itShouldReturnIV_Given4(){
        Assert.assertEquals("IV", RomanNumberConverter.toRoman(4));
    }
    @Test
    public void itShouldReturnIX_Given9(){
        Assert.assertEquals("IX", RomanNumberConverter.toRoman(9));
    }
}
