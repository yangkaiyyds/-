package 缓冲;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputTest {
    public static void main(String[] args) throws Exception {
        ObjectInputTest test=new ObjectInputTest();
        System.out.println(((Employee) test.ReadObj()).getName());
    }
    public Object ReadObj() throws Exception {
        FileInputStream fi=null;
        ObjectInputStream ois=null;
        Object obj=null;
        fi=new FileInputStream("D:\\obj.ini");
        ois=new ObjectInputStream(fi);
        obj = ois.readObject();
        ois.close();
        fi.close();
        return obj;
    }
}
