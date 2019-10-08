class Stack
{
	
	int tos=0;
	int item[] = new int[10];
	void push(int n)
	{
		item[this.tos]=n;
		this.tos=this.tos+1;
	} 
	int pop()
	{
		this.tos=this.tos-1;
		return item[tos];
	}
}
class StackOp
{
	public static void main(String[] args) {
		Stack s=new Stack();
		System.out.println("Inserting items...");
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(90);
		s.push(100);
		System.out.println("Removing items : ");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
		

	}
}