
public class stack {
	private int size;
	private int a[];
	private int top;
	public stack(int n)
	{
		size = n;
		a= new int[n];
		top=-1;
	}
	public void push(int n)
	{
		if(top == size-1)
		{
			System.out.println("Overflow");
		}
		else
		{
			a[++top] = n;
		}
	}
	public int pop()
	{
		if(top == -1)
		{
		return -1;
		}
		else
			return a[top--];
			
	}
	
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		stack ob = new stack(5);
		
		int p =ob.pop();
		System.out.println(p);
		System.out.println("A");
		ob.push(6);
		System.out.println("b");
		ob.push(0);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		System.out.println("c");

		ob.display();
	}

}
