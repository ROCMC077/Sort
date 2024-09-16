package pojo;

public class Student implements Comparable<Student> {
	
	private String username;
	private Integer age;

	public Student() {
		super();
	}

	public Student(String username, Integer age) {
		super();
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [username=" + username + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getAge() - o.getAge();
	}

}
