package IO;

import java.io.Serializable;

class student implements Serializable {
	
	int id;
	String name;
	String state;
	
	//private static final long serialVersionUID = 1L;
	
	public student(int id, String name, String state) {
		this.id = id;
		this.name = name;
		this.state = state;
	}

	public student() {
		super();
		
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", state=" + state + "]";
	}
	
		
	
	
	
}
