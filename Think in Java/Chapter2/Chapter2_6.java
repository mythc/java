class StaticTest{
	static int i =0;
	int j =1;
}

class StaticFun{
	static void incr(){
		StaticTest.i++;
	}
}

class Chapter2_6{
	public static void main(String[] args){
		StaticTest st = new StaticTest();
		StaticFun sf = new StaticFun();
		sf.incr();
		sf.incr();
		System.out.println(st.i);
		System.out.println(st.j);
	}
}