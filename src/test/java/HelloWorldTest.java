import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void sayHi_should_return_Hello_World() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World",result);
    }

    @Test
    public void sayHi_with_grace_should_return_Hello_Grace() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("Grace");
        assertEquals("Hello Grace",result);
    }

    @Test
    public void sayHi_with_chatchanok_should_return_Hello_chatchanok() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("chatchanok");
        assertEquals("Hello chatchanok",result);
    }


}