package tesTYantra;

public class FirstDay {
public static void main(String[] args) {
	  //wap to print 1 to 20
	/*for(int i=1; i<=20; i++)
	{
		if (i%2==0) {
			System.out.println(i);
		}
	}*/
	
	for (int i = 1; i<=20; i++) {
		System.out.println((i%2==0)?i:"");
		}
	
	for(int i=1; i<=20; i++ ){
		int num=(i%2==0)?i:0;
		if (num!=0) {
			System.out.print(num);
		}
	}
	}
}
