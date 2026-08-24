

//  #############       LECTURE 7////// //////////////
// ///////////////function and meethod //////////////////////////////

// import java.util.*;
// public class function{
//   public static void printHelloWorld() {
//     System.out.println("hello world");
//         System.out.println("hello world");

//             System.out.println("hello world");


//   }

//   public static void calculateSum(int num1, int num2) {
  
//     int sum = num1 + num2;
//     System.out.println("sum is " + sum);



//   }
//   public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//    calculateSum(a,b);
//   }
// }
 ////////////////////////// or ///////////////////////
// import java.util.*;
// public class function{
//   public static int levis(int a , int b){
//     int sum = a + b;
//     System.out.println(sum);
//      return sum;
//   }
//   public static void main(String args[]){
//     int a = 5;
//     int b= 16;
//     levis(5,16);
//   }
// }

//////////////////////// swap the 2 numbers 
/// 
/// 
// public static void swap(int a , int b) {
//    /// // swap code 
//   int temp = a;
//   a = b;
//   b= temp;
//   System.out.println("a is " + a);
//   System.out.println("b is " + b);

// }



// public static void main(String args[]) {
//   /// swap
//   int a = 7; 
//   int b= 11;
//   swap(a,b);
//   /// 
//   /// 
// // find product of a and b 
// public static  int multiply(int a , int b) {
//   int product = a * b; 
//   return product;



// }

// public static void main(String args[]) {
//   int a = 3; 
//   int b = 5;
//    int prod = multiply(a,b);
//    System.out.println("a * b =" + prod);

// } 



//question 2 //////////////////////////////////////////////. factorial of a number, n while  n= 4////////////////////////////////////////////////////////
// n! = n * (n-1) * (n*2)............ *1 

// public static int factorial(int  n) {
//   int f =1;

//   for (int i=1; i<=n; i++) {
//     f=f*i;


//   }     return f;



// }
// public static void main(String args[]){
// System.out.print(factorial(14));
// }

// // }   /// BINOMial coefficent ////////////////////////////
// public static int factorial(int  n) {  
//    int f =1;

//    for (int i=1; i<=n; i++) {
//      f=f*i;


//    }     return f;
//   }

// public static int bincoeff(int n, int r) {
//   int fact_n = factorial(n);
//     int fact_r = factorial(r);

//       int fact_nmr= factorial(n-r);
//       int bincoeff = fact_n / (fact_r* fact_nmr);
//       return bincoeff;


// }
// public static void main(String args[]){
//   System.out.println(bincoeff(5,2));
//}

////////////////// function overloding    /////////////////////////////////////////

// // func t0 calcuLATE SUM OF TWO NO 

// public static int sum(int a, int b) {
//   return a + b;
// }

// ////////////////////////////////////////////////////////////// functuon to claculate aum of three  number ////////////////////////////////////////////////


// public static int sum(int a , int b , int c) {
//   return a + b + c;
// }
// public static void main(String args[]) {
//   //System.out.println(sum(3,8));
//   System.out.println(sum(111,123,132));
// }

//   // data type overloading  //////////////////////////// ---------------->>>>>>>>>>>>>>>>

// public static int sum(int a ,int b ){
//   return a+b;

  
// }
// public static float sum(float a , float b) {
//   return a+b;

// }
// public static void main(String args[]) {
//   System.out.println(sum(4,6));
//   System.out.println(sum(11.8f,6.23f));



// }


// ////////////////////////////////////////////////////////////////////prime or not corner casses ///////////////////////////////////////////////////////////////
// 2 




// //c only n >= 2
// public static boolean isPrime(int n) {
//   // corner case 
//   // 1 
//   if (n== 2) {
//     return true;

//   }
// boolean isPrime = true;////////////// optional like | down
// for ( int i=2; i<=n-1; i++) {
//   if(n % i == 0) { // complete divisible 
//   return  false;  // isprime = false;
//                    // break;


//   }

// } return true; // return isPrime 
// }

// public static void main (String args[]) {
//   System.out.println(isPrime(12));
// // }
 ///////////////////////////////////////////////////////////////////
// public static boolean isPrime(int n ) {
//   if (n == 2) {
//     return true;
//   }
//   for (int  i = 2; i<=Math.sqrt(n); i++) {
//     if(n % i == 0) {
//       return false ; 

//     }
//   } 
//   return true;
// } 
// public static void main(String args[]) {
//   System.out.println(isPrime(3));
// }\




// /////////////////////////////////////////////////////////print all prime in range ////////////////////////////////////////////////////////////////////////
// public static boolean isPrime(int n ) {
//   if (n == 2) {
//     return true;
//   }
//   for (int  i = 2; i<=Math.sqrt(n); i++) {
//     if(n % i == 0) {
//       return false ; 

//     }
//   } 
//   return true;
// } 
// public static void primesInRange(int n ) {
// for (int i = 2; i<=n; i++) {
//   if(isPrime(i)) { // true 
//   System.out.print(i+" ");


//   }   

// } System.out.println();
// } 

// public static void main(String args[]) { 
//   primesInRange(729);
//  } 

 ///////////////////////////////// or ////////////////////////
// import java.util.*;
// public class function {

//   public static boolean isprime(int n){
//     if(n == 2){
//       return true;
//     }
//     for(int i =2; i<=Math.sqrt(n);i++){
//       if(n%i==0){  
//             return false;

//       }
//     }
//      return true;
//   }

//   public static void primerange(int n){
//     for(int i =2;i<=Math.sqrt(n);i++){
//       if(isprime(i)){
//         System.out.print(i+" ");

//       }
//     } System.out.println();
//   }
//   public static void main(String args[]){
//    primerange(729); 
// }
// }
///////////////////////////////////////////////////////////////////////// BINARY TO DESI MAAL //////////////////////////////////////////////////////////////////////////////////

// public static void binToDec(int binNum) {
//    int myNum = binNum;
//   int pow = 0;
//   int decNum = 0;
//   while (binNum > 0) {
//     int lastDigit = binNum % 10;
//     decNum = decNum + (lastDigit *(int)Math.pow(2,pow));

//     pow++;

//     binNum = binNum/10;

//   }
//   System.out.println("decimal of " + myNum+ "= " + decNum);
//   }

  // public static void main(String args[]) {
  //   binToDec(1);
  // }
  
// ///////////////////////////////////////////////////////////////////////// d to b /////////////////////////////////////////////////////////////////////////////////////////////////
  //  public static void decToBin(int n) {
  //   int myNum = n;
  //   int pow = 0;
  //   int binNum = 0;
  //   while (n > 0) {
  //     int rem = n % 2;
  //     binNum = binNum + (rem *(int)Math.pow(10,pow));
  //     pow++;
  //     n = n/2;

  //   }
  //    System.out.println("binary form of" + myNum + "=" + binNum);

  // }


  // public static void main(String args[]) {
  // decToBin(89);
  // }
  

  
  ///////////////////////// functions and methods v/////////////////////////////////////////////
  
  //// AVERAGE OF A THREE NUMNER ///////////////////////
//   /// 
//   public static int avg(int a , int b , int c) {
//     return (a+b+c)/3;
    
//   }
// public static void main(String args[]) {
//  // int result = avg(12,11,12);
//      System.out.println(avg(12,22,22));

 
//   //system.out.println(result);
// }

 ///////////////
   ////@2 ///////////
   /// 
   
//    public static boolean isEven(int n) {
//     if(n%2==0) 
//       return true;
//      return false;
// /// if else likho ya na its choice for return while if mai n 1 staement h to not required to make if else direct 1 line likho jada hoti to rehta if { } yeah nahi to direct 1 line h to like return true;


//     }
//     public static void main(String args[]) {
//       System.out.println(isEven(12));

//     }
   
   

//////////////////////////// @#3///////////////////////

// public class loops {
//   public static boolean isPd(int n) {
//     int orgN = n;
//      int revN = 0;
//     while (n != 0) {
//       int digit = n % 10;
//       revN = (revN*10)+digit;
//       n = n/10;

//     }
//     return revN == orgN;

//   }
//   public static void main(String args[]) {
//     System.out.println(isPd(12));
//   }
// }

 //////////////////// or /////////////////////
// import java.util.*;
// public class function {
//   public static int rev(int n){
//     int revn =0;
//     while(n>0){
//       int digit = n%10;
//       revn=(revn*10)+digit;
//       n = n/10;
//     }
//     return revn;
//   }
//   public static void main(String args[]){
//     System.out.println(rev(132345));
//    }
// }

///////////////////////////////// @#5//////////////////////////////
 
    


 // means that 729 so 7+2+9 = 18 like this 


  //  public static int sum(int n) {
  //   int sum = 0;
  //   while (n != 0) {
  //     int d = n%10;
  //     sum +=d;
  //     n=n/10;

  //   }
  //   return sum;
  //  }

  //  public static void main(String args[]) {
  //   int ans = sum(12345);
  //   System.out.println(ans);


