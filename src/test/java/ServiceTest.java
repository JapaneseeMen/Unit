import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;
public class ServiceTest {

        Service service = new Service();
        @Test
        public void remainFirstTest() {
            Assert.assertEquals(service.remain(1000), 0);
        }
        @Test
        public void remainSecondTest() {
            Assert.assertEquals(service.remain(0), 1000);
        }

        @Test
        public void remainThirdTest() {
            Assert.assertEquals(service.remain(1), 999);
        }

        @Test
        public void remainFourthTest() {
            Assert.assertEquals(service.remain(100), 900);
        }

        @Test
        public void remainFifthTest() {
            Assert.assertEquals(service.remain(900), 100);
        }

        @Test
        public void remainSixthTest() {
            Assert.assertEquals(service.remain(999), 1);
        }

        @Test
        public void remainSeventhTest() {
            Assert.assertEquals(service.remain(500), 500);
        }


    }