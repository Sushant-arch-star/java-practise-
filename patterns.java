

///////////////////////// LECTURE 6 /////////////////////////
/////////////////// patterns ////////////////////////////////
 
// import java.util.*;
// public class patterns {
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
// //  public class patterns {
// //   public static void main(String args[]) {
// //     int n =4;
// //       for (int line = 1; line<=4; line++) {
// //       for (int star = 1; star <= n-line+1; star++ ) {
// //         System.out.print("$");

// //       }System.out.println();
// //      }

// //   }
// //  }
////////////////  or  /////////////////////
// import java.util.*;
// public class patterns {
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int i =1; i<=n;i++){
//       for (int j =1 ; j<=n-i+1;j++){
//         System.out.print("^");
//       }
//       System.out.println();
//     }

//   }
// }
     ////// half pyramid pattern /////////////// 

//  import java.util.*;
//  public class patterns {
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
// //  public class patterns {
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

////////////////////// question is ///////////
/// 
/// a
/// ab
/// abc
/// abcd
/// abcde
//  import java.util.*;
//  public class patterns {
//   public static void main(String args[]){
//     int n = 5;
//     for(int i=1; i<=n;i++){
//           char ch = 'A';

//       for(int j =1;j<=i;j++){
//         System.out.print(ch);
//         ch++;

//       }
//       System.out.println();
//     }
//   }
//  }


                  ////// lecture 8 ////////////
                  /// 
 ////////////////////////////////////////// ADVANCED PATTERN QUESTIONS ///////////////////////////////////////////////////////
  ////////////////// HOLLOW RECTANGLE /////////////////////////////

//  public class patterns {
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