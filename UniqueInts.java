public class UniqueInts{
   public static int[] unique(int[] ints){
      //since I won't know the final length of the new array 
      //I need to make it the length of the input array
      int[] newIntsLong = new int[ints.length];
      
      int cur = Integer.MIN_VALUE; //only problem is if there is a number in the array that is the MIN_VALUE of integer
      
      int length = 0; //the length increases only if a new int is added
      
      for(int i = 0; i < ints.length; i++){
         if(ints[i] != cur){
            newIntsLong[length] = ints[i];
            cur = ints[i];
            length++;
         }
      }
      
      //now I need to shorten the newIntsLong array
      
      int[] newInts = new int[length];
      
      for(int i = 0; i < length; i++){
         newInts[i] = newIntsLong[i];
      }
      
      return newInts;
   }
   
   //main method for testing
   public static void main(String[] args){
      int[] arr1 = new int[]{1,1,1,1,1,1};
      int[] arr2 = new int[]{1,1,2,2,3,3};
      int[] arr3 = new int[]{1,2,3,4,5,6};
      int[] arr1_u = unique(arr1);
      int[] arr2_u = unique(arr2);
      int[] arr3_u = unique(arr3);
      for(int i : arr1_u)
         System.out.print(i + " ");
      System.out.println();
      for(int i : arr2_u)
         System.out.print(i + " ");
      System.out.println();
      for(int i : arr3_u)
         System.out.print(i + " ");
      System.out.println();
   }  
}