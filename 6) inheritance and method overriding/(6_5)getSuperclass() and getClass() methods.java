
class ClassDemo
{
	public static void main(String[] args) {
		Integer obj=new Integer(5);
		Class cls=obj.getClass();
		
		System.out.println("Class name : "+cls.getName());
		System.out.println("Super class name : "+cls.getSuperclass().getName());
	}
}