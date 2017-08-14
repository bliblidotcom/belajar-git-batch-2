public class Hello{
 public static void main(String[] args) {
 //System.out.println("Hallo dude my name is vicky");

	String myName="";
	for(int i=0; i<args.length; i++){
 	 myName = myName + " " + args[i];
	}
	 System.out.println("is "+myName);
 }
}