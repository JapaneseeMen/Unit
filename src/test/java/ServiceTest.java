import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {

    Service service = new Service();

    @Test
    public void remainFirstTest() {
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void remainSecondTest() {
        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void remainThirdTest() {
        Assert.assertEquals(999, service.remain(1));
    }

    @Test
    public void remainFourthTest() {
        Assert.assertEquals(900, service.remain(100));
    }

    @Test
    public void remainFifthTest() {
        Assert.assertEquals(100, service.remain(900));
    }

    @Test
    public void remainSixthTest() {
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void remainSeventhTest() {
        Assert.assertEquals(500, service.remain(500));
    }
}
    