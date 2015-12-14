/*
 * Class:  CountSort
 * Author:  Andrew Zung
 * Date: Nov 13, 2014
 * 
 * Description:
 *   The main class to run the various methods required for the sorting.  
 */


import java.util.*;

public class CountSort
{
  public static void main(String[] args)
  {
    for (int j = 0; j<10; j++)
    {
      for (int i = 10; i<100001; i=i*10)
      {
        int[] list = ArrayGen.reversedArray(i);
        Sorts.selectSort(list);
      }
      for (int i = 10; i<100001; i=i*10)
      {
        int[] list = ArrayGen.reversedArray(i);
        Sorts.bubbleSort(list);
      }
      for (int i = 10; i<100001; i=i*10)
      {
        int[] list = ArrayGen.reversedArray(i);
        Sorts.insertSort(list);
      }
      for (int i = 10; i<100001; i=i*10)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        Sorts.mergeSort(list);
      }
      for (int i = 10; i<100001; i=i*10)
      {
        int[] list = ArrayGen.reversedArray(i);
        Sorts.quickSort(list);
      }
    }
  }
}