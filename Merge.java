public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[] data){

  }
  private static void mergesort(int[] data, int[]temp, int lo, int hi){

  }
  //helper for mergesort
  private static void merge(int[] data1, int[] data2){
    int[] newData = new int[data1.length + data2.length];
    int counter = 0;
    int count1 = 0;
    int count2 = 0;
    while (count1 < data1.length && count2 < data2.length){
      if (data1[count1] < data2[count2]){
        newData[counter] = data1[count1];
        count1++;
      }else{
        newData[counter] = data2[count2];
        count2++;
      }
      counter++;
    }

    if (count1 < data1.length){
      while (count1 < data1.length){
        newData[counter] = data1[count1];
        counter++;
        count1++;
      }
    }
    if (count2 < data2.length){
      while (count2 < data2.length){
        newData[counter] = data2[count2];
        counter++;
        count2++;
      }
    }
  }
}
