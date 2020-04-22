package webadv.nchu17204223.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import webadv.nchu17204223.rest.Task;

@Component
public class TaskFactory {
	public List<Task> getAll() {
		List<Task> list = new ArrayList<Task>();
		Task task1 = new Task(1, "描述1");
		Task task2 = new Task(2, "描述2");
		Task task3 = new Task(3, "描述3");
		Task task4 = new Task(4, "描述4");
		Task task5 = new Task(5, "描述5");
		Task task6 = new Task(6, "jQuery是一个快速、简洁的JavaScript框架，是继Prototype之后又一个优秀的JavaScript代码库（或JavaScript框架）。jQuery设计的宗旨是“write Less, Do More”，即倡导写更少的代码，做更多的事情。");
		list.add(task1);
		list.add(task2);
		list.add(task3);
		list.add(task4);
		list.add(task5);
		list.add(task6);
		return list;
	}
	
	public String get(int id) {
		List<Task> tasks = getAll();
		return tasks.get(id).getString();
	}
}
