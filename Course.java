package package3;

public class Course {
	int number;
	String address;
	String time;
	int score;
	String name;
	String teacher;
	Teacher t;
	public Course(String name,String address,String time,int number,int score) {
		  this.name=name;
		  this.address=address;
		  this.time=time;
		  this.number=number;
		  this.score=score; 
		 }
	     String getname() {
		  return name;
		 }
	     String getaddress() {
		  return address;
		 }
	     String gettime() {
		  return time;
		 }
		 int getscore() {
		  return score;
		 }
		 int getnumber() {
		  return number;
		 }
		 public Teacher getTeacher() {
			  return t;
			  }
			 public void setTeacher1(Teacher tea) {
			  t=tea;
			 }
	public String toString(){
		return "��ѡ�γ̣�     �γ����ƣ�"+name+", �γ̱�ţ�"+number+", �Ͽεص�: "+address
				+", �Ͽ�ʱ�䣺"+time+", ѧ�֣�"+score;
	}
}
