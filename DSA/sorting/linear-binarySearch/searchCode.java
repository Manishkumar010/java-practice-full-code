
class searchCode {

  public static void main(String args[]) {
    int num[] = { 1,2,3,4,5, 7, 9, 11, 13 };
    int target = 13;

    int result = linearSearchs(num, target);
    int result2 = binarySearch(num, target);

    if (result == -1)
      System.out.println("Element not present");
    else
      System.out.println("Element found at index " + result);

    if (result2 == -1)
      System.out.println("Element not present");
    else
      System.out.println("Element found at index " + result2);
  }

  public static int linearSearchs(int[] num, int target) {
    for (int i = 0; i <= num.length; i++) {
      if (num[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(int[] num, int target) {
    // 5,7,9,11,13

    int left = 0;
    int right = num.length - 1;

    System.out.println(right);

    while(left <= right){
      int mid = (left + right) / 2;
      System.out.println("mid: " + mid);

      if(num[mid] == target){
        return mid;
      }
      else if(num[mid] < target){
        left = mid + 1;
      }
      else{
        right = mid - 1;
    } 
      
  }
  return -1;
}
}