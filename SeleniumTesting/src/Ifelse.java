import java.util.ArrayList;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr3= {1,2,3,5,6,8,9};
		
		for(int m=0;m<arr3.length;m++)
		{
			if(arr3[m]% 2==0)
			{
				System.out.println(arr3[m]);
				break;
			
			}
			
			else
			
				System.out.println(arr3[m]+" not a multiple of 2");
		
			
		}
		
		//ArrayList
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Nimisha");
		a.add("Sobin");
		a.add("Abhilash");
		System.out.println(a.get(0));
		a.remove(0);
		System.out.println(a.get(0));
		System.out.println(a.contains("Sobin"));
		
		
}

}
