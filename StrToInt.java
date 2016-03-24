
public class StrToInt{
	public static void main(Sring[] args){
		int number = 0;
		while(*args != 0){
			number = number * 10 + *args - '0';
			++args;
		}
	}
	
}