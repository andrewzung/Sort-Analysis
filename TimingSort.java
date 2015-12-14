/*
 * Class:  TimingSort
 * Author:  Andrew Zung
 * Date: Nov 13, 2014
 * 
 * Description:
 *   The main class to run the various methods required for the sorting.  
 */


import java.util.*;

public class TimingSort
{
  public static void main(String[] args)
  {
    int timing = 0;
    //Select Sort
    for (int i = 10; i<=100000; i=i*10)
    {
      timing = 0;
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        sw.start();
        Sorts.selectSort(list);
        sw.stop();
        timing += sw.getElapsedTime();
      }
      timing = timing/10;
      System.out.println("The avg time for a reversed array of " + i + " items using a Select Sort is : " + timing + " ds."); 
    }
    
    //Bubble Sort
    for (int i = 10; i<100001; i=i*10)
    {
      timing = 0;
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        sw.start();
        Sorts.bubbleSort(list);
        sw.stop();
        timing += sw.getElapsedTime();
      }
      timing = timing/10;
      System.out.println("The avg time for a reversed array of " + i + " items using a Bubble Sort is : " + timing + " ds."); 
      
      //InsertSort
      timing = 0;
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        sw.start();
        Sorts.insertSort(list);
        sw.stop();
        timing += sw.getElapsedTime();
      }
      timing = timing/10;
      System.out.println("The avg time for a reversed array of " + i + " items using an Insert Sort is : " + timing + " ds."); 
      
      //MergeSort
      timing = 0;
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        sw.start();
        Sorts.mergeSort(list);
        sw.stop();
      }
      timing = timing/10;
      System.out.println("The avg time for a reversed array of " + i + " items using a Merge Sort is : " + timing + " ds.");
      
      //QuickSort
      timing = 0;
      for (int j = 0; j<10; j++)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        sw.start();
        Sorts.quickSort(list);
        sw.stop();
        System.out.println("The time it took for a Quick Sort with " + i + " items is: " + sw.getElapsedTime() + " ms");
      }
      timing = timing/10;
      System.out.println("The avg time for a reversed array of " + i + " items using a Quick Sort is : " + timing + " ds."); 
    }
  }
}