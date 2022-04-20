import java.util.Stack;

public class Recpatter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //increasing to decreasing
		//1 2 3 4 5 4 3 2 1
		
		int n=5;
		fun(n);
		
		st.pop();
		while(st.size()>0) {
			System.out.print(st.pop()+" ");
		}
		
	}
	static Stack<Integer> st=new Stack<>();
	private static void fun(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		fun(n-1);
		System.out.print(n+" ");
		st.push(n);
	}

}
