

import java.util.Scanner;

public class Insertion {
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
    	System.out.print(a[i]+" \t");
    }
    
    for(int i=1;i<a.length;i++)
    {
    	int temp=a[i];
    	int j=i-1;
    	
    	while(j>=0 && temp<=a[j])
    	{
    		a[j+1]=a[j];
    		j=j-1;
    	}
    	
    	a[j+1]=temp;
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

