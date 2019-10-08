import java.util.Scanner;  

class Liner
{

void linear1()
{
int a[]={34,34,3434,232,231};
System.out.print("Enter the element to search");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int flag=0,i;

for(i=0;i<5;i++)
{

if(a[i]==n)
{
flag=i+1;
break;
}
else
{
flag=0;
}
}
if(flag!=0)
{
System.out.println("Element found at"+(i+1));
}
else
{
System.out.println("Element not found");
}
}


public static void main(String[]args)
{
Liner l= new Liner();
l.linear1();
}
}

