package accessmodifiers;
public class privateModifier{
	String name="Private Modifier";
	private void privateMethodModifier() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		privateModifier pm=new privateModifier();
		pm.privateMethodModifier();
	}
	
	
	
}
