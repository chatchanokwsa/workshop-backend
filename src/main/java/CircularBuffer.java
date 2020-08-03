public class CircularBuffer {
    private int bufferSize = 10;
    private String[] buffer = new String[10];
    private int readPointer;
    private int writePointer;

    public CircularBuffer() {
        this.buffer = new String[10];
    }

    public boolean isEmpty() {
        return true;
    }

    public void writeData(String input) {
        bufferSize--;
        this.buffer[writePointer++] = input;

    }

    public boolean isFull() {
        return bufferSize ==0;
    }


    public String readData() {
        return this.buffer[readPointer++];
    }
}
