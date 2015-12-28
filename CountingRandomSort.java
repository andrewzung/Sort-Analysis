/*
 * Class:  CountingRandomSort
 * Author:  Andrew Zung
 * Date: Nov 13, 2014
 * 
 * Description:
 *   The main class to run the various methods required for the sorting.  
 */


import java.util.*;

public class CountingRandomSort
{
  public static void main(String[] args)
  {
    for (int i = 10; i<100001; i=i*10)
    {
      int totalCompare = 0;
      int totalSwaps = 0;
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.randomizedArray(i);
        ModifiedSorts.compare= 0;
        ModifiedSorts.swaps = 0;
        ModifiedSorts.selectSort(list);
        totalCompare += ModifiedSorts.compare;
        totalSwaps += ModifiedSorts.swaps;
      }
      totalCompare = totalCompare/10;
      totalSwaps = totalSwaps/10;
      System.out.println("The comparisons and swaps for a random array of " + i + " items using a Select Sort is : " + totalCompare +" and "+ totalSwaps);
      
      totalCompare = 0;
      totalSwaps = 0;
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.randomizedArray(i);
        ModifiedSorts.compare= 0;
        ModifiedSorts.swaps = 0;
        ModifiedSorts.bubbleSort(list);
        totalCompare += ModifiedSorts.compare;
        totalSwaps += ModifiedSorts.swaps;
      }
      totalCompare = totalCompare/10;
      totalSwaps = totalSwaps/10;
      System.out.println("The comparisons and swaps for a random array of " + i + " items using a Bubble Sort is : " + totalCompare +" and "+ totalSwaps);
      
      totalCompare = 0;
      totalSwaps = 0;
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.randomizedArray(i);
        ModifiedSorts.compare= 0;
        ModifiedSorts.swaps = 0;
        ModifiedSorts.insertSort(list);
        totalCompare += ModifiedSorts.compare;
        totalSwaps += ModifiedSorts.swaps;
      }
      totalCompare = totalCompare/10;
      totalSwaps = totalSwaps/10;
      System.out.println("The comparisons and swaps for a random array of " + i + " items using a Insert Sort is : " + totalCompare +" and "+ totalSwaps);
      
      totalCompare = 0;
      totalSwaps = 0;
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.randomizedArray(i);
        ModifiedSorts.compare= 0;
        ModifiedSorts.swaps = 0;
        ModifiedSorts.mergeSort(list);
        totalCompare += ModifiedSorts.compare;
        totalSwaps += ModifiedSorts.swaps;
      }
      totalCompare = totalCompare/10;
      totalSwaps = totalSwaps/10;
      System.out.println("The comparisons and swaps for a random array of " + i + " items using a Merge Sort is : " + totalCompare +" and "+ totalSwaps);
      
      totalCompare = 0;
      totalSwaps = 0;
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.randomizedArray(i);
        ModifiedSorts.compare= 0;
        ModifiedSorts.swaps = 0;
        ModifiedSorts.quickSort(list);
        totalCompare += ModifiedSorts.compare;
        totalSwaps += ModifiedSorts.swaps;
      }
      totalCompare = totalCompare/10;
      totalSwaps = totalSwaps/10;
      System.out.println("The comparisons and swaps for a random array of " + i + " items using a Quick Sort is : " + totalCompare +" and "+ totalSwaps);
    }
  }
}