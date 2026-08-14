///////////////////// max sub array brute force method means basic soln 
// import java.util.*; 
// public class array2 {
//     public static void printmaxsubarrays(int numbers[]) {
//         int currSum =0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i=0; i<numbers.length; i++)  {
//             int start = i;

//             for ( int j=i; j<numbers.length; j++) {
//                 int end = j; 
//                  currSum =0;
//                  for (int k = start; k<=end; k++) {
//                     currSum+= numbers[k]; // max sum 
                    
//                  }
//                  System.out.println(currSum);
//                  if(currSum > maxSum) {
//                     maxSum = currSum;         // replacement maxsum
//                  }

//             }
            
//         } System.out.println("maxSum is " + maxSum);


//     }
//     public static void main(String args[]) {
//         int numbers[]= {-1,2,6,-1,3};
//        printmaxsubarrays(numbers);


//     }
// }
        
        // time complexity is not good so we can get maxsubarray problem by prefix array method 

        // max subarray(prefix method) ///

//         import java.util.*; 
// public class array2 {
//     public static void printmaxsubarrays(int numbers[]) {
//         int currSum =0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];
//         prefix[0] = numbers[0];
//         for(int i =1; i<prefix.length;i++) {
//             prefix[i] = prefix[i]+numbers[i];
//         }

//         for (int i=0; i<numbers.length; i++)  {
//             int start = i;

//             for ( int j=i; j<numbers.length; j++) {
//                 int end = j; 
//                  currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                 
//                  if(currSum > maxSum) {
//                     maxSum = currSum;           
//                  }

//             }
            
//         } System.out.println("maxSum is " + maxSum);


//     }
//     public static void main(String args[]) {
//         int numbers[]= {-1,2,6,-1,3};
//        printmaxsubarrays(numbers);


//     }
// }
// its time complexity are better o(n2) but one more is best soln for max subarray 

// subarray maximum by kadane's algorithm/// 

// import java.util.*;
// public class array2 {
//     public static void kadanes(int numbers[]) {
//       int   cs = 0;
//       int   ms = Integer.MIN_VALUE;
//       for (int i =0;i<numbers.length; i++) {
//         cs = cs + numbers[i];
//         if(cs <0) {
//             cs =0;
//         }
//         ms = Math.max(cs,ms);
//       }
//       System.out.println("max subarray sum is =" + ms);
//     }
    
    
//     public static void main(String args[]) {
//         int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//         kadanes(numbers);
//     }
// }

// if all no are -ve so this will be done special case kadanes algorithm
// import java.util.*;
// public class array2 {
//     public static void kadanes(int numbers[]) {
//       int   cs = numbers[0];
//       int   ms = numbers[0];
//     for (int i =1;i<numbers.length; i++) {
//        cs = cs + numbers[i];
//        ms = Math.max(cs,ms);
//         }
       
//      System.out.println("max subarray sum is =" + ms);
 
//     }

//     public static void main(String args[]) {
//         int numbers[] = {-2,-3,-4,-1,-2,-1,-5,-3};
//         kadanes(numbers);
//     }
// }

////// most imp questions /////////////// 
/// trapped water ///////////////// 
// import java.util.*;
// public class array2 {
//         public static int trappedRainwater(int height[]) {
//       // calculate left max boundary - auxilary or helper array

//       int leftmax[] = new int [height.length];
//       leftmax[0] = height[0];
//       for(int i =1; i<height.length; i++) {
//       leftmax[i] = Math.max(height[i],leftmax[i-1]);

//       }



//        // calculate right max boundary - auxilary or helper array
//        int rightmax[] = new int[height.length];

//        rightmax[height.length-1]= height[height.length-1];
//       for(int i = height.length-2; i>=0;i--){
//         rightmax[i] = Math.max(height[i],rightmax[i+1]);
//       }

//       int trappedwater =0;

//        // loop
// for(int i=0; i<height.length;i++){

//        // water level = min(left max bound, right max boundary)
//    int waterlevel = Math.min(leftmax[i], rightmax[i]);
//        // trapped water = water level - height[i]
//        trappedwater += waterlevel - height[i];
// }
//   return trappedwater;

//         }
//         public static void main(String args[]) {
//                 int height[] = {4,2,0,6,3,2,5};
//           int ans =  trappedRainwater(height); 
//           System.out.println(ans);
//         }
// }


 //time complexity is O(n)  
 /////////////////// buy and sell stock ///////////
//  import java.util.*;
//  public class array2 {
//         public static int bandsstocks(int prices[]) {
//                 int buyprice = Integer.MAX_VALUE;
//                 int maxprofit = 0;
//                for(int i =0; i<prices.length;i++){
//                 if(buyprice < prices[i]) { // profit 
//                 int profit = prices[i]-buyprice;
//                 maxprofit = Math.max(maxprofit,profit);          

//                 }
//                 else{
//                         buyprice = prices[i];
//                 }
//                }
//                return maxprofit;
//         }
//         public static void main(String args[]) {
//         int prices[] = {7,1,5,3,6,4};
//         System.out.println(bandsstocks(prices));
//  }
//  }
 
// assignment /// 
// import java.util.*;
// public class array2 {
//         public static boolean sush( int nums[]) {
//                 for(int i=0;i<nums.length-1;i++) {
//                 for(int j=i+1;j<nums.length;j++){
//                         if(nums[i] == nums[j]){
//                                 return true;
//                         }
//                 }
//         } return false;

//         }
//                 public static void main(String args[]) {
//                 int nums[] = {2,4,5,1,2,4};
//                 System.out.print(sush(nums));
//         }
// }

////         #Q2        ///

