
public class JavaBasicsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String
		
				String s= "nimisha peter chinnu";
				String[] result= s.split("peter");
				
				
				//System.out.println(result[0]);
				//System.out.println(result[1]);
				//System.out.println(result[1].trim());
				
				for(int k=0;k<result.length;k++)
                   {
					System.out.println(result[k]);
                   }

				
				
				for(int i=0;i<s.length();i++)
				{
					System.out.println(s.charAt(i));
				}
				
				System.out.println("***********************");
				
				for(int j=s.length()-1;j>=0;j--)
				{
					System.out.println(s.charAt(j));
				}
				
				
	}

}
