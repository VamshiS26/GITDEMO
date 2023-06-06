package accessmodifiers;

//Non static method.
public class PublicModifier {
	public  void publicMethod() {
	int age=24;
	String name="Vamshi";
	System.out.println(name+" "+age);
	}
	//Static Method
	public static void publicModifierStatic() {
		 int age=25;
		 String name="VS";
		System.out.println(name+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicModifier pm=new PublicModifier();
		pm.publicMethod();
		publicModifierStatic();
		
	}

}
