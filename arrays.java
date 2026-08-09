/* 
import java.util.*;
public class arrays {
    public static void main(String args[]) {
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
         marks[2] = sc.nextInt();
        System.out.println("physics =" + marks[0]);
               System.out.println("math =" + marks[1]);
               marks[1] = marks[1]+5;
               System.out.println("math =" + marks[1]);


         System.out.println("chemistry =" + marks[2]);

     int percentage = (marks[0] + marks[1] + marks[2])/3;
     System.out.println("percentage =" + percentage);    
// length of array 
System.out.println("lenth of arrays is =" + marks.length);


    }
}
*/

/*  some important points 
if total 50 size of array then its indexing from 0 to 49 called 0-based indexing 

list of same elements type like int, char, float which is continous like 1,2,3 called arrays.
     int marks[] = new int[50];    
     int numbers[] = {1,2,34,56}; // size is 4
     int moreNumbers[] = {3,5,8,90};

 size of computer memory is bytes(0,1).
 if lets we know; int is 4 bytes size and we store 3 elements like a,b,c
 adress will be incresed by +4 next to from a to b addresing 
 we csan write of array like       int marks[] = new int[100];

 when we declaresd size of array we cxan change in mid like marks of math is changed .
 arrays works on pass by reference.
*/

// add marks +5 by call of refernce 
// import java.util.*;
// public class arrays {
//     public static void update(int value[]) {
//         for(int i=0;i<value.length; i++) {
//             value[i]= value[i]+5;
//         }

//     }
//     public static void main(String args[]) {
//         int value[] = {44,17,6};
//         update(value);
   
//         for (int i=0;i<=value.length;i++) {
//             System.out.print(value[i]+ " ");
//         }
//      System.out.println();
//     }
// }

// LINEAR SEARCH /////

// THERE ARE ARRAYS IN WHICH HAVE VALUES AND FINDING THE REQUIRED KEY VALUE FROM GOING TO ALL THE KEYS IN A ARRAYS ./**
//  TIME COMPLEXITY = O(n).

//  import java.util.*;
//  public class arrays {
//     public static int ls(int k[],int key) {
//         for(int i=0;i<k.length;i++) {
//             if(k[i]==key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int k[] = {333,45,63,18,17,1,7};
//        int  key = 45;
//        System.out.println(ls(k,key));
//     }
//  }

// // .///////////////////////////// find the largest no in a given arays 
// import java.util.*;
// public class arrays {
//     public static int getL(int sush[]) {
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<sush.length; i++) {
//             if(largest < sush[i]) {
//                 largest = sush[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]) {
//         int sush[] = { 1,2,3,4,5,6,7,8,9};
//         System.out.println("largest value is " + getL(sush));
//     }
// }
////////////// find the lowest number ////////////

// import java.util.*;
// public class arrays {
//     public static int getS(int susht[]) {
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0; i<susht.length; i++) {
//             if(smallest > susht[i]) {
//                 smallest = susht[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String args[]) {
//         int susht[] = { 1,2,3,4,5,6,7,8,9};
//         System.out.println("smallest value is " + getS(susht));
//     }
// }
////////////////////////////// BINARY SEARCH /////////////////
/*  
binary search is like finding a word from dictionary book./**
 its like sorted array [1,2,3,4,5,6,7....] [9,7,5,3,1].
 [ 2,4,6,8,10,12,14]
start=0             end = 6
        mid
        mid [>,<,=]
    <------mid > key
        mid < key ------>
like that same after half like finding [2,4,6,8] 
                                  start          mid-1 // [2,4,6]
                                       mid[<,>,=]
                                        <------mid > key
                                                 mid < key ------>
time complexity = k = log2n
binary will perform better ia any case if there is a log then its is bstter compared to non log vslues 

*/
// find the key in a binary search // 

// import java.util.*;
// public class arrays {
//     public static int bs(int yash[], int key) {
//         int start = 0, end = yash.length-1;
//         while(start <= end) {
//             int mid = (start + end) / 2;
//             if(yash[mid] == key) {
//                 return mid;
//             }
//             else if(yash[mid]<key) { // else if --> replaceble by only if 
//               start = mid+1;
              
//             }
//             else {
//                 end = mid -1;
//             }

//         }
//       return -1;
//     }
//     public static void main(String arg[]) {
//         int yash[] = {2,4,6,8,10,12,14};
//         int key =8;
//     System.out.println("index of the key - - - >>" + bs(yash,key));
//     }
// }
