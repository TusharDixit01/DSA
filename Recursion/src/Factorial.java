
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n=5;
           System.out.println(fact(5)); 
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		
		//base case
		if(n==1)
			return 1;
		
		//recursion assumption
		
		
		//selfwork
		return n*fact(n-1);
	}

}
