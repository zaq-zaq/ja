package package3;

public class Teacher{
	Course c;
	String name;
	String sex;
	int number;
	public Teacher(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
	public void teacher(String name,String sex,int number) {
	  this.name=name;
	  this.sex=sex;
	  this.number=number;
	 }
	 public Course getCourse() {
	  return c;
	  }
	 public void setCourse1(Course cour) {
	  c=cour;
	 }
	 public String toString() {
	     return " �ڿν�ʦ��" + name +"  �Ա�" + sex+"   ��ţ�" + number   ;
	  }
	public void setCourse(Course course) {
		// TODO Auto-generated method stub
		
	}
}