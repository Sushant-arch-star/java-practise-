

///////////////////////// LECTURE 6 /////////////////////////
/////////////////// patterns ////////////////////////////////
 
// import java.util.*;
// public class loops {
//   public static void main(String arrgs[]) {
//    for (int line = 1; line <= 4; line++)  {
//     for (int star = 1; star <= line; star++) {
//       System.out.print("#");
//     }  System.out.println();
//    }
//   }
// }


// //  // INVERRTED STAR PATTERN /////

// //  import java.util.*;
// //  public class loops {
// //   public static void main(String args[]) {
// //     int n =34;
// //       for (int line = 1; line<=4; line++) {
// //       for (int star = 1; star <= n-line+1; star++ ) {
// //         System.out.print("$");

// //       }System.out.println();
// //      }

// //   }
// //  }
     ////// half pyramid pattern /////////////// 

//  import java.util.*;
//  public class loops {
//   public static void main(String args[]) {
//     int n =4;
//       for (int line = 1; line<=n; line++) {
//         for (int number=1; number<=line; number++) {
//         System.out.print(number);

//       } 
//       System.out.println();
//      }

//   }
//  }
  ////////////    CHAR PATTERN ////////////////////// 
  

// // import java.util.*;
// //  public class loops {
// //   public static void main(String args[]) {
// //     int n =4;
// //     char ch ='a';
// //       for (int line = 1; line<=n; line++) {
// //         for (int chars=1; chars<=line; chars++) {
// //         System.out.print(ch);
// //         ch++;

// //       } 
// //       System.out.println();
// //      }

// //   }
// //  }




//  #############       LECTURE 7////// //////////////
// ///////////////function and meethod //////////////////////////////

// import java.util.*;
// public class loops {
//   public static void printHelloWorld() {
//     System.out.println("hello world");
//         System.out.println("hello world");

//             System.out.println("hello world");


//   }

// //   public static void calculateSum(int num1, int num2) {
  
// //     int sum = num1 + num2;
// //     System.out.println("sum is " + sum);



// //   }
// //   public static void main(String args[]) {
// //       Scanner sc = new Scanner(System.in);
// //     int a = sc.nextInt();
// //     int b = sc.nextInt();
// //    calculateSum(a,b);
//   }
// }



//  public static intcalculateSum(int num1, int num2) { // parameters or formal parameters 
  
//     int sum = num1 + num2;
//     System.out.println("sum is " + sum);
//     return sum;



//   }
//   public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sum = calculateSUm(a,b); // arguments or actual parameters 

//    System.out.println("sum is " + sum);
//   }
// // }
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
// // n! = n * (n-1) * (n*2)............ *1 

// public static int factorial(int  n) {
//   int f =1;

//   for (int i=1; i<=n; i++) {
//     f=f*i;


//   }     return f;



// }
// public static void main(String args[]){ 
//   System.out.println(factorial(14));


// // }   /// BINOMial coefficent 
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
// }
////////////////////////////// function overloding    /////////////////////////////////////////

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
/////////////////////////////////////////////////////////////////////////////////
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
/////////////print all prime in a range ////////////////
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
  //   binToDec(1);
  // //decToBin(89);
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

 
//   //System.out.println(result);
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




///////////////////////////////// @#5//////////////////////////////
 
    





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
  //  }

                  ////// lecture 8 ////////////
                  /// 
 ////////////////////////////////////////// ADVANCED PATTERN QUESTIONS ///////////////////////////////////////////////////////
  ////////////////// HOLLOW RECTANGLE /////////////////////////////

//  public class loops {
//   public static void hollow_rectangle(int n, int m) {
//     for (int i =1; i<=n; i++) { // inner - cploumns

//     for (int j =1; j<=m; j++) {  // cell -(i,j) 

//     if(i == 1 || i == n || j == 1 ||  j == m) {
//       // boundary cells 
//       System.out.print("#");

//     } else {
//       System.out.print(" ");
//     }
 
//     } System.out.println();
//     }
//   }
//   public static void main(String args[]) {
//     hollow_rectangle(4, 5);

//   }
//  }





 /////////////////// INVEERTED AND ROTATED HALF PYRAMID //////////////////////////////
 /// 

//  public static void i_r_h_p(int n ) {
  
//   for (int i=1; i<=n; i++) {
//     // spaces 
//     for(int j = 1; j<=n-i; j++) {
//       System.out.print(" ");


//     }
//     // stars 
//     for (int j =1; j<=i; j++) {
//       System.out.print("*");
//     }
//     System.out.println();

//   }


//  }


//  public static void main(String args[]) {
//   i_r_h_p(4);

    
//  }
///////////////////////// INVERTED HALF PYRAID WITH NO.////////////////////////////////////////////
// /// 
// /// 
// public static void h_p(int n ) {
//   for (int i = 1; i<=n; i++) {
//      for (int j=1; j<=n-i+1; j++) {
//     System.out.print(j +" ");
//   }

//     System.out.println();
//   }
 
// }

// public static void main(String args[])  {
//   h_p(5);

// }



///////////////////////////////  floyds triangle /////////////////////////////////////////////////
///
/// 
//  public static void f_t(int n) {
//    int counter = 1; 

//   for (int i = 1; i<=n; i++) {
//     // inner - how many time will counter wiill be printed 

//      for (int j=1; j<=i; j++) {
//     System.out.print( counter +" ");
//     counter++;
//   }

//     System.out.println();
//   }
 
// }

// public static void main(String args[])  {
//   f_t(5);

// }
 
   




/////////////////////////////// 0-1 traiangle //////////////////////
/// 
//  public static void z_o_t(int n) {
   

//   for (int i = 1; i<=n; i++) {
//     // inner - how many time will counter wiill be printed 

//      for (int j=1; j<=i; j++) {
//       if((i+j) % 2 == 0 ) {
//         //even
//         System.out.print("1");
//       } 
//       else {
//         System.out.print("0");
//       }
  
//   }

//     System.out.println();
//   }
 
// }

// public static void main(String args[])  {
//   z_o_t(5);

// }


///////////////////////////////////  butterfly patternn /////////////
/// 
/// 


// public static void butterfly(int n)  {
//   //  1st half 
//   for (int i = 1; i<=n; i++) {


//     // stars 
//      for ( int j = 1; j<=i; j++) {
//       System.out.print("*");

//      }
 
//     // spaces 
//    for ( int j=1; j<= 2*(n-i); j++) {
//     System.out.print(" ");

//    }

//     // stars 
//     for( int j=1; j<=i; j++) {
//       System.out.print("*");
//     }
//       System.out.println();
//   }
//   /// 2nd half code /////

//   for (int i = n; i>=1; i--) {


//     // stars 
//      for ( int j = 1; j<=i; j++) {
//       System.out.print("*");

//      }
 
//     // spaces 
//    for ( int j=1; j<= 2*(n-i); j++) {
//     System.out.print(" ");

//    }

//     // stars 
//     for( int j=1; j<=i; j++) {
//       System.out.print("*");
//     }
//     System.out.println();
//   }

  
// } 
// public static void main(String args[]) {
//   butterfly(4);

// }


//////////////// soolid rhombus //////////////////// ///////////
/// 
//  public static void s_r(int n ) {
//   for (int i = 1; i<=n; i++) {
//     // spaces 

//     for (int j =1; j<=(n-i); j++) {
//       System.out.print( " ");
//     }

//     // stars 
//     for (int j =1; j<=n; j++) {
//       System.out.print("*");
//     }
//      System.out.println();
//   }    


//  }

//  public static void main(String args[]) {
//   s_r(5);

//  }

//////////////////////////////////// HOLLOW RHOMBUS ////////////////////////////////////////////
/// 

// public static void h_r (int n ) {
//   for (int i =1; i<=n; i++) {
//     // spaces 
//      for(int j=1; j<=(n-i); j++) {
//       System.out.print(" ");

//      }
//      // hollow rectangle - stars 
//       for (int j=1;j<=n; j++) {
//           if(i == 1 || i == n || j == 1 || j == n) {
//             System.out.print("*");


//           } else {
//             System.out.print(" ");

//           }
//       }
//         System.out.println();

//   }
// }

// public static void main(String args[]) {
//   h_r(13);
// }     ///////////////////// diamond patttern ////////////////////////////////////////////////////////////

// public static void d_p(int n) {
//   for (int i = 1; i <= n; i++) {
//     // spaces 
//     for (int j =1; j<=(n-i); j++) {
//       System.out.print(" ");

//     }
//     // STARS 
//     for (int j = 1; j<=(2*i)-1; j++) {
//       System.out.print("*");

//     }
//     System.out.println();
//   }
//   // 2nd half  ////////////////////
//     for (int i = n; i >= 1; i--) {
//     // spaces 
//     for (int j =1; j<=(n-i); j++) {
//       System.out.print(" ");

//     }
//     // STARS 
//     for (int j = 1; j<=(2*i)-1; j++) {
//       System.out.print("*");

//     }
//     System.out.println();
//   }
// }

// public static void main(String args[]) {
//   d_p(4);
// }

//                   ////////////// PRACTISE SESSION QUESTIOND //////////
// public static void s_t(int n) {
//   for(int i = 1; i<=n ; i++)  {
//     // spaces 
//     for ( int j = 1; j<=n-i; j++) {
//       System.out.print("  ");

//     }
//     // numners 
//     for ( int j = n; j >= n-i+1; j--){
//             System.out.print( j + " ");




//     }
//     System.out.println();

//   }

  
// }

// public static void main(String args[]) {
//   s_t(5);
// }



//                   //////////// PRACTISE SESSION QUESTIOND 2 //////////
// public static void y_t(int n) {
//   for(int i = 1; i<=n ; i++)  {
//     // spaces 
//     for ( int j = 1; j<=n-i; j++) {
//       System.out.print("  ");

//     }
//     // numners 
//     for ( int j = 1; j <= i; j++){
//             System.out.print( j +" ");




//     }
//     System.out.println();

//   }

  
// }

// public static void main(String args[]) {
//   y_t(5);
// }


                  //////////// PRACTISE SESSION QUESTIOND 2 //////////
// public static void y_t(int n) {
//   for(int i = 1; i<=n ; i++)  {
//     // spaces 
//     for ( int j = 1; j<=n-i; j++) {
//       System.out.print(" ");

//     }
//     // numners 
//     for ( int j = 1; j <= i; j++){
//             System.out.print(  "* ");




//     }
//     System.out.println();

//   }

  
// }

// public static void main(String args[]) {
//   y_t(5);
// }


////////////// THANK Y0U/////////////// 