/**
 * Created by Paolo T. Inocencion on 09/06/17.
 */
public class TestMemoryCell {
    public static void main(String[] args) {
        MemoryCell m = new MemoryCell();
        m.write("37");
        String val = (String) m.read();
        System.out.println("Contents are: " + val);
    }

    // MemoryCell class
    // Object read( ) --> Returns the stored value
    // void write( Object x ) --> x is stored

}