import java.util.Scanner;
public class Fibonacci implements ISubscriber {

	public static int Fibo(int n )
	{
     if (n==0)
    	 {return 0 ;}  
     if (n==1 || n==2 )
    	 { 
    	 return 1 ; 
    	 } 
    	 return Fibo(n-2) + Fibo(n-1) ; 
		
	}
	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		int numberofterms = Integer.parseInt(input);
		for (int i = 0 ; i <numberofterms ; i++ )
		{
			System.out.print(Fibo(i) + "\n");
		}
		
	}


}
