package webadv.nchu17204223.rest;

public class Task {

	private int id;
	private String string;

	public Task() {
		super();
	}
	
	public Task(int id, String string) {
		super();
		this.id = id;
		this.string = string;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
