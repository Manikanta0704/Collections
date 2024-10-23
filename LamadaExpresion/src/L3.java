@FunctionalInterface
interface Z {
	int show(int i,int j);
}
class L3{
	public static void main(String[] args) {
		 Z z=(a,b)-> a+b;
		 System.out.println(z.show(10,15) );
	}
}
