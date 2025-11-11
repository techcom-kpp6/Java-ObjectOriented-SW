public class Watchara_Boonlert_Mutiplication_Table_661320706{
	public static void main(String[] args) {
	int [][]Multi_tb = new int[13][13];
        System.out.printf("-------------------------661320706-------------------------------------\n\n");
        for(int p=1; p<=12; p++){
            System.out.printf("|M%3d ", p);
        }
        System.out.printf("\n-----------------------------------------------------------------------\n");
        for(int i=1; i<Multi_tb.length; i++){
            for(int o=1; o<Multi_tb.length; o++){
                Multi_tb[i][o] = i*o;
                        System.out.printf("| %3d ", Multi_tb[i][o]);
            }
            System.out.println();
        }
        System.out.printf("\n---------------------Watchara Boonlert---------------------------------\n");
    }
}
