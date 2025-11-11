public class Main
{
	public static void main(String[] args) {
	    int [][]Multi_tb = new int[13][13];
	    int sum, mother = 12;
	    for (int i=1; i<=mother; i++){
	        System.out.printf("สูตรตุณแม่ %d\n\n",i);
	        for (int o=1; o<=mother; o++){
	            sum = i*o;
	            Multi_tb[i][o] = sum;
	            System.out.printf("%d x %d = %d\n", i, o, Multi_tb[i][o]);
	            sum = 0;
	        }
	        System.out.println();
	    }
	}
}



