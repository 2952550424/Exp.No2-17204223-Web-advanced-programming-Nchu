package webadv.nchu17204223.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TaskExceptionHandler {
	@ExceptionHandler(TaskException.class)
	public ResponseEntity<TaskErrorMessage> handlePetClinicException(TaskException ex){
		return new ResponseEntity<>(ex.getErrorMessage(), HttpStatus.BAD_REQUEST);
	}
}
