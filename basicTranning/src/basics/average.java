package basics;

public class average {
	
	public static int a,b,c,d;
	public static int x;
	public static String name,fname;
	
	public void addition(){
		a=5;
		b=15;
		c=a+b;
		d=c/2;
		System.out.println("the value of two numbers "+d);
	}

	public void goodsLooping(){
		x=10;
		for(int i=0;i<=10;i++){
			System.out.println("the value is "+i);
		}
		
	}
	 public void conditions(){
		name="sathish";
		if(name=="sathish"){
			System.out.println("true");
			
		}else{
			System.out.println("the name is " +name);
		}
		
	}
	public static void main(String[] args) {
		average avg=new average();
		avg.addition();
		avg.goodsLooping();
		avg.conditions();
		

	}

}
