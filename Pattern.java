//1
//12
//123
//1234
//12345
// public class Pattern {
//     public static void main(String[]args){
//         for (int i=1;i<=5 ;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }




// 5
// 54
// 543
// 5432
// 54321

// public class Pattern {
//     public static void main(String[]args){
//         for (int i=5;i>=1 ;i--){
//             for (int j=5;j>=i;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



// 1
// 21
// 321
// 4321
// 54321
// public class Pattern {
//     public static void main(String[]args){
//         for (int i=1;i<=5 ;i++){
//             for (int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



// 12345
// 1234
// 123
// 12
// 1
// public class Pattern {
//     public static void main(String[]args){
//         for (int i=1;i<=6;i++){
//             for (int j=1;j<=6-i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// 54321
// 4321
// 321
// 21
// 1
// public class Pattern{
//     public static void main(String[]args){
//         for (int i=6;i>=1;i--){
//             for (int j=6;j>=6-i;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



// 1
// 22
// 333
// 4444
// 55555
// public class Pattern{
//     public static void main(String[]args){
//         for(int i=1;i<=5;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }



//1               1
//1 2           2 1
//1 2 3       3 2 1
//1 2 3 4   4 3 2 1
//1 2 3 4 5 4 3 2 1

// public class Pattern{
//     public static void main(String[]args){
//         for (int i=1;i<=5;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             for (int k=0;k<4*(5-i);k++){
//                 System.out.print(" ");
//             }
//             for (int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println();

//         }
        
//     }
// }