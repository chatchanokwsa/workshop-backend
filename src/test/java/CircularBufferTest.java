import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    @Test
    public void create_new_buffer_should_empty() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue(result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        CircularBuffer cb = new CircularBuffer();
        for (int i = 0; i < 10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue(result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void create_new_buffer_should_full() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isFull();
        assertTrue(!result);
    }

    @Test
    public void write_A_to_buffer_should_read_A() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        assertEquals("A", cb.readData());
    }

    @Test
    public void write_A_B_C_to_buffer_should_read_A_B_C() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
        assertEquals("C", cb.readData());
    }

    @Test
    public void write_A_B_C_D_to_buffer_should_read_A_B_C_D() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        cb.writeData("D");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
        assertEquals("C", cb.readData());
        assertEquals("D", cb.readData());
    }

    @Test
    public void write_A_B_C_D_E_to_buffer_should_read_A_B_C_D_E() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        cb.writeData("D");
        cb.writeData("E");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
        assertEquals("C", cb.readData());
        assertEquals("D", cb.readData());
        assertEquals("E", cb.readData());
    }

}