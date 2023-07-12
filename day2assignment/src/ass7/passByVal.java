package ass7;

public class passByVal {

	public static void main(String[] args) {

		int sId = 25;
		passByVal val = new passByVal();
		System.out.println(sId);
		val.passThevalueMethod(sId);
		System.out.println("The sId is : " + sId);
		
		Student st = new Student();
		val.passThevalueMethod(st);
	}

	public void passThevalueMethod(int sId) {
		sId = 50;
		System.out.println("The sId is : " + sId);
	}
	
	public void passThevalueMethod(Student stu) {
		System.out.println("The sId is : " + stu.getStudentId());
	}

}
