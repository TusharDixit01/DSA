
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        for(int i=0;i<n;i++)
        System.out.print(fib(i)+" ");
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==1 || n==0)
			return n;
		
		return fib(n-1)+fib(n-2);
	}

}
