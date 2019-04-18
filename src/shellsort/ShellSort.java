/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shellsort;

// Java implementation of ShellSort 
import java.util.Scanner;

class ShellSort 
{ 
    /* An utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
//    /* function to sort arr using shellSort */
//    int sort(int arr[]) 
//    { 
//        int n = arr.length; 
//  
//        // Start with a big gap, then reduce the gap 
//        for (int gap = n/2; gap > 0; gap /= 2) 
//        { 
//            // Do a gapped insertion sort for this gap size. 
//            // The first gap elements a[0..gap-1] are already 
//            // in gapped order keep adding one more element 
//            // until the entire array is gap sorted 
//            for (int i = gap; i < n; i += 1) 
//            { 
//                // add a[i] to the elements that have been gap 
//                // sorted save a[i] in temp and make a hole at 
//                // position i 
//                int temp = arr[i]; 
//  
//                // shift earlier gap-sorted elements up until 
//                // the correct location for a[i] is found 
//                int j; 
//                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
//                    arr[j] = arr[j - gap]; 
//  
//                // put temp (the original a[i]) in its correct 
//                // location 
//                arr[j] = temp; 
//            } 
//        } 
//        return 0; 
//    } 
    
    int sort(int arr[]) { 
        int n = arr.length; 
        for (int gap = n/2; gap > 0; gap /= 2) { 
            for (int i = gap; i < n; i += 1) { 
                int temp = arr[i]; 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
                arr[j] = temp; 
            } 
        } 
        return 0; 
    }
  
    // Driver method 
    public static void main(String args[]) 
    { 
        Scanner input = new Scanner(System.in);
        System.out.println ("How many numbers do you want to sort 10 ,100, 1000, 10000, 100000");
        int number;
        int i, j;
        int maths;
        i = input.nextInt();

         int[] random = new int[i];
       
       
       for(j = 0; j < i; j++){
        maths = (int)(Math.random() * i);
          random[j] = maths;
       }
        ShellSort ob = new ShellSort(); 
        ob.sort(random);
        printArray(random); 
    } 
}  
/*This code is contributed by Rajat Mishra */