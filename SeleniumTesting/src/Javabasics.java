
public class Javabasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
int num=5;
char letter='N';
double dec=5.99;
String name="NIMISHA";
boolean result=true;
System.out.println("My name is " +name);
System.out.println("My age is "+num);
System.out.println("My mark  is "+dec);
System.out.println("Result is "+result);

//array

//int[] arr= {1,2,3,4,5};
//System.out.println(arr[2]);
//for loop

int[] arr1=new int[3];
arr1[0]=1;
arr1[1]=3;
arr1[2]=5;


for(int i=0; i<arr1.length; i++)
{
	System.out.println(arr1[i]);
}

int[] arr2= {1,2,3,4,5,6,77,88,99};
for(int k=0;k<arr2.length;k++)
{
    System.out.println(arr2[k]) ;
}

String[] name1= {"nimisha", "abhilash", "chinnamma", "peter"};
for(int j=0;j<name1.length;j++)
{
	 System.out.println(name1[j]);
}

for(String s:name1)
{ 
	 System.out.println(s);
}

	}

	
}

	



