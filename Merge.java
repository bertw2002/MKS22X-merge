public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[] data){

  }
  private static void mergesort(int[] data, int[]temp, int lo, int hi){

  }
  //helper for mergesort
  public static int[] merge(int[] data1, int[] data2){
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

    while (count1 < data1.length){
      newData[counter] = data1[count1];
      counter++;
      count1++;
    }
    while (count2 < data2.length){
      newData[counter] = data2[count2];
      counter++;
      count2++;
    }

    return newData;
  }
  public static void main(String[] args){
    int[] data1 = {0, 3, 4, 5, 10};
    int[] data2 = {1, 2, 6, 15, 100};
    System.out.println("\n" + "Testing Merge" + "\n");
    int[] newArr = merge(data1, data2);
    for (int x = 0; x < newArr.length; x++){
      System.out.println(newArr[x]);
    }
  }
}
