package sorting;
import java.util.*;
public class SelectionSort {

	public static int min(int[] a,int i) {
		int start=i;
		int m=i;
		while(start<a.length) {
			if(a[start]<a[m])
				m=start;
				start++;
		}
		return m;
	}
	
	public static void selectionSort(int[] a) {
	  for(int i=0;i<a.length;i++) {
		  int min_idx=min(a,i);
		  if(i!=min_idx) {
			  int temp=a[i];
			  a[i]=a[min_idx];
			  a[min_idx]=temp;
		  }
	  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a=new int[] {4,1,3,2,5,7,1,0};
        selectionSort(a);
        
        System.out.println(Arrays.toString(a));
	}

}
