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

import java.util.*;
public class twoDarr{
    // for search 
    public static void search(int matrix[][]){
        int max = matrix[0][0];
        
        for(int i = 0; i<matrix.length;i++){
            for(int j= 0; j<matrix[0].length;j++){ 
                if(matrix[i][j]>max){
                    max= matrix[i][j];
                   
                }
                matrix[i][j]++;
                
                
            }
            
        } 
        System.out.print("maximum is " + max);
    }
    public static void main(String [] args ){
        // for input 
        int matrix [][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n; i++){
            for (int j = 0; j<m;j++){
                matrix[i][j] = sc.nextInt();

            }

        }
        // for output 
        for(int i = 0 ; i<n; i++){
            for (int j = 0; j<m;j++){
         System.out.print(matrix[i][j] + " ");


            }
            System.out.println();

        }
            search(matrix);

    }
}