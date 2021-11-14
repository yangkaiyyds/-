package copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy1 {
public static void main(String[] args) {
	FileInputStream fis=null;
	FileOutputStream fos=null;
	try {
		fis=new FileInputStream("C:\\Users\\xswl\\eclipse-workspace\\½ØÆÁ.jpg");
		fos=new FileOutputStream("D\\½ØÆÁ.jpg");
		byte[] bytes=new byte[10*1024];
		int readCount=0;
		while((readCount=fis.read(bytes))!=-1) {
			fos.write(bytes, 0, readCount);
		}
		fos.flush();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		if(fis !=null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}if(fos !=null) {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
