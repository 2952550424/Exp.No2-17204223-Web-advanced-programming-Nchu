package webadv.nchu17204223.error;

public class TaskException extends Exception {
	private TaskErrorMessage errorMessage;

	public TaskException(TaskErrorMessage errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public TaskErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public String getMessage() {
		return errorMessage.getMessage();
	}
}
