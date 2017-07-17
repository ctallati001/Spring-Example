import org.junit.Test;
import static org.junit.Assert.*;

public class RunTest {
    @Test
    public void RunTest() {
        HelloWorld h = new HelloWorld();
        String str = "Hello ";
        assertEquals(str, h.Hello(str));
    }
//    @Test
//    public void RunFailTest() {
//        HelloWorld h = new HelloWorld();
//        int str = 123;
//        assertNotEquals(str,str);
//    }
}