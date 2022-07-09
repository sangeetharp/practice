package git.org;

public class SumofEvenNos {
	public static void main(String[] args) {
		int e=0;
		int count=0;
		for (int i = 0; i <=100; i++) {
			if (i%2==0) {
				e=e+i;
				count= count+1;
				System.out.println(i);
			}
			
		}
		System.out.println("sum od Even nos from 0 to 100 "+e);
		System.out.println("count of Even no is "+count);
	}

}
