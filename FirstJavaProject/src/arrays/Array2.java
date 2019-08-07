package arrays;

public class Array2 {

	public static void main(String[] args) {
		
		int i,j;
		String[][] s=new String[2][2];
		
		s[0][0]="U1";
		s[0][1]="P1";
		
		s[1][0]="U2";
		s[1][1]="P2";
		
		for(i=0;i<2;i++)
		{
			for (j = 0; j<2; j++) {
				System.out.println(s[i][j]);
				
			}
		//System.out.println();
			}
	}
}
