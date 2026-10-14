 /////////////////// bit manipulation $# lecture 16 ?//////
 /// 
 /// bitwise and (&) /////
 
 
//  import java.util.*;
// public class bitm{
//     public static void main(String args[]){
//         System.out.print(5 & 6);
//     }
// }

// binary or |                  /////////////////////////////////


//  import java.util.*;
// public class bitm{
//     public static void main(String args[]){
//         System.out.print(5 | 6);
//     }
// }

//  ///???????????????// binary xor ///////////


//  import java.util.*;
// public class bitm{
//     public static void main(String args[]){
//         System.out.print(5 ^ 6);
//     }
// }


//////////////////// binary one s complenment ?///////// 


//  import java.util.*;
// public class bitm{
//     public static void main(String args[]){
//         System.out.print(~128

//         );
//     }
// }
////////// binary left shift << ///////////

//  import java.util.*;
// public class bitm{
//     public static void main(String args[]){
//         System.out.print(5<<2

//         );
//     }
// }

////////// binary right  shift >> ///////////

//  import java.util.*;
// public class bitm{
//     public static void main(String args[]){
//         System.out.print(5>>2

//         );
//     }
// }


 // question 1 ?? // 
 // even or odd batao //
  

//  import java.util.*;
//  public class bitm{
//     public static void evenorodd(int n){
//         int bitmark = 1 ; 
//         if(( n & bitmark) == 0){
//             System.out.println("even");
//         }
    
//        else {
//         System.out.println("odd");
//        }
//     }
//     public static void main(String args[]){
// evenorodd(11);  
// evenorodd(12);    
//     }
//  }


///////// operations /// 
/// 
///     get ith bit ////// 
 
// import java.util.*;
// public class bitm{
// public static int ithbit(int n, int i){
//   int bitmask = 1<<i; 
// if((n&bitmask) == 0){
//     return 0;
// }
// else {
//     return 1;
// }
// }

//   public static void main(String args[]){
//     System.out.println(ithbit(8,3));

//   }
// }

// //set ith bit ////// 

// import java.util.*;
// public class bitm {

//     public static int getithbit(int n, int i ){
//         int bitmark = 1<<i;
//         return n | bitmark;
//     }
//     public static void main(String args[]){
//      System.out.println(getithbit(8,2));
//     }
// }

///// clear ith bit ////////// 
// /// 
// import java.util.*;
// public class bitm {

//     public static int clearithbit(int n, int i ){
//         int bitmark = ~(1<<i);
//         return n & bitmark;
//     }
//     public static void main(String args[]){
//      System.out.println(clearithbit(10,1));
//     }
// }

//////////// update ith bit /////// 
/// 

// import java.util.*;

// public class bitm {

//     public static int setithbit(int n, int i) {
//         int bitmask = 1 << i;
//         return n | bitmask;
//     }

//     public static int clearithbit(int n, int i) {
//         int bitmask = ~(1 << i);
//         return n & bitmask;
//     }

//     public static int updatebit(int n, int i, int newbit) {
//         if (newbit == 0) {
//             return clearithbit(n, i);
//         } else {
//             return setithbit(n, i);
//         }
//     }

//     public static void main(String args[]) {
//         System.out.println(updatebit(10, 2, 1));
//     }
// }

////////// or //////// 

// import java.util.*;

// public class bitm {


//     public static int clearithbit(int n, int i) {
//         int bitmask = ~(1 << i);
//         return n & bitmask;
//     }

//     public static int updatebit(int n, int i, int newbit) {
//         n = clearithbit(n, i);
//         int bitmask = newbit << i;
//         return n | bitmask;
//     }

//     public static void main(String args[]) {
//         System.out.println(updatebit(10, 1, 0));
//     }
// }


/////////// clear last ith bit //////// 
// /// 

//  import java.util.*;
//  public class bitm {
//     public static int clearend(int n , int i ){
//            int bitmark = (-1)<< i;
//         return n & bitmark;

//     }
//     public static void main(String args[]){
//      System.out.println(clearend(15,2));
//     }
//  }

///////
// /// clear range of bits ////// 
// /// 
// import java.util.*;
// public class bitm{ 
//     public static int crb(int n, int i , int j ){
//         int a = (~0)<<(j+1);
//         int b = (1<<i)-1;
//         int bitmark = a|b;
//         return n & bitmark;
//     }
//     public static void main(String args []){
//     System.out.println(crb(10,2,4));
//     }
// }

 ///////////// q2 check if n0 is a power of 2 or not ? /  
 

//  import java.util.*;
//  public class  bitm {
//     public static boolean power(int n){
//         return (n&(n-1))== 0;
//     }
//     public static void main(String args[]){
//      System.out.println(power(32

//      ));
//     }
//  }

//////////////////////////////////////// counrt set bit in a number ///////
// import java.util.*;
// public class bitm {
//     public static int countt(int n) {
//     int count = 0;
//      while (n > 0){
//         if((n & 1) != 0 ) // check lsb kar rahe hai 
// {
//     count++;
// }  
//    n = n>>1;
// }
//  return count;

//     }
//     public static void main(String args[]){
//      System.out.println(countt(10));
//     }
// }


/////////////// fast exp0nential /////////// 
// /// 
// import java.util.*;
// public class bitm {
//     public static int fast(int a, int n){
//         int ans = 1;
//         while (n>0){
//             if((n&1) != 0){ // LSB 
//              ans = ans*a;
//             }
//             a = a*a;
//             n = n>>1;
//         }
//         return ans;
//     }
//         public static void main(String args[]){
//         System.out.println(fast(3,5));
//     }
// }

////////////// assugnment /////////////
/// 
/// @2 soln //// swap two difgit without using extra variable 
// /// 
// import java.util.*;
// public class bitm{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 20;
//         System.out.println("before swap =>> " + "a =" + a + "," + "b=" + b);
//         a = a^b;  // 10^20
//         b = a^b;  // 10^20^20 // ans is 10
//         a = a^b;
//                 System.out.println("after swap =>> " + "a =" + a + "," + "b=" + b);

//     }
// }

// Qq3//

            //  add 1 to bit manipulation 

// import java.util.*;
// public class bitm {
//     public static void main(String[] args) {
// int x = 6;
// System.out.println(x + " + " + 1 + " is " + -~x);
// x = -4;
// System.out.println(x + " + " + 1 + " is " + -~x);
// x = 0;
// System.out.println(x + " + " + 1 + " is " + -~x);
// }

// }

// Q4 // 

// // convert uppercase caracter to lower casee character // 
// import java.util.*;
// public class bitm {
//     public static void main(String args[]){
//         for(char ch = 'A'; ch<='Z';ch++){
//             //System.out.println(ch);
//             System.out.print((char)(ch |' '));
//         }
//     }
// }