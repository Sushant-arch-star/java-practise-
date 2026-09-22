// import java.util.*;
// public class twoDarr{
//     // for search 
//     public static boolean search(int matrix[][],int key){
        
//         for(int i = 0; i<matrix.length;i++){
//             for(int j= 0; j<matrix[0].length;j++){ 
//                 if(matrix[i][j] == key){
//                     System.out.println("found"+"(" +  i + "," + j + ")");
//                     return true;

//                 }
                
                
//             }
//         } 
//         return false;
//     }
//     public static void main(String [] args ){
//         // for input 
//         int matrix [][] = new int [3][3];
//         int n = matrix.length, m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0 ; i<n; i++){
//             for (int j = 0; j<m;j++){
//                 matrix[i][j] = sc.nextInt();

//             }

//         }
//         // for output 
//         for(int i = 0 ; i<n; i++){
//             for (int j = 0; j<m;j++){
//          System.out.print(matrix[i][j] + " ");


//             }
//             System.out.println();

//         }
//             System.out.print(search(matrix,5));

//     }
// }


////////////////////////////////// for max key ///////////////

// import java.util.*;
// public class twoDarr{
//     // for search 
//     public static void search(int matrix[][]){
//         int max = matrix[0][0];
        
//         for(int i = 0; i<matrix.length;i++){
//             for(int j= 0; j<matrix[0].length;j++){ 
//                 if(matrix[i][j]>max){
//                     max= matrix[i][j];
                   
//                 }
//                 matrix[i][j]++;
                
                
//             }
            
//         } 
//         System.out.print("maximum is " + max);
//     }
//     public static void main(String [] args ){
//         // for input 
//         int matrix [][] = new int [3][3];
//         int n = matrix.length, m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0 ; i<n; i++){
//             for (int j = 0; j<m;j++){
//                 matrix[i][j] = sc.nextInt();

//             }

//         }
//         // for output 
//         for(int i = 0 ; i<n; i++){
//             for (int j = 0; j<m;j++){
//          System.out.print(matrix[i][j] + " ");


//             }
//             System.out.println();

//         }
//             search(matrix);

//     }
// }
///////////////////////////////
/////////////////////// spiral matrix /////////////////////// 
// import java.util.*;
// public class twoDarr {
//     public static void spiral(int matrix[][]){
//         int sr = 0;
//         int er = matrix.length-1;
//         int sc = 0;
//         int ec = matrix[0].length-1;

//         while(sr<=er && sc <=ec){
//             // top 
//             for(int j = sc ; j<=ec ; j++){
//                 System.out.print(matrix[sr][j] + " ");
//             }
//             // right 
//             for (int i = sr +1 ; i<=er;i++){
//                  System.out.print(matrix[i][ec] + " ");

//             }
//             // bottom 
//             for (int j = ec -1 ; j>=sc; j--){
//                 if(sr == er){
//                     break;
//                 }
//              System.out.print(matrix[er][j] + " ");
             
//             }
//             // left 
//             for (int i = er -1 ; i>=sr +1 ; i--){
//                 if(sc == ec){
//                     break;
//                 }
//                 System.out.print(matrix[i][sc] + " ");


//             }
//             sr++;
//             er--;
//             sc++;
//             ec--;
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int matrix [][] = {{1,2,3,4},
//                           {5,6,7,8},
//                            {9,10,11,12},
//                         {13,14,15,16}};
                
//        spiral(matrix);
//     }
// }

/// diagonals sum /////////   
///   
      ///   
      

//       import java.util.*;
//       public class twoDarr{
//         public static int diagonal(int matrix[][]){
//            int sum = 0;
//            for(int i = 0; i<matrix.length;i++){
//             for (int j = 0 ; j<matrix[0].length; j++){
//                 if(i == j){
//                     sum += matrix[i][j];

//                 }
//                 else if(i+j == matrix.length-1){
//                     sum += matrix[i][j];
//                 }
//             }
//            }
//            return sum;
//         }
//         public static void main(String args[]){
//                      int matrix [][] = {{1,2,3,4},
//                            {5,6,7,8},
//                             {9,10,11,12},
//                         {13,14,15,16}};
// System.out.print(  diagonal(matrix)
// );        }
//     } 

/// but time complexity is O(n^2)
/// 
/// 
// 
 ///////////////////// optimal soln 

//       import java.util.*;
//       public class twoDarr{
//         public static int diagonal(int matrix[][]){
//            int sum = 0;
       
//         for (int i = 0; i<matrix.length;i++){
//             // pd 
//             sum += matrix[i][i];
//             // sd 
//             if(i!= matrix.length-1-i)
//             sum += matrix[i][matrix.length-1-i];
//         }
//            return sum;
//         }
//         public static void main(String args[]){
//                      int matrix [][] = {{1,2,3,4},
//                            {5,6,7,8},
//                             {9,10,11,12},
//                         {13,14,15,16}};
// System.out.print(  diagonal(matrix)
// );        }
//     } 
/////////////////////// 
/// sorted array for both col and row 
// import java.util.*;
// public class twoDarr {
//       public static boolean sort(int matrix[][], int key){
//             int row = 0, col = matrix[0].length-1;
//             while(row < matrix.length && col>=0){
//                   if(matrix[row][col] == key){
//                         System.out.print("found key at " + "(" +  row + "," + col + ")");
//                         return true;
//                   }
//                   else if(key < matrix[row][col]){
//                         col--;
//                   }
//                   else{
//                         row++;
//                   }

//             }
//                    System.out.print("not found");
//                   return false;
//       }
//       public static void main(String args[]){
//             int matrix[][] = {{10,20,30,40},
//                                    {15,25,35,45},
//                               {27,29,37,48},
//                         {32,33,45,50}}; 
//          int key = 33;
//          sort(matrix,key);
//       }
// }
// // time complexity = 0(n+m)






 //////////////////////////////// assignment /////////         
  

 // q1 // 
//  import java.util.*;
//  public class twoDarr{
//       public static void sevens(int matrix[][]){
//             int count = 0;
//             for(int i = 0; i<matrix.length; i++){
//                   for (int j =0 ; j<matrix[0].length;j++){
//                         if(matrix[i][j]/7==1 && matrix[i][j]%7==0){
//                               count++;

//                         }
//                   }
//             }
//             System.out.println(count);
//       }
//       public static void main(String args[]){
//             int matrix[][] = {{4,7,8},{8,8,7}};
//             sevens(matrix);
//       }
//  } 

// or // 
//  import java.util.*;
//  public class twoDarr{
//       public static void sevens(int matrix[][], int key){
//             int count =0;
//             for(int i = 0 ; i<matrix.length; i++){
//                   for (int j= 0 ; j<matrix[0].length;j++){
//                         if(matrix[i][j] == 7){
//                               count++;
//                         }
                      
//                   }
//             }
//             System.out.println(count);
           
//       }
//       public static void main(String args[]){
//             int matrix[][] = {{4,7,8},{8,8,7}};
//             int key = 7;
//             sevens(matrix,key);
//       }
// }
/////////////////////////////// q2 //////////////////////  



// import java.util.*;
// public class twoDarr {
//       public static void sun(int matrix[][]){
//             int sum = 0;
//             for(int j= 0 ; j<matrix[0].length;j++){
//                   sum+=matrix[1][j];
//             }
//             System.out.print("SUm is " + sum);
//       }
//       public static void main(String args[]){
//        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
//        sun(matrix);
//       }
// }


// what if we need to find col 

// import java.util.*;
// public class twoDarr {
//       public static void sun(int matrix[][]){
//             int sum = 0;
//             for(int i= 0 ; i<matrix.length;i++){
//                   sum+=matrix[i][2];
//             }
//             System.out.print("SUm is " + sum);
//       }
//       public static void main(String args[]){
//        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
//        sun(matrix);
//       }
// }

//////////////////// q3 ///// 


// // transpose the matrix 
// import java.util.*;
// public class twoDarr {
//       public static void main(String args[]){
//             int row = 2, col = 3;
//             int matrix[][] = {{2,3,7},{5,6,7}};
//             pmatrix(matrix);
//              int transpose[][] = new int[col][row];
//             for(int i = 0; i<row;i++){
//               for(int j= 0; j<col;j++){
//                   transpose[j][i] = matrix[i][j];
//               }
//             }

      
//             pmatrix(transpose);
//       }
//       // for the matrix 
//       public static void pmatrix(int matrix[][]){
//             System.out.println("the matix is : ");
//             for(int i = 0; i<matrix.length;i++){
//                   for(int j= 0; j<matrix[0].length;j++){
//                         System.out.print(matrix[i][j]+ " ");
//                   }
//                   System.out.println();
//             }
            
      
//       }
           

// }