import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void fibonacci() {
        Assert.assertEquals(2, Application.fibonacci(3));
    }
}
