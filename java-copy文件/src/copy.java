import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("C:\\Users\\xswl\\IdeaProjects\\java---idea\\截屏.jpg");
            fos=new FileOutputStream("D:\\截屏copy文件");
            byte[] bytes=new byte[10*1024];
            int ReadCount=0;
            while((ReadCount= fis.read(bytes))!=-1){
                fos.write(bytes,0,ReadCount);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos == null) {
                try {
                    fos.close();
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
