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
    for (int j = 0; j<10; j++)
    {
      for (int i = 10; i<100001; i=i*10)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        sw.start();
        Sorts.selectSort(list);
        sw.stop();
        System.out.println("The time it took for a Select Sort with " + i + " items is: " + sw.getElapsedTime() + " ms");
      }
      for (int i = 10; i<100001; i=i*10)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        sw.start();
        Sorts.bubbleSort(list);
        sw.stop();
        System.out.println("The time it took for a Bubble Sort with " + i + " items is: " + sw.getElapsedTime() + " ms");
      }
      for (int i = 10; i<100001; i=i*10)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        sw.start();
        Sorts.insertSort(list);
        sw.stop();
        System.out.println("The time it took for a Insert Sort with " + i + " items is: " + sw.getElapsedTime() + " ms");
      }
      for (int i = 10; i<100001; i=i*10)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        sw.start();
        Sorts.mergeSort(list);
        sw.stop();
        System.out.println("The time it took for a Merge Sort with " + i + " items is: " + sw.getElapsedTime() + " ms");
      }
      for (int i = 10; i<100001; i=i*10)
      {
        int[] list = ArrayGen.reversedArray(i);
        StopWatch sw = new StopWatch();
        sw.start();
        Sorts.quickSort(list);
        sw.stop();
        System.out.println("The time it took for a Quick Sort with " + i + " items is: " + sw.getElapsedTime() + " ms");
      }
    }
  }
}