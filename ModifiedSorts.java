public class ModifiedSorts
{
  public static int compare = 0;
  public static int swaps = 0;
  
  //Selection
  public static void selectSort(int[] list)
  {
    for (int top = list.length - 1; top > 0; top--)
    {
      int largeLoc = 0; // location of largest element
      // assume list[0] is largest to start
      for (int i = 1; i <= top; i++) // check list[1] to list[top]
      {
        compare++;
        if (list[i] > list[largeLoc])
        {
          largeLoc = i;
        }
      }
      swaps++;
      int temp = list[top]; // temporary storage
      list[top] = list[largeLoc];
      list[largeLoc] = temp;
    }
  }
  
  //Bubble
  public static void bubbleSort (int[] list)
  {
    boolean sorted = false;
    for (int top = list.length - 1; top > 0 && sorted == false; top--)
    {
      sorted = true;
      for (int i = 0; i < top; i++)
      {
        compare++;
        if (list[i] > list[i+1] )
        {
          swaps++;
          sorted = false; // a swap was required
          int temp = list[i];
          list[i] = list[i+1];
          list[i+1] = temp;
        }
      }
    }
  }
  
  //Insertion
  public static void insertSort( int[] list)
  {
    for (int top = 1; top < list.length; top++)
    {
      int item = list[top]; // temporary storage of item
      int i = top;
      while (i > 0 && item < list[i-1])
      {
        compare++;
        swaps++;
        // shift larger items to the right by one
        list[i] = list[i-1];
        // prepare to check the next item to the left
        i--;
      }
      if (i!=0)
      {
        compare++;
      }
      list[i] = item; // put sorted item in open location
    }
  }
  
  //Mergesort
  public static void mergeSort( int[] a ) 
  {
    int[] tmpArray = new int[a.length];
    mergeSort( a, tmpArray, 0, a.length - 1 );
  }
  
  //Overloaded Mergesort used by the above method
  private static void mergeSort( int[] a, int[] tmpArray, int left, int right )
  {
    compare++;
    if( left < right ) {
      int center = ( left + right ) / 2;
      mergeSort( a, tmpArray, left, center );
      mergeSort( a, tmpArray, center + 1, right );
      merge( a, tmpArray, left, center + 1, right );
    }
  }
  /** Internal method that merges two sorted halves of a subarray. 
    * @param a an array of int items. 
    * @param tmpArray an array to place the merged result. 
    * @param leftPos the left-most index of the subarray. 
    * @param rightPos the index of the start of the second half. 
    * @param rightEnd the right-most index of the subarray. 
    */ 
  private static void merge( int[] a, int[] tmpArray, int leftPos, int rightPos, int rightEnd )
  { 
    int leftEnd = rightPos - 1;
    int tmpPos = leftPos;
    int numElements = rightEnd - leftPos + 1;
    
    // Main loop 
    while( leftPos <= leftEnd && rightPos <= rightEnd )
    {
      compare++;
      if( a[ leftPos ]<=( a[ rightPos ] ))
      {
        compare++;
        swaps++;
        tmpArray[ tmpPos++ ] = a[ leftPos++ ]; 
      }
      else 
      {
        compare++;
        swaps++;
        tmpArray[ tmpPos++ ] = a[ rightPos++ ];
      }
      
      while( leftPos <= leftEnd ) // Copy rest of first half 
      {
        compare++;
        swaps++;
        tmpArray[ tmpPos++ ] = a[ leftPos++ ];
      }
      while( rightPos <= rightEnd ) // Copy rest of right half
      {
        compare++;
        swaps++;
        tmpArray[ tmpPos++ ] = a[ rightPos++ ];
      }
      // Copy tmpArray back 
      for( int i = 0; i < numElements; i++, rightEnd-- ) 
      {
        swaps++;
        a[ rightEnd ] = tmpArray[ rightEnd ];
      }
    }
  }
  
  
  //Quicksort
  public static void quickSort(int[] arr)
  {
    quickSort(arr, 0, arr.length-1);
  }
  
  //Overloaded Quicksort used by the above method
  private static void quickSort(int[] arr, int left, int right) 
  { 
    int index = partition(arr, left, right);
    compare++;
    if (left < index - 1) 
      quickSort(arr, left, index - 1);
    compare++;
    if (index < right)
      quickSort(arr, index, right);
  }
  
  //Internal method that partitions the given array
  private static int partition(int[] arr, int left, int right) 
  {
    int i = left, j = right;
    int tmp;
    int pivot = arr[(left + right) / 2]; 
    while (i <= j) {
      compare++;
      while (arr[i] < pivot)
      {
        compare++;
        i++; 
      }
      while (arr[j] > pivot) 
      {
        compare++;
        j--; 
      }
      if (i <= j) {
        compare++;
        swaps++;
        tmp = arr[i]; 
        arr[i] = arr[j];
        arr[j] = tmp;
        i++; 
        j--; 
      }
    } 
    return i;
  }
}