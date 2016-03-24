class DataOnly{
	int i;
	float f;
	boolean b;
	public void initial(int n1, float n2, boolean n3){
		i = n1;
		f = n2;
		b = n3;
	}
	public void dataPrint(){
		System.out.println("i=" + i + ",f=" + f + ",b=" + b);
	}
}

public class Chapter2_2{
	static int storage(String s){
		return s.length() * 2;
	}
	public static void main(String[] args){
		DataOnly d = new DataOnly();
		d.initial(3, 5, false);
		d.dataPrint();
		System.out.print(args[0] + ",length: ");
		System.out.println(storage(args[0]));
		System.out.print(args[1] + ",length: ");
		System.out.println(storage(args[1]));
		System.out.print(args[2] + ",length: ");
		System.out.println(storage(args[2]));
	}
}