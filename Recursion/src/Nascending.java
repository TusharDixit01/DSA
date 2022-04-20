
public class Nascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=20;
        
        for(int i=1;i<=n;i++)
          System.out.print(fun(i)+" ");
	}

	private static int fun(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		
		return 1+fun(n-1);
		
		
		
	}

}
