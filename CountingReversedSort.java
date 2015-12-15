/*
 * Class:  CountingReversedSort
 * Author:  Andrew Zung
 * Date: Nov 13, 2014
 * 
 * Description:
 *   The main class to run the various methods required for the sorting.  
 */


import java.util.*;

public class CountingReversedSort
{
  public static void main(String[] args)
  {
    for (int i = 10; i<100001; i=i*10)
    {
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.reversedArray(i);
        ModifiedSorts.selectSort(list);
      }
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.reversedArray(i);
        ModifiedSorts.insertSort(list);
      }
//      for (int j = 0; j<10; j++)
//      {
//        int[] list = ArrayGen.reversedArray(i);
//        ModifiedSorts.mergeSort(list);
//      }
//      for (int j = 0; j<10; j++)
//      {
//        int[] list = ArrayGen.reversedArray(i);
//        ModifiedSorts.quickSort(list);
      }
    }
  }