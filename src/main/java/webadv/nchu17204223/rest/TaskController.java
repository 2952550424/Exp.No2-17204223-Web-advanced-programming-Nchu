package webadv.nchu17204223.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import webadv.nchu17204223.error.TaskErrorMessage;
import webadv.nchu17204223.error.TaskException;
import webadv.nchu17204223.factory.TaskFactory;

@CrossOrigin
@RestController
@RequestMapping
public class TaskController {

	@Autowired
	private TaskFactory tasks;
	
	@RequestMapping(value = "/task/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Task task(@PathVariable (value="id") int id) throws TaskException {
		try {
			return new Task(id,tasks.get(id-1));
		} catch (Exception e) {
			throw new TaskException(new TaskErrorMessage(404, "不存在该Task"));
		}
    }

}
