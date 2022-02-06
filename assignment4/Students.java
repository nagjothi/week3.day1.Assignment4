package assignment4;

public class Students {
public void studentInfo(int id) {
	System.out.println(id);
}
public void studentInfo(int id,String name) {
	System.out.println(id);
}
public void studentInfo(String email,long phonenumber) {
	System.out.printf("email",phonenumber);
}
public void main(String[] args) {
	Students student = new Students();
	student.studentInfo(1234);
	student.studentInfo(1234,"Nagajothi");
	student.studentInfo("nagajothi21819@gmail.com",9876532147l);
	
	}
}
