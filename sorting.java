 ////////////////////  BUBBLE SORT ///////////////////////////////

// import java.util.*;
// public class sorting{
//     public static void bubs(int arr[]){
//       for(int i = 0; i<arr.length-1;i++){ // i == turns 
//         for(int j = 0; j<=arr.length-2-i; j++){
//           if(arr[j] > arr[j+1]){ // descending <
//             int temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp;
//           }
//         }
//       }

//     }
//     public static void printArr(int arr[]){
//       for(int i = 0; i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//       }
//       System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,39,2};
//         bubs(arr);
//         printArr(arr);

//     }
// }

//  // time complexity = O(n2)

//////////////////////// FOR SORTED BUBBLE SORT /////////////

// import java.util.*;
// public class sorting{
//     public static void bubs(int arr[]){
//       for(int turns = 0; turns<arr.length-1;turns++){
//          // i == turns 
//          boolean swap = false;
//         for(int j = 0; j<arr.length-1-turns; j++){
//           if(arr[j] > arr[j+1]){
//             int temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp;
//              swap = true;
//           }

//         }
//         if(swap == false){
//           break;
//         }
//       }

//     }
//     public static void printArr(int arr[]){
//       for(int i = 0; i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//       }
//       System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = {5,4,1,39,2};
//         bubs(arr);
//         printArr(arr);

//     }
// }

 // time complexity = O(n);

 // // /// ////  //////////// //////// SELECTION SORT //////////////

//  import java.util.*;
//  public class sorting{
//   public static void sort(int sankhya[]){
//    for(int i =0 ; i<sankhya.length-2;i++){
//     int minpos = i;
//     for (int j = i+1; j<sankhya.length-1; j++){
      
//       if(sankhya[minpos] < sankhya[j]){ // for descending order > use 
//         minpos = j;
//       }
//     }
//     int temp =sankhya[minpos];
//     sankhya[minpos] = sankhya[i];
//     sankhya[i]   = temp ;
//    }
//   }
// public static void printArr(int sankhya[]){
//       for(int i = 0; i<sankhya.length;i++){
//         System.out.print(sankhya[i]+" ");
//       }
//       System.out.println();
//     }
//   public static void main(String args[]){
//     int sankhya [] = {2,3,5,7775,2,34354,3345,12,3,56,788,432,56546}; 
//   sort(sankhya);
//   printArr(sankhya);
//  }
//  } 
//////////////////////////////////////////////////////////////////////////////////////////////////
  //  /////////////////////// insertion sort ////// 
  //  import java.util.*;
  //  public class sorting{
  //   public static void sel(int num[]){
  //     for(int i = 1; i<num.length;i++){
  //       int curr = num[i];  
  //       int prev = i-1;
  //       while(prev >=0 && num[prev]>curr){ // < for descending 
  //         num[prev+1] = num[prev];
  //         prev--;
  //       }
  //       num[prev+1] = curr;    
  //     }
  //   }
  //        public static void printArr(int num[]){
  //     for(int i = 0; i<num.length;i++){
  //       System.out.print(num[i]+" ");
  //     }
  //     System.out.println();
  //   }
  //   public static void main(String args[]){
  //     int num[] = {2,4,52,67,34,22};
  //     sel(num);
  //     printArr(num);
  //   }
  // //  }/////////////////////////////  inbuilt sort 
  // import java.util.Arrays;
  // public class sorting {
  //    public static void printArr(int num[]){
  //     for(int i = 0; i<num.length;i++){
  //       System.out.print(num[i]+" ");
  //     }
  //     System.out.println();
  //   }
  //   public static void main(String args[]){
  //     int num[] = {2,4,56,7,890,34};
  //     // Arrays.sort(num); // or 
  //           Arrays.sort(num,0,4);

  //     printArr(num);
  //   }
  // }
  ///////////////// IN BUIT SORT FOR DESCENDING ORDER //////////////////////////////////////
  //  import java.util.Arrays;
  // import java.util.Collections;
  // public class sorting {
  //    public static void printArr(Integer num[]){
  //     for(Integer i = 0; i<num.length;i++){
  //       System.out.print(num[i]+" ");
  //     }
  //     System.out.println();
  //   }
  //   public static void main(String args[]){
  //     Integer num[] = {2,4,56,7,890,34};
  //     // Arrays.sort(num); // or 
  //           Arrays.sort(num,0,4,Collections.reverseOrder());

  //     printArr(num);
  //   }
  // }
  ////////////////////////////////// COUNTING SORT ////////////
  
  // import java.util.*;
  // public class sorting{
  //   public static void count(int num[]){
  //     int largest = Integer.MIN_VALUE;
  //     for(int i = 0 ; i<num.length; i++){

  //       largest = Math.max(largest,num[i]);

  //     }
  //     // frequency count 
  //     int count[] = new int[largest+1];
  //     for (int i  = 0 ; i<num.length; i++ ){
  //       count[num[i]]++;
  //     }
  //     // sorting 
  //     int j = 0;
  //     for(int i = 0 ;i<count.length;i++){
  //       while(count[i]<0){
  //         num[j] = i;
  //         j++;
  //         count[i]--;

  //       }
  //      }

  //    }
  //     public static void printArr(int num[]){
  //      for(int i = 0; i<num.length;i++){
  //       System.out.print(num[i]+" ");
  //     }
  //     System.out.println();
  //   }

  //   public static void main(String args[]){
  //     int num[] = {5,4,3,2,1};
  //     count(num);
  //     printArr(num);
  //   }
  // }
