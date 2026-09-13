// import java.util.Scanner;
// public class A {
//     public static void main(String[]args){
//         System.out.println("welcome");
//         Scanner input = new Scanner (System.in);
//         System.out.println("enter a no.");
//         int n = input.nextInt();
//         if (n>0)
//             System.out.println("positive ");
//         else 
//             System.out.println("negative");
        
        
//     }
// }


// import java.util.Scanner;
// public class A {
//     public static void main (String[]args){
//         Scanner input = new Scanner (System.in);
//         System.out.println("enter marks");
//         int marks = input.nextInt();
//         if (marks>50)
//             System.out.println("pass");
//         else 
//             System.out.println("fail");
//     }
// }


// import java.util.Scanner;
// public class A {
//     public static void main(String[]args){
//         Scanner input  = new Scanner (System.in);
//         System.out.println("enter 2 integers ");
//         int x = input.nextInt();
//         int y = input.nextInt();
//         if (x>y)
//             System.out.println(x);
//         else 
//             System.out.println(y);
    
//     }
// }



// 1.write a function to print 1 to 10 in a single line 
// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("enter thr no.");
//         int x = input.nextInt();
//         for (int i=0;i<=x;i++){
//             System.out.print(i+" "); // output in one line in loops the we use print()
//         }
//     }
// }


// 2.write a function to print table of 7
// import java.util.Scanner;
// public class A {
//     public static void main(String[]args){
//         Scanner input = new Scanner (System.in);
//         System.out.println("enter thr no.");
//         int x = input.nextInt();
//         for (int i=0;i<=10;i++){
//             System.out.println(x+"X"+i+"="+i*x);
//         }
//     }
// }



// 3.write a function to print table of given integer 
// import java.util.Scanner;
// public class A {
//     public static void main(String[]args){
//         Scanner input = new Scanner (System.in);
//         System.out.println("enter thr no.");
//         int x = input.nextInt();
//         for (int i=0;i<=10;i++){
//             System.out.println(x+"X"+i+"="+i*x);
//         }
//     }
// }



// 4.write a function to print
// 3 5 6 10 9 15 12 20 15 25 (21 terms in total)
// import java.util.Scanner;
// public  class A{
//     public static void main(String []args){
//         Scanner input =new Scanner (System.in);
//         System.out.println("enter the no.");
//         int n = input.nextInt();
//         // int y = input.nextInt();
//         for (int i=1;i<=n;i++){
//             System.out.print(3*i+" "+5*i+" ");
            
//         }
//     }
// }



// ################################################################ array ques practice ################################################
// 🟢 Level 1: Basic (Very Easy)

// Q1.Create an integer array of size 5 and store:
// 10 20 30 40 50 Print all elements.
// public class A{
//     public static void main(String []args){
//         int []b={10,20,30,40,50};
//         for (int i=0;i<5;i++){
//             System.out.print(b[i]+" ")  ;      }
//     }
// }


// Q2. Take 5 integers from the user and store them in an array.
// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner (System.in);
//         int[] b = new int[5];
//         for (int i=0;i<5;i++){
//             b[i]=input.nextInt();
//         }
//         for (int i=0;i<5;i++){
//             System.out.print(b[i]+" ");
//         }
//     }
// }

// Q3. Print an array using a for loop.
// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner (System.in);
//         int[] b = new int[5];
//         for (int i=0;i<5;i++){
//             b[i]=input.nextInt();
//         }
//         for (int i=0;i<5;i++){
//             System.out.println(b[i]);
//         }
//     }
// }


// Q4. Print an array using an enhanced for (for-each) loop.
// public class A {
//     public static void main(String[]args){
//         int[]b={1,2,3,4,5,6};
//             for(int num:b){
//                 System.out.print(num+" ");
//         }
// }}

// Q5.Print the length of an array.
// Example: Array = {5,10,15,20}
// Output: Length = 4
// public class A{
//     public static void main(String[]args){
//         int[]b={5,10,15,20};
//         System.out.println(b.length);
//     }
// }


// Q6. Print the first element.
// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner (System.in);
//         int a = input.nextInt();
//         int []b=new int[a];
//         for (int i=0;i<a;i++){
//             b[i]=input.nextInt();
//         }
        
//         System.out.print(b[0]);
        
//     }
// }


// Q7. Print the last element.

// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner (System.in);
//         int a = input.nextInt();
//         int []b=new int[a];
//         for (int i=0;i<a;i++){
//             b[i]=input.nextInt();
//         }
        
//         System.out.print(b[a-1]);
        
//     }
// }

// Q8. Change the third element of an array to 100.
// Example:  Before 10 20 30 40
// After 10 20 100 40
// public class A{
//     public static void main(String[]args){
//         int[]b={10,20,30,40,50};
//         for(int i=0;i<5;i++){
//             b[2]=100;
//             System.out.print(b[i]+" ");
//         }
//     }
// }

// Q9. Print all even-index elements.
// Example 10 20 30 40 50
// Output
// 10
// 30
// 50
// public class A{
//     public static void main(String[]args){
//         int[]b={10,20,30,40,50};
//         for(int i=0;i<5;i++){
//             if(b[i]%2==0){
//                 System.out.println(b[i]+" ");
//             }
//         }
//     }
// }
// Q10. Print all odd-index elements.
// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner(System.in);
//         int x = input.nextInt();
//         int []b=new int [x];
//         for (int i=0;i<x;i++){
//             b[i]=input.nextInt();
//         }
//         for (int i=0;i<x;i++){
//             if(i%2!=0){
//                 System.out.print(b[i]+" ");
//             }
//         }

//     }
// }


// 🟡 Level 2: Sum and Average
// Q11. Find the sum of all elements. Example 10 20 30 40
// Output 100
// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner(System.in);
//         int x= input.nextInt();
//         int [] a= new int[x];
//         for (int i=0;i<x;i++){
//             a[i]=input.nextInt();
//         }
//         int sum=0;
//         for (int i=0;i<x;i++){
//             sum+=a[i];

//         }
//         System.out.println(sum);
//     }
// }

// Q12. Find the average of array elements.
// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner(System.in);
//         int x= input.nextInt();
//         int [] a= new int[x];
//         for (int i=0;i<x;i++){
//             a[i]=input.nextInt();
//         }
//         int sum=0;
//         for (int i=0;i<x;i++){
//             sum+=a[i];

//         }
//         int avg=0;
//         avg=sum/x;
//         System.out.println(avg);
//     }
// }

// Q13. Count how many even numbers are present.Example 10 15 20 17 8
// Output 3
// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner(System.in);
//         int x= input.nextInt();
//         int [] a= new int[x];
//         for (int i=0;i<x;i++){
//             a[i]=input.nextInt();
//         }
//         int count=0;
//         for (int i=0;i<x;i++){
//             if(a[i]%2==0){
//                 count++;
//             }

//         }
//         System.out.println(count);
//     }
// }

// Q14. Count how many odd numbers are present.
// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner(System.in);
//         int x= input.nextInt();
//         int [] a= new int[x];
//         for (int i=0;i<x;i++){
//             a[i]=input.nextInt();
//         }
//         int count=0;
//         for (int i=0;i<x;i++){
//             if(a[i]%2!=0){
//                 count++;
//             }

//         }
//         System.out.println(count);
//     }
// }

// Q15. Find the product (multiplication) of all elements. Example 2 3 4
// Output 24
// import java.util.Scanner;
// public class A{
//     public static void main(String[]args){
//         Scanner input = new Scanner(System.in);
//         int x= input.nextInt();
//         int [] a= new int[x];
//         for (int i=0;i<x;i++){
//             a[i]=input.nextInt();
//         }
//         int mul=1;
//         for (int i=0;i<x;i++){
//             mul*=a[i];

//         }
//         System.out.println(mul);
//     }
// }


// 🟠 Level 3: Maximum and Minimum
// Q16. Find the largest element.

// Q17.Find the smallest element.

// Q18.Find the second largest element.

// Q19.Find the second smallest element.

// Q20.Find the difference between maximum and minimum.

// 🔵 Level 4: Searching
// Q21.Search an element using linear search.Example
// Input 10 20 30 40 Search = 30
// Output Found
// Q22.Search an element.If not found printNot Found
// Q23.Print the index where the searched element is present.

// Q24.Count how many times a number occurs. Example 1 2 2 3 2 4 Search =2
// Output 3
// Q25.Find whether duplicate elements exist or not.

// 🟣 Level 5: Reverse
// Q26. Print array in reverse order.

// Q27. Reverse the array without creating another array.

// Q28. Reverse using another array.

// Q29.Print alternate elements.Example 10 20 30 40 50
// Output10
// 30
// 50
// Q30. Print alternate elements starting from index 1.























