package 模拟读写数据;

public class TestReadSaveData {
public static void main(String[] args) {
	//往文本文件保存数据
	BusinessA businessA=new BusinessA(new ReadSaveTextFile());
	businessA.saveData("保存到文本文件中");
	BusinessB businessB=new BusinessB(new ReadSaveWordFile());
	businessB.saveData("保存到Word文件中");
}
}
