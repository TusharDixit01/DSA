package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a= {2,5,1,3,0,7,1,2};
          
          quickSort(a,0,a.length-1);
         System.out.println(Arrays.toString(a));
	}

	private static void quickSort(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		
		if(l>=r)
			return;
		int pivot_index=partition(a,l,r);
		quickSort(a,l,pivot_index-1);
		quickSort(a,pivot_index+1,r);
		
	}

	private static int partition(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		int pivot=a[r];
		int i,j=l;
		for(i=l;i<=r;i++) {
			if(a[i]<=pivot)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		return j-1;
	}

}
