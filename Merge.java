import java.util.Arrays;
public class Merge{
  //optimized version
  private static void insertionSort(int[] data, int lo, int hi){
    int compare;
    for (int x = lo; x < hi; x++){
      compare = data[x];
      int count2 = x;
      while (count2 > lo && compare < data[count2 - 1]){
        data[count2] = data[count2 - 1];
        count2--;
      }
      data[count2] = compare;
    }
  }
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[] data){
    mergesort(data, 0, data.length - 1);
  }
  private static void mergesort(int[] data, int lo, int hi){
    int threshold = 15;

    if ((hi - lo) < threshold){
      insertionSort(data, lo, hi);
    }
    if (lo >= hi){
      return;
    }
    int middle = (hi-lo) / 2 + lo;
    //sort first and second halves.
    mergesort(data, lo, middle);
    mergesort(data, middle + 1, hi);
    merge(data, lo, middle, hi);
  }

  //helper for mergesort

  private static void merge(int[] data, int lo, int med, int hi){

    int[] data1 = new int[med - lo + 1];
    //dont add one because it the arrary starts at med + 1
    int[] data2 = new int[hi - med];
    int counter = lo;
    int count1 = 0;
    int count2 = 0;
  //testing purposes
//============================================================================
  //  System.out.println("ACTUAL DATA: ");
    //System.out.println(Arrays.toString(data));
//============================================================================
    //intialize temp arrays
    for (int x = 0; x < (med - lo + 1); x++){
      data1[x] = data[lo + x];
    }
    for (int y = 0; y < (hi - med); y++){
      data2[y] = data[med + 1 + y];
    }
    //testing purposes
//============================================================================
  /*  System.out.println("DATA1: ");
    System.out.println(Arrays.toString(data1));
    System.out.println("DATA2: " + "");
    System.out.println(Arrays.toString(data2));*/
//============================================================================
    //loops thru initially to find smaller values.
    while (count1 < data1.length && count2 < data2.length){
      //this is where the error happens
      if (data1[count1] <= data2[count2]){
        data[counter] = data1[count1];
        count1++;
      }else{
        data[counter] = data2[count2];
        count2++;
      }
      counter++;
    }
    //cleans up remaining values of data1 or data2.
    while (count1 < data1.length){
      data[counter] = data1[count1];
      count1++;
      counter++;
    }
    while (count2 < data2.length){
      data[counter] = data2[count2];
      count2++;
      counter++;
    }
  }
  public static void main(String[] args){
    /*
    int[] data1 = {0, 3, 4, 5, 10};
    int[] data2 = {1, 2, 6, 15, 100};
    System.out.println("\n" + "Testing Merge" + "\n");
    merge(data1, data2);
    for (int x = 0; x < newArr.length; x++){
      System.out.println(newArr[x]);
    }*/
      System.out.println("\n" + "not optimized" + "\n");
    int[] data = {1, 12, 6, 15, 100, 3, 53, 5};
    System.out.println("\n" + "Testing mergesort" + "\n");
    mergesort(data);
    System.out.println(Arrays.toString(data));
  }
}
