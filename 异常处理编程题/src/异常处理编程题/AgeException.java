package �쳣��������;

public class AgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4429570624681375151L;
	public AgeException() {
		//���ø���Ĺ��췽���������䳬����Χ���Ƹ������message����
		super("���䳬����Χ");
	}
	public AgeException(String message) {
		//���ø���Ĺ��췽������message���ݸ������message����
		super(message);
	}
}