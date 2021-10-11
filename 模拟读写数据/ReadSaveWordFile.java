package 模拟读写数据;

public class ReadSaveWordFile implements IReadSaveData{
public void saveData(String data) {
	System.out.println("将数据保存到了Word文件中");
}
public String getData() {
	System.out.println("从Word文件中读取了数据");
return null;	
}
}
