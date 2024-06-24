package Tute_3;

public class Student {
	int studentId;
	String name;
	String degree;
	String mobile;
	//static int max;
	
	public Student(String name, String degree, String mobile) {
		super();
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		//Student.max+=100;.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void print() {
		System.out.println("name is:"+this.name+"degree is:"+this.degree+"mobile:"+this.mobile);
		
	}
	
}
