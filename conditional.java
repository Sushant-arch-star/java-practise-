 // codition statement 
//  # IF ELSE ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // import java.util.*;
    //  public static void main(String args[]) {
    //     int age = 17;
    //     if (age >= 18) {
    //         System.out.println("adult");

    //     } 
    //     else {
    //         System.out.println("not adult");

    //     }

//     //  } 
//     // PRINT THE LARGEST 2 N0.
   
//   import java.util.*;
//   public class conditional {
//     public static void main(String args[]) {
//         int A=1;
//         int B=2;

//         if (A>= B) {
//             System.out.println("A is the largest among 2");

//         }
//         else {
//             System.out.println("B is the greatest among 2");
//         }
        
//     }
///////////////////////// or ////
//    import java.util.*;
//    public class conditional {
//     public static void main(String args[]) {
//         int r=45;
//         int h=264;
//         if(r>h) 
//             System.out.println("r is largest among of two ");


        
        
//             System.out.println("h is larrgest");
        


//     }
//    }

// import java.util.*;


///odd or even
// public class conditional {
//     public static void main(String args[]) {
//         // Scanner sc = new Scanner(System.in);
//         // int number = sc.nextInt();
   

//         // if(number % 2 == 0) {
//         //     System.out.println("even");

//         // }
//         // else {
//         //     System.out.println("odd");

//         // }
//   or/// 


// import java.util.*; 
// public class conditional {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if(number%2==0) 
//             System.out.println("even");
//        else
//         System.out.println("odd");

//     }

// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// # ELSE-IF

// //         int income  = sc.nextInt();
// //         int tax = 0;

// //         if(income < 500000) {
// //             tax = 0;


// //         }
// //         else if (income >= 500000 &&  income < 1000000) {
// //             tax =(int) (income * 0.2);


// //         }
// //         else {
// //              tax =(int) (income * 0.3);

// //         }
//         // System.out.println("your tax is : "+ tax);

////////////////////////////////////////////////////////////
//     //     int A = 1,B = 3, C = 6;

//     //     if ((A > B ) && (A >= C)) {
//     //         System.out.println("largest is A");

//     //     } else if (B>= C) {
//     //           System.out.println("largest is B");
              


//     //     }
//     //     else {
//     //         System.out.println("largest is C");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   # SWITCH
//     //     }
//     //   int number = 3;
//     //  switch(number) {
//     //     case 1: System.out.println("Butter chicken");
//     //     break;

//     //     case 2: System.out.println("mutton meat");
//     //     break;

//     //     case 3:
//     //         System.out.println("biryani");
//     //         break;
//     //     default: System.out.println("sapna tha bhai!");

                              // CALCUATOR ////////////////////////////////////////////////////////////////////////////////////////////
//      Scanner sc  = new Scanner(System.in);
//      System.out.println("enter a : ");
//      int a = sc.nextInt();
//      System.out.println("enter b : ");

//      int b = sc.nextInt();
//      System.out.println("enter operator : ");

//      char operator = sc.next().charAt(0);

//      switch(operator) {
//         case '+' :
//             System.out.println(a+b);
//             break;

//              case '-' :
//             System.out.println(a-b);
//             break;
            
//              case '*' :
//             System.out.println(a*b);
//             break;
            
//              case '/':
//             System.out.println(a/b);
//             break;
            
//              case '%' :
//             System.out.println(a%b);
//             break;
//             default : System.out.println("lund calculator");
            
  
//            }

//        }

//      }



// assignment on condition statements questions ////////////////////////////////////////////////////////////////////////////////////////////////


// import java.util.*;
// public class conditional {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         if(x>=0) {
//             System.out.println("x is +ve");

//         } else {
//             System.out.println("x is -ve");

//         }



//     }

// }

// or 
// import java.util.*;
// public class conditional {
//  public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     if( num <=0)
//  {
//     System.out.println("num is -");

//  }
//  else {
//     System.out.println("+");
//  }
//  }
// }

// // // //@@2/////////////////////////////////////////////////////////////


// import java.util.*;
//  public class conditional {
//     public static void main(String args[]) {

//         double temp = 103.4;

//         if(temp>=100) {
//             System.out.println("you have fiver");

//         }
//         else {
//             System.out.println("you have n't fever oky boss!");

//         }

// //     }

// // }
///////////////////////////////////////////////////////////////////////
// import java.util.*;
// public class conditional{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter week number :");
//         int week = sc.nextInt();

//         switch(week) {
//             case 1: 
//             System.out.println("monday");
//             break;

//             case 2: 
//             System.out.println("tuesday");
//             break;
//             case 3: 
//             System.out.println("wednesday");
//             break;
//             case 4: 
//             System.out.println("thursday");
//             break;
//             case 5: 
//             System.out.println("friday");
//             break;
//             case 6: 
//             System.out.println("saturday");
//             break;
//             case 7:
//             System.out.println("sunday");
//             break;
//             default:
//                 System.out.println("invalid input! please enter week number between 1 to 7");


//         }

//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.*;
// public class conditional {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("input the year :");

//         int year = sc.nextInt();

//         boolean x = (year % 4) == 0;
//         boolean y = (year % 100) != 0;
//         boolean z = ((year % 100 == 0) && (year % 400 == 0));

//         if (x && (y||z)) {
//             System.out.println(year + "is a leap year");
            
//         } else {
//             System.out.println(year + " is not a leap year");
//         }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
     
//     }
// }
// import java.util.*;
// public class conditional {
//     public static void main(String args[]) {
//         System.out.print("****\n***\n**\n*\n");

//     }
// }
 
/////////////////////////// THANKYOU ////////////////////