// sting is palandrom or not //////////////////////////////



// import java.util.*;
// public class string {

//     public static boolean word(String str){
//         for(int i = 0; i<str.length()/2; i++){
//                     int n = str.length();

//             if(str.charAt(i) != str.charAt(n-i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//      String str = "racecar";
//      System.out.print(word(str));
//     }
// }


// ques 2  shortest path destination 
// import java.util.*;
// public class string {
//     public static float findshortestpath(String path){
//         int x =0, y = 0;
//         for(int i = 0; i<path.length();i++){
//             char dir = path.charAt(i);
//             // north 
//             if(dir == 'N'){
//                 y++;
//             }
//             // WEST 
//             else if(dir == 'W'){
//                 x--;

//             }
//              else if(dir == 'S'){
//                 y--;
//             }
//             else {
//                 x++;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2 + Y2);

//     }
//     public static void main(String args[]){
//         String path = "WNEENESENNN";
//         System.out.println(findshortestpath(path));
//     }
// }


// string functions subssting 

// import java.util.*;
// public class string {
//     public static String substring( String str, int si, int ei){
//         String sush = "";
//         for(int i = si; i<ei; i++){
//             sush += str.charAt(i);
//         }
//         return sush;
//     }
//     public static void main(String args[]){
//         String str = "helloworld";
//         System.out.print(substring(str,0,5));
//     }
// }

//  or 
 
// import java.util.*;
// public class string {
//     public static void main(String args[]){
//         String str = "hellowold";
//         System.out.println(str.substring(0,6));
//     }
// }

// a given set find largest string 


//   import java.util.*;
//     public class string {
//         public static void main(String args [] ){
//             String fruits[] = {"apple", "mango", "kerry"};
//             String largest = fruits[0];
//             for(int i = 0 ; i<fruits.length; i++){
//                 if(largest.compareTo(fruits[i])<0) {
//                     largest = fruits[i];
//                 }
//             }
//             System.out.print(largest);
//         }
//     }
  // String builder //  

  // import java.util.*;
  // public class string {
  //   public static void main(String args[]){
  //       StringBuilder sb  = new StringBuilder(" ");
  //       for(char ch = 'a' ; ch<='z';ch++){
  //           sb.append(ch);
  //       }
  //       System.out.println(sb);
  //                System.out.println(sb.length());

  //   }
  // }

//   time complexity O(26)
//  time complexity if we choose += string in place of append then O(n^2)



// Q4 for a given string covert first word as uppercase 

// import java.util.*;
// public class string {
//   public static String touppercase(String sus){
//     StringBuilder st = new StringBuilder("");
//     char ch = Character.toUpperCase(sus.charAt(0));
//     st.append(ch);
//     for(int i = 1; i<sus.length(); i++){
//       if(sus.charAt(i)== ' ' && i<sus.length()-1){
//         st.append(sus.charAt(i));
//         i++;
//         st.append(Character.toUpperCase(sus.charAt(i)));
//       }
//       else {
//         st.append(sus.charAt(i));
//       }
//     }
//     return st.toString();
//   }
//   public static void main(String args[]){
//     String sus = "hi, myself sushant tiwari";
//     System.out.println(touppercase(sus)
// );
//   }
// }
 // // time complexity O(n);

 ///   @5 #string compression ?????//// 

//  import java.util.*;
//  public class string {
// public static String compression(String str){
//     String newstr = "";
//     for (int i = 0 ; i<str.length(); i++){
//          Integer count = 1;
//          while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//           count++;
//           i++;
//          }
//          newstr += str.charAt(i);
//          if(count>1){
//           newstr += count.toString();
//          }


//     }
//     return newstr;
// }  
//   public static void main(String args[]){
//     String str = "aaabbbbbccdeeeeeewwwwwr";
//     System.out.println(compression(str));
//   }
//  }


////////////////////////////////// hw /////////// 
// import java.util.*;
// public class string { 
//   public static int vowels(String st){
//     Integer count = 0; 
//     for(int i = 0 ; i<st.length(); i++){
//       char ch = st.charAt(i);
//       if(ch =='i' || ch == 'a' || ch =='e' || ch == 'o' || ch == 'u'){
//               count++;

//       }
      
//     }
//     return count;
//   }
//   public static void main(String args[]){
//    String st = "apna college ";
//    System.out.print(vowels(st));
//   }
// }

