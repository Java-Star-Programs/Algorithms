

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
     
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number of Elements: ");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
          a[i]=sc.nextInt();
    }
    System.out.println("  ");
    System.out.println("Elements");
    System.out.println(" ");
    for(int i=0;i<a.length;i++)
    {
    	System.out.print(a[i]+" \t ");
    }
       
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=0;j<a.length;j++)
    	   {
    		   if(a[i]<a[j])
    		   {
    			   int temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    		   }
    	   }
    	   
    	   
       }
       System.out.println(" \n");
       System.out.println(" ");
       System.out.println("Sorting Elements");
       System.out.println(" ");
       for(int i=0;i<a.length;i++)
       {
    	   System.out.print(a[i]+" \t");
       }
       
    }

    
    }

