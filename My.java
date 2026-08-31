/**5
input 10 20 30 40 50
output 50 40 30 20 10 */

// import java.util.Scanner;
// public class My {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//         int[]b=new int[a];
//         for (int i=0;i<a;i++){
//             b[i]=in.nextInt();
//         }
//         for(int i=a-1;i>=0;i--){
//             System.out.print(b[i]);
//         }
//     }
// }



/*6
input 12 45 7 89 34 56
output 89*/
// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//         int [] b= new int [a];
//         for (int i=0;i<a;i++){
//             b[i]=in.nextInt();
//         }
//         int max=0;
//         b[0]=max;
//         for(int i=0;i<a;i++){
//             if (b[i]>max){
//                 max=b[i];
//             }
//         }
//         System.out.println(max);
//     }
// }





// public class My {
//     public static void main(String[] args) {
//         String str = "  Java Programming is FUN!  ";
        
//         // 1. Trim whitespace
//         str = str.trim();
//         System.out.println("Trimmed: " + str);  // "Java Programming is FUN!"
        
//         // 2. Convert to lowercase
//         System.out.println("Lowercase: " + str.toLowerCase());
        
//         // 3. Get length
//         System.out.println("Length: " + str.length());
        
//         // 4. Check if contains "Programming"
//         System.out.println("Contains 'Programming': " + str.contains("Programming"));
        
//         // 5. Extract substring
//         System.out.println("First 10 chars: " + str.substring(0, 10));
        
//         // 6. Split into words
//         String[] words = str.split(" ");
//         System.out.println("Words:");
//         for (String word : words) {
//             System.out.println("  - " + word);
//         }
        
//         // 7. Replace characters
//         System.out.println("Replace 'a' with '@': " + str.replace('a', '@'));
        
//         // 8. Using StringBuilder (efficient concatenation)
//         StringBuilder sb = new StringBuilder();
//         for (String word : words) {
//             sb.append(word).append("-");
//         }
//         sb.deleteCharAt(sb.length() - 1);  // Remove trailing '-'
//         System.out.println("Joined with '-': " + sb.toString());
//     }
// }



/*input i love java programming
out put is programming java love i */
// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         String a = in.nextLine();
//         String result ="";
        
//         String s = a.trim();
//         String [] arr = s.split(" ");
//         for (int i = arr.length-1;i>=0;i--){
//             result = result + arr[i]+" ";
//         }
//         System.out.println(result);
//     }
// }





/*Programming
vowels = 3*/
// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         String a = in.next();
//         int count =0;
//         for(int i=0;i<a.length();i++){
//             char ch = a.charAt(i);
//         if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//             count++;
//         }
//         }
//        System.out.println(count);
//     }
// }


// frequncy array??? 
// koko eats banana
// linaer and binary 
//v 


/*input madam
output palidrome */
// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         String a = in.nextLine();
//         String og = a;
//         String result ="";
//         String[] s = a.split(" ");
//         for (int i=s.length-1;i>=0;i--){
//             result = result + s[i];
//         }
//         if (og.equals(result)){
//             System.out.println("palidrome");
//         }
//         else{
//             System.out.println("not a palidrome");
//         }
        
//     }
// }


/*
read the line of marks and name and print the name+ marks with max marks : sachin ;34, geeta;85,jajeesh;44, harish;98,deepak;56
sort an array the array of a string as per the dictionary order: this apple is not good => apple good is not this 
from the digits of a given integer , create a smallest possible integer: 30540=>30045 */


// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         String s = in.nextLine();
//         String[] str = s.split(" ");
//         int count=0;
//         for (String word : str){
//             if(pal(word)){
//                 count ++;
//             }
//         }
//         System.out.println(count);


//     }
//     public static boolean  pal(String word){
//         word = word.toLowerCase();
//         int left = 0;
//         int right =  word.length()-1;
//         while(left < right){
//             if (word.charAt(left)!= word.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }


// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         int m = in.nextInt();
//         int n = in.nextInt();
//         int [][] arr = new int[m][n];
//         for (int i=0;i<m;i++){
//             for (int j=0;j<n;j++){
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         int max = arr[0][0];
//         int min = arr[0][0];
//         for (int i=0;i<m;i++){
//             for (int j=0;j<n;j++){
//                 if (max<arr[i][j]){
//                     max= arr[i][j];
                    
//                 }
//                 if (min>arr[i][j]){
//                     min = arr[i][j];
                

//                 }
//             }
//         }
//         System.out.println(max);
//         System.out.println(min);


       
//     }
// }


// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         int m = in.nextInt();
//         int n = in.nextInt();
//         int [][] arr= new int [m][n];
//         for (int i=0;i<m;i++){
//             for (int j=0;j<n;j++){
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         for (int i=0;i<n;i++){
//             for (int j=0;j<m;j++){
//                 System.out.print(arr[j][i]+" ");
//             }
//             System.out.println();
//         }     
//     }
// }



// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         int m = in.nextInt();
//         int n = in.nextInt();
//         int [][] arr= new int [m][n];
//         for (int i=0;i<m;i++){
//             for (int j=0;j<n;j++){
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         boolean identity=true;
//         if(m!=n){
//             identity = false;
//         }else{
//             for (int i=0;i<n;i++){
//                 for (int j=0;j<m;j++){
//                     if(i==j && arr[i][j]!=1){
//                         identity= false ;
//                     }
//                     if (i!=j && arr[i][j]!=0){
//                         identity = false;
//                     }
//                 }
//             }
//         }
//         if (identity ){
//             System.out.println("Yes");
//         }else{
//             System.out.println("No");
//         }
        
//     }
// }


// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         int m = in.nextInt();
//         int n = in.nextInt();
//         int [][] arr= new int [m][n];
//         int [][] arr1 = new int [m][n];
//         for (int i=0;i<m;i++){
//             for (int j=0;j<n;j++){
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         for (int i=0;i<m;i++){
//             for (int j=0;j<n;j++){
//                 arr1[i][j]=in.nextInt();
//             }
//         }
//         for (int i=0;i<n;i++){
//             for (int j=0;j<m;j++){
//                 System.out.print(arr[i][j]+ arr1[i][j]+" ");
//             }
//             System.out.println();
//         }     
//     }
// }



// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         int m = in.nextInt();
//         int n = in.nextInt();
//         int [][] arr= new int [m][n];
//         for (int i=0;i<m;i++){
//             for (int j=0;j<n;j++){
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         int top=0;
//         int bottom = m-1;
//         int left=0;
//         int right = n-1;
//         while(top<=bottom && left <= right){
//         for (int j=left;j<=right;j++){
//             System.out.println(arr[top][j]);
//         }
//         top++;
//         for (int i=top;i<=bottom;i++){
//             System.out.println(arr[i][right]);
//         }
//         right--;
//         for (int j=right;j>=left;j--){
//             System.out.println(arr[bottom][j]);
//         }
//         bottom--;
//         for (int i=bottom;i>=top;i--){
//             System.out.println(arr[i][left]);
//         }
//         left++;
//         }     
//     }
// }



// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         String str = in.nextLine();
//         String[] s = str.split(" ");
        
       
//     }
// }


// input :
// 3 3 
// 1 2 3 
// 4 5 6
// 1 1 1
// 2 
// 2
// output:
// 3+10=13;
// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         int m = in.nextInt();
//         int n = in.nextInt();
//         int [][] arr = new int[m][n];
//         for (int i=0;i<m;i++){
//             for (int j=0;j<n;j++){
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         int sum =0;
//         int sum1 = 0;
//         int p;
//         int a = in.nextInt();
//         int b = in.nextInt();
//         for (int i=0;i<m;i++){
//             sum+=arr[i][b];
//             for (int j=0;j<n;j++){
//             }
//         }
//         System.out.println(sum);
//         for (int j=0;j<n;j++){
//             sum1+=arr[a][j];
//             for (int i=0;i<m;i++){
//             }
//         }
//         System.out.println(sum1+sum);
//     } 
// }




// import java.util.Scanner;
// public class My{
//     public static void main(String []args){
//         Scanner in = new Scanner(System.in);
//         int m = in.nextInt();
//         int n = in.nextInt();
//         int[][] arr = new int [m][n];
//         for (int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j]= in.nextInt();
//             }
//         }
//         int sum=0;
//         for (int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if (i==j){
//                     sum+=arr[i][j];
//                 }
//             }
//         }
//         System.out.println(sum);
//     }
// }


// input : aaabcaadd
// output : a3bca2d2
// import java.util.Scanner;
// public class My{
//     public static void main(String[]args){
//         Scanner in = new Scanner(System.in);
//         String str = in.next();
//         String st = str.trim();
//         String [] s = st.split(" ");
//         System.out.println(st);
//     }
// }


// 
//input:
//3
// 27
//output:
// 31
// 4
// next day somthing like this ques what could be the answer 


// input:
// 1 2 3 
// 4 5 6
// 7 8 9

// output:
// 7 4 1 
// 8 5 2 
// 9 6 3


// input :
// abcd 45abd 56aff
// 45
// output:
// wrong
// right 
// left 
// 56 


// 11123333311
// 1323512
