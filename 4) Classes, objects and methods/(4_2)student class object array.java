
class StuObj
{
	public static void main(String[] args) {
		Student[] s=new Student[50];
		for(int i=0;i<50;i++)
		{
			s[i]=new Student();
		}
		for(int i=0;i<50;i++)
		{
			System.out.println("Student ID :"+s[i].id);
		}
		
	}
}
class Student
{
	static int count=1;
	int id;
	Student(){
		id=count;
		count++;
	}
}