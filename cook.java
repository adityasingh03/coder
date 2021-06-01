import java.util.*;
	import java.io.*;
import java.math.*;
	
	//class retaled to functions with Items Inputed 
	class items_class 
	{
	private String ing[]={"Butter","Milk","Egg","Tomato","Cucumber","Mushroom","Chili","Corn","Ginger","Chicken","Chevon","Pork","Tuna","Salmon","Crab","Prawn","Soup","Cola","Jam","Sauce"};
	private int which[]=new int[20];
	private int da[]=new int[20];
	private int ex[]= {30,3,25,10,6,10,12,3,20,2,2,2,3,2,1,2,3,4,3,48};
	private int arr[]={0,0,0};
	Scanner z =new Scanner(System.in);
	// function to display all items
	public void display()
	{
	int i=0;
	for(i=0;i<20;i++)
	{
	if(ing[i].length()<=7)
	System.out.print(ing[i]+"				");	
	else
	System.out.print(ing[i]+"			");
	if(i%2!=0)
	System.out.println();
	}
	}
	// function for User to select Items For Dishes
	public void ingredients()
	{
	int i=0;
	System.out.println(" Enter Stop to Poceed Further  :-)");
	String s1="";
	ac:while(!s1.equals("stop"))
	{
	s1=z.next();
	if(s1.equals("stop"))
	break ac;
	for(i=0;i<20;i++)
	if(s1.equalsIgnoreCase(ing[i]))
	which[i]=1;
	else 
	if(which[i]!=1)
	which[i]=0;
	}
	}
	// function for calculations Days Left for item to rot
	public void days_left(int r3)
	{
	int i1=0;
	for(i1=0;i1<=19;i1++)
	{
	da[i1]=ex[i1]-r3;
	}
	}
	/** function for displaying the calculated Days Left for item to rot to let user decide
	about the dish*/
	public void days_of_selected()
	{
	int i1=0;
	for(i1=0;i1<20;i1++)
	{    
	if(which[i1]==1)
	{
	if(da[i1]<=0)
	{
	arr[0]++;
	if(da[i1] !=0 && ((ex[i1]-da[i1])/(-da[i1]))<3)
	{
	System.out.println("O-: YOUR ITEM: "+ing[i1]+" in the fridge has became INEDIBLE : Check the fridge to maintain Hygeine amd Discard, if Rotten :-O");
	System.out.println("O-: For Health Pourpose, the item has been removed from your Cooking List :-O");
	System.out.println("If the item seems FINE and you want to Re-enter the item back in the list,\nPress \"Yes\"/\"Y\"/\"1\" else press \"No\"/\"N\"/\"0\" ");
	String s1;
	aaa:while(true)
	{
	s1=z.next();
	if(s1.equalsIgnoreCase("Yes") || s1.equalsIgnoreCase("Y") ||s1.equals("1"))
	break aaa;
	else
	{
	if(s1.equalsIgnoreCase("no") || s1.equalsIgnoreCase("n") ||s1.equals("0"))
	{
	which[i1]=0;
	break aaa;
	}
	else
	System.out.println("Wrong Input :-(\nEnter \"Yes\"/\"Y\"/\"1\" to proceed further & \"No\"/N\"/\"0\" to Skip this Step");
	}
	}
	}
	else
	{
	System.out.println(")-: HURRY !!! ITEM: "+ing[i1]+" in the fridge is in CRITICAL State :-(");	
	System.out.println("If the item seems ROTTEN and you want to Remove the item from the list,\nPress \"Yes\"/\"Y\"/\"1\" else press \"No\"/\"N\"/\"0\" \n This item wont appear in your cooking items and will be deleted from database");
	String s1;
	aaa:while(true)
	{
	s1=z.next();
	if(s1.equalsIgnoreCase("no") || s1.equalsIgnoreCase("n") ||s1.equals("0"))
	break aaa;
	else
	{
	if(s1.equalsIgnoreCase("Yes") || s1.equalsIgnoreCase("Y") ||s1.equals("1"))
	{
	which[i1]=0;
	break aaa;
	}
	else
	System.out.println("Wrong Input :-(\nEnter \"Yes\"/\"Y\"/\"1\" to proceed further & \"No\"/N\"/\"0\" to Skip this Step");
	}
	}
	}
	}

	if(da[i1]<=2 && da[i1]>0)
	{
	arr[1]++;
	System.out.println("|-: ITEM: "+ing[i1]+" in the fridge, has about "+ da[i1] + " days left ONLY!!! :-| ");
	}
	if(da[i1]>2)
	{
	arr[2]++;
	System.out.println("(-:ITEM: "+ing[i1]+" in the fridge, has about "+ da[i1] + " days left!!!  :-)");	
	}
	}			
	}
	}
	
	// function for User to select Items For Dishes
	public void selection()
	{
	System.out.println();
	int i1=0;
	int b=0;
	if(arr[0]!=0)
	{
	System.out.println(")-: Check these first and then Proceed!!!As they are ALMOST ROTTEN :-(");
	for(i1=0;i1<20;i1++)
	{    
	if(which[i1]==1)
	{
	if(da[i1]<=0)
	{
	b++;
	if(ing[i1].length()<=7)
	System.out.print(ing[i1]+"				");	
	else
	System.out.print(ing[i1]+"			");
	if(b%2==0)
	System.out.println();
	}
	}
	}
	if(b%2!=0)
	System.out.println();
	b=0;
	System.out.println();
	}
	if(arr[1]!=0)
	{
	System.out.println("|-: CONSIDER ME 1st :-|");
	for(i1=0;i1<20;i1++)
	{    
	if(which[i1]==1)
	{
	if(da[i1]>0 && da[i1]<=2)
	{
	b++;
	if(ing[i1].length()<=7)
	System.out.print(ing[i1]+"				");	
	else
	System.out.print(ing[i1]+"			");
	if(b%2==0)
	System.out.println();
	}
	}
	}
	if(b%2!=0)
	System.out.println();
	b=0;
	System.out.println();
	}
	if(arr[2]!=0)
	{
	System.out.println(":-) AVAILABLE (-:");
	for(i1=0;i1<20;i1++)
	{    
	if(which[i1]==1)
	{
	if(da[i1]>2)
	{
	b++;
	if(ing[i1].length()<=7)
	System.out.print(ing[i1]+"				");	
	else
	System.out.print(ing[i1]+"			");
	if(b%2==0)
	System.out.println();
	}
	}
	}
	if(b%2!=0)
	System.out.println();
	System.out.println();
	}
	}
	}
    //class retaled to functions with Dates Inputed 
	class date
	{
	Scanner z=new Scanner(System.in);
	private int d1,m1,y1,d2,m2,y2;
	private boolean b1,b2;
	// function taking Input of Starting Date given by User
	public void start_d()
	{
	d1=z.nextInt();
	m1=z.nextInt();
	y1=z.nextInt();
	date ob=new date();
	b1=ob.correctdate(d1,m1,y1);
	}
	// function taking Input of That Date given by User
	public void end_d()
	{
	d2=z.nextInt();
	m2=z.nextInt();
	y2=z.nextInt();
	date ob=new date();
	b2=ob.correctdate(d2,m2,y2);
	}
	// function taking Difference of Dates if Correct 
	public int diff_d()
	{
	date ob=new date();
	int r1=0,r2=0;
	if(b1 && b2)
	{
	r1=ob.func(d1,m1,y1);
	r2=ob.func(d2,m2,y2);
	if(r1>=0 && r2>=0)
	{
	if((r2-r1)>=0)
	return r2-r1;
	else
	{
	System.out.println("You Are Living in a Parallel Universe with Time Moving Backwards. Are You? : > \n Enter correct sequence of Dates");
	return -1;
	}
	}
	else
	{
	System.out.println("You Are Living in a Parallel Universe with an bygone Calender : > \n Input should be a year more than or 2020");
	return -1;
	}
	}
	else
	{
	System.out.println("You Are Living in a Parallel Universe with an Different span of time intervals: > \n Define Proper Date");
	return -1;
	}
	}
    // function checking the faultlessness of Dates given by User
	public boolean correctdate(int d,int m,int y)
	{
	int j=m;
	boolean b=false;
	if(j==1||j==3||j==5||j==7||j==8||j==10||j==12)
	{
	if(d<=31)
	b=true;
	}
	if(j==4||j==6||j==9||j==11)
	{
	if(d<=30)
	b=true; 
	}
	if(j==2)
	{
	if(y%4==0 && d<=29)
	b=true;
	if(y%4!=0 && d<=28)
	b=true;
	if(y%400==0 && d>=29)
	b=false;
	}
	return b;
	}
	// function calculating the number of days  
	public int func(int d,int m,int y)
	{
	int i,j,l=0,o=0,m1=m;
	if(y<2020)
	{
	return -1;
	} 
	for(i=2020;i<=y;i++)
	{
	if(i!=y)
	m1=13;
	else
	m1=m;
	for(j=1;j<m1;j++)
	{
	if(j==1||j==3||j==5||j==7||j==8||j==10||j==12)
	o=31;
	if(j==4||j==6||j==9||j==11)
	o=30;
	if(j==2)
	{
	if(i%4==0)
	o=29;
	else
	o=28;
	}
	l=l+o;
	}
	}
	return l+d;
	}
	}


    //Main Class 
	public class cook 
	{
	public static void main(String as[]) 
	{
	Scanner z=new Scanner(System.in);
	date ob=new date();
	int r3=0;
	aa:while(true)
	{
	System.out.println("Enter the Date of Purchase of Food Items \"In DD MM YYYY\" ");
	ob.start_d();
	System.out.println("Enter the Date Today In \"DD MM YYYY\" ");
	ob.end_d();
	r3=ob.diff_d();
	if(r3!=-1)
	break aa;
	else
	System.out.println("Please Repeat the process and give Valid Dates");
	}
	items_class ob1=new items_class();
	System.out.println("( : Please, Enter the items from the above list :)");
	ob1.display();
	ob1.ingredients();
	ob1.days_left(r3);
	ob1.days_of_selected();
	System.out.println("\nWould You like to Create a Dish from Groceries");
	System.out.println("Enter \"Yes\"/\"Y\"/\"1\" to proceed further & \"No\"/N\"/\"0\" to Skip this Step");
	ab:while(true)
	{
	String s1="";
	s1=z.next();
	if(s1.equalsIgnoreCase("Yes") || s1.equalsIgnoreCase("Y") ||s1.equals("1"))
	{
	ob1.selection();
	break ab;
	}
	else if(s1.equalsIgnoreCase("no") || s1.equalsIgnoreCase("n") ||s1.equals("0"))
	{
	System.out.println("Ok");
	break ab;
	}
	else
	System.out.println("Wrong Input :-(\nEnter \"Yes\"/\"Y\"/\"1\" to proceed further & \"No\"/N\"/\"0\" to Skip this Step");
	}
	}
	}


