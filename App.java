public class App 
{
	String name="Saptarshi";
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	
	public String greetMe(){
		return "Welcome: "+name;
	}
	
	public int add(int num1,int num2){
		System.out.println("Addition of two numbers: "+(num1+num2));
		return (num1+num2);
	}
	
}
