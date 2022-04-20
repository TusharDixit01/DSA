
public class recpattern1 {
		//   5 4 3 2 1 2 3 4 5
		// decreasing to increasing	
	public static void fun(int n) {
		if(n==1)
		{
			System.out.print("1 ");
			return;
		}
		
		System.out.print(n+" ");
		fun(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		fun(n);


	}
}
