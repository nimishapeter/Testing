
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodDemo d=new MethodDemo();
String s=d.getData();
System.out.println(s);
MethodDemo2 d2=new MethodDemo2();
String name=d2.getuserData();
System.out.println(name);
String name2=getData2();
System.out.println(name2);


	}
	
	public String getData()
	{
		System.out.println("hellow chinnu");
		return ("nimisha");
	}
	
	public static String getData2()
	{
		System.out.println("hellow sobin");
		return ("neena");
	}

}
