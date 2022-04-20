
public class BinaryStrin01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		//how many a binary string of length n are there with no consecutive 1
		
		//n=1   0 or 1->2
		//n=2   00 01 10->3
		//n=3   000 001 010 100 101->5
		//n=4   0000 0001 0010 0100 1000 1010 1001 0101->8
		
		// 2 3 5 8
		
		int n=0;
		System.out.println(fib(n));
		
	}

	private static int  fib(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		if(n==1)
			return 2;
		
		return fib(n-1)+fib(n-2);
		
		
		
	}

}
