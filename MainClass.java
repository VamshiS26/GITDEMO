package accessmodifiers;

public class MainClass {
    public static void main(String[] args) {
        Test Test = new Test();
        Test.setName("John Doe");
        Test.setAge(-1);
        Test.printDetails();
    }
}
