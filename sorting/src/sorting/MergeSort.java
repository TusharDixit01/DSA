package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,6,9,12,14};
		int[] b= {-3,0,3,5,7,11,24};
		
		int[] mergeArray=mergeFun(a,a.length,b,b.length);
		System.out.println(Arrays.toString(mergeArray));

	}


	private static int[] mergeFun(int[] a, int m, int[] b, int n) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		int[] arr=new int[m+n];
		
		while(i<m && j<n) {
			if(a[i]<=b[j]) {
				arr[k]=a[i];
				++i;
				++k;
			}else {
				arr[k]=b[j];
				++k;
				++j;
			}
		}
		while(i<m) {
			arr[k]=a[i];
			i++;
			k++;
		}
		while(j<n) {
			arr[k]=b[j];
			j++;
			k++;
		}
		
		
		return arr;
	}

}
