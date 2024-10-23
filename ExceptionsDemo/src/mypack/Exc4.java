package mypack;

public class Exc4 {
	void show() {
		System.out.println("welcome to show");
		 
		
	}
	void display() {
		show();
	}

	public static void main(String[] args) {
		Exc4 obj=new Exc4();
		obj.display();
		System.out.println("back to main");
	}
}


