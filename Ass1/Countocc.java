import java.io.*;
import java.util.Scanner;
class Countocc {  

   static void countEachChar(String str) 
   {
	int counter[] = new int[256]; 
	int len = str.length(); 
	for (int i = 0; i < len; i++) 
		counter[str.charAt(i)]++; 
	char array[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
	   array[i] = str.charAt(i); 
	   int flag = 0; 
	   for (int j = 0; j <= i; j++) { 
		if (str.charAt(i) == array[j])  
			flag++;                 
	   } 

	   if (flag == 1)  
	      System.out.println("Occurrence of char " + str.charAt(i)
		 + " in the String is:" + counter[str.charAt(i)]);             
	} 
   } 
   public static void main(String[] args) 
   {  
   Scanner sc= new Scanner(System.in);
	System.out.print("Enter a string: ");  
    String str= sc.nextLine();          
	countEachChar(str); 
   } 
}