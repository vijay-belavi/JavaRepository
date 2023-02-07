package practice;

public class Abcd {
}
class abc1 {
public static void main(String[] args) {
	char z='A';
	int no=1;
	for (int i = 1; i <=3; i++) {
		if(i==1||i==3)
		{
			for (int j = 1; j <=z; j++) {
				System.out.print(j);
			}
			z++;
		}
		else
		{
			for (int k = 1; k <=no; k++) {
				if(k%2==0)
				{
					System.out.print(k);
				}
				no++;
			}
		}
	}
}
}
/*
*/