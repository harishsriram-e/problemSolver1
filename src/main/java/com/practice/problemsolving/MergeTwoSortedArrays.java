package com.practice.problemsolving;

/**
 * Input: Two sorted arrays : array1 = {3,5,6,10}, array2 = {2,5,15}
 * Output: {2,3,5,6,10,15}
 * */
public class MergeTwoSortedArrays {
	public static void main(String[] args) {
	int[]	array1 = {3,5,6,10};
	int[] 	array2 = {2,5,15};
	mergeSortedArray(array1,array2);
	}
	
	public static void mergeSortedArray(int arr1[],int arr2[]) {
		int lenArr1 = arr1.length;
		int lenArr2 = arr2.length;
		int i =0,j =0,k =0;
		int[] arr3 = new int[lenArr1+lenArr2];
		while(i<lenArr1 && j<lenArr2) {
			if(arr1[i]<arr2[j]) {
				arr3[k++] =arr1[i++];
			}else {
				arr3[k++]= arr2[j++];
			}
		}
		while(i < lenArr1)
			arr3[k++] = arr1[i++];
		while(j < lenArr2)
			arr3[k++] = arr2[j++];
		
		for (int l=0; l < lenArr1+lenArr2; l++)
            System.out.print(arr3[l] + " ");
    }
	
}
