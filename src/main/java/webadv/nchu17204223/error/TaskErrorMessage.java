package webadv.nchu17204223.error;

public class TaskErrorMessage {
	private int code;
	private String message;

	public TaskErrorMessage(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
