package learn.sample.quicksort;

public class Quicksort {

	public static int[] quickSort(int[] array) {
		 return quickSort(array,0,array.length-1);
	}
	
	public static int[] quickSort(int[] array,int left, int right) {
		if(left>=right)
			return array ;
		
		int pivot=array[(left+right)/2];
		int index=partition(array,left,right,pivot);
		quickSort(array,left,(index-1));
		quickSort(array,index,right);
		
		return array;
		
	}
	
	public static int partition(int[] array,int left,int right,int pivot) {
		while(left<=right) {
			while(array[left]<pivot) {
				left++;
			}
			
			while(array[right]>pivot) {
				right--;
			}
			
			if(left<=right) {
				swap(array,left,right);
				left++;
				right--;
			}
		}
		
		return left;
		
	}
	
	private static void swap(int[] array,int left, int right) {
		int temp=0;
		
		temp=array[left];
		array[left]=array[right];
		array[right]=temp;
	}
	public void printAllItems(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
