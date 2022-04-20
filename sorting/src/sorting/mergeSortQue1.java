package sorting;
import java.util.*;
public class mergeSortQue1 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		
		 //        L   M   R 
		 //        |   |   |
		 //        0 1 2 3 4
         int[] a= {8,12,15,5,7};
         int l=0;
         int r=a.length-1;
         int m=l+(r-l)/2;
         
         int n1=m-l+1;
         int n2=r-m;
         int[] leftA=new int[m+1];
         int[] rightA=new int[r-m];
         
         for(int i=0;i<n1;i++)
        	 leftA[i]=a[i];
         for(int i=0;i<n2;i++)
        	 rightA[i]=a[m+i+1];
         
         int[] res=mergesort(leftA,rightA);
         System.out.println(Arrays.toString(res));
	}
	private static int[] mergesort(int[] leftA, int[] rightA) {
		// TODO Auto-generated method stub
		int i=0;int j=0;int k=0;
		int[] res=new int[leftA.length+rightA.length];
		
		while(i<leftA.length && j<rightA.length) {
			if(leftA[i]<=rightA[j]) {
				res[k]=leftA[i];
				i++;
				k++;
			}else {
				res[k]=rightA[j];
				j++;
				k++;
			}
		}
		
		while(i<leftA.length) {
			res[k]=leftA[i];
			k++;
			i++;
		}
		while(j<rightA.length) {
			res[k]=rightA[j];
			k++;
			j++;
		}
		
		return res;
	}
	

}
