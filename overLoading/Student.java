package overLoading;

public class Student {

	public String getStudentInfo(String id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return "mani";
	}

	public String getStudentInfo(String name, String Email) {
		// TODO Auto-generated method stub
		System.out.println(name);
          return name  ;
	}

	public void getStudentInfo(int io) {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	public static void main(String[] args) {

		Student a = new Student();

		a.getStudentInfo("mani");
        a.getStudentInfo("name", "email");
	}

}
