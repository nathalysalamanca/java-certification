public class MyClass{
		
	public static void main (String[] args){
			String one = "hello word";
			String two = "hello ";
			two += "word";
			String three = "hello "+"word";
			System.out.println(one==two);
			System.out.println(one==three);
	}
} 