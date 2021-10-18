package 异常处理编程题;

public class AgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4429570624681375151L;
	public AgeException() {
		//调用父类的构造方法，将年龄超过范围复制给父类的message变量
		super("年龄超过范围");
	}
	public AgeException(String message) {
		//调用父类的构造方法，将message传递给父类的message变量
		super(message);
	}
}