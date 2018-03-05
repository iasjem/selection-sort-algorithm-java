/*
 * This program demonstrates how the selection sort algorithm works 
 */

public class MainSrc {

	public static void main(String[] args) {
		
		System.out.println("Selection Sort Algorithm by IasJem\n");
		
		int[] arr = {5,2,9,0,1};
		SelectSort selectSort= new SelectSort();
		
		System.out.print("Before:\t");  selectSort.showArr(arr);
		selectSort.sortArr(arr); // sort the array
		System.out.print("After:\t"); selectSort.showArr(arr);
	}
}
