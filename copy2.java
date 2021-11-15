import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy2 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fo=null;
        try {
            fis=new FileInputStream("C:\\Users\\xswl\\IdeaProjects\\java-idea\\截屏.jpg");
            fo=new FileOutputStream("D:\\截屏copy");
            byte[] bytes=new byte[10*1024];
            int readCount=0;
            while ((readCount= fis.read(bytes))!=-1){
                fo.write(bytes,0,readCount);
            }
            fo.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fo == null) {
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis == null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
