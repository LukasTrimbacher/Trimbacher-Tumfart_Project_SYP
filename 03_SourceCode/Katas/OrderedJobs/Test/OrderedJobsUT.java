import org.junit.Assert;
import org.junit.Test;

public class OrderedJobsUT {
    @Test
    public void itShouldReturnA_GivenA(){
        //arrange
        var sut = new JobsScheduler();
        sut.registerJob("A");
        //act
        sut.sort();
        //assert
        Assert.assertEquals("A", sut.getList());
    }

    @Test
    public void itShouldReturnAB_GivenAB(){
        // arrange
        var sut = new JobsScheduler();
        sut.registerJob("A");
        sut.registerJob("B");
        // act
        sut.sort();
        // assert
        Assert.assertEquals("AB", sut.getList());
    }
    @Test
    public void itShouldReturnABC_GivenABC(){
        // arrange
        var sut = new JobsScheduler();
        sut.registerJob("A");
        sut.registerJob("B");
        sut.registerJob("C");
        // act
        sut.sort();
        // assert
        Assert.assertEquals("ABC", sut.getList());
    }

    @Test
    public void itShouldReturnAB_GivenBDependsOnA() {
        // arrange
        var sut = new JobsScheduler();
        sut.registerJob("B", "A");
        // act
        sut.sort();
        // assert
        Assert.assertEquals("AB", sut.getList());
    }

    @Test
    public void itShouldReturnABC_GivenC_Depends_ON_B_And_B_Depends_ON_A(){
        // arrange
        var sut = new JobsScheduler();
        sut.registerJob("B","A");
        sut.registerJob("C", "B");

        // act
        sut.sort();

        // assert
        Assert.assertEquals("ABC", sut.getList());
    }

    @Test
    public void itShouldReturnAB_GivenABB() {
        // arrange
        var sut = new JobsScheduler();
        sut.registerJob("A");
        sut.registerJob("B");
        sut.registerJob("B");
        // act
        sut.sort();
        // assert
        Assert.assertEquals("AB", sut.getList());
    }

    @Test
    public void itShouldReturnABC_GivenB_Depends_ON_A_And_C_Depends_ON_B(){
        // arrange
        var sut = new JobsScheduler();
        sut.registerJob("C","B");
        sut.registerJob("B", "A");

        // act
        sut.sort();

        // assert
        Assert.assertEquals("ABC", sut.getList());
    }
    @Test
    public void itShouldReturnABCD_GivenB_Depends_ON_A_And_C_Depends_ON_B_And_D_Depends_On_C(){
        // arrange
        var sut = new JobsScheduler();
        sut.registerJob("C","B");
        sut.registerJob("B", "A");
        sut.registerJob("D", "C");

        // act
        sut.sort();

        // assert
        Assert.assertEquals("ABCD", sut.getList());
    }


    @Test
    public void itShouldReturnBA_GivenBA() {
        // arrange
        var sut = new JobsScheduler();
        sut.registerJob("B");
        sut.registerJob("A");
        // act
        sut.sort();
        // assert
        Assert.assertEquals("BA", sut.getList());
    }
}
