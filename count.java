class Myclass {
	static int count = 0;
	final double pi = 3.14159;
Myclass() {
	count = count+1;
   }
public void display() {
	System.out.println("Count is: "+count);
	System.out.println("Double is: "+pi);
	System.out.println();
   }
public static void main(String[] args) {
	Myclass Asec = new Myclass();
	Asec.display();
	Myclass Bsec = new Myclass();
	Bsec.display();
	Myclass Csec = new Myclass();
	Csec.display();
	System.out.println("The final is: "+count);
	System.out.println("Double is: "+Asec.pi);
  }
}