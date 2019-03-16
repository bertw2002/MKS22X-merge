public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[] data){
    mergesort(data, 0, data.length - 1);
  }
  private static void mergesort(int[] data, int lo, int hi){
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
    int counter = 0;
    int count1 = 0;
    int count2 = 0;
    //intialize temp arrays
    for (int x = 0; x < (med - lo + 1); x++){
      data1[x] = data[lo + x];
    }
    for (int x = 0; x < (hi - med); x++){
      data2[x] = data[med + 1 + x];
    }
    //loops thru initially to find smaller values.
    while (count1 < data1.length && count2 < data2.length){
      if (data1[count1] < data2[count2]){
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
      counter++;
      count1++;
    }
    while (count2 < data2.length){
      data[counter] = data2[count2];
      counter++;
      count2++;
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
  }
}
