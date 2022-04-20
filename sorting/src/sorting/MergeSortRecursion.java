package sorting;
import java.util.*;
public class MergeSortRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[]{1,2,-6,4,6,4,21,32,3};
		
		mergeSort(a,0,a.length-1);
		for(int x:a) {
			System.out.print(x+" ");
		}

	}
	
	static void mergeSort(int[] a,int left,int right) {
		
		if(left>=right)
			return;
      
        	int mid=left+(right-left)/2;
    		mergeSort(a,left,mid);
    		mergeSort(a,mid+1,right);
    		
    		mergeFun(a,left,mid,right);
        	
      
		
		
	}

	private static void mergeFun(int[] a, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int n1=mid-left+1;
		int n2=right-mid;
		int[] leftA=new int[n1];
		int[] rightA=new int[n2];
		for(int i=0;i<n1;i++) {
			leftA[i]=a[i+left];
		}
		for(int i=0;i<n2;i++) {
			rightA[i]=a[mid+1+i];
		}
		int i=0;int k=left; int j=0;
		while(i<n1 && j<n2) {
			if(leftA[i]<=rightA[j])
			{
				a[k]=leftA[i];
				i++;
				k++;
				
			}else {
				a[k]=rightA[j];
				k++;
				j++;
			}
		}
		while(i<n1) {
			a[k]=leftA[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=rightA[j];
			k++;
			j++;
		}
		
		
	}
	

}
