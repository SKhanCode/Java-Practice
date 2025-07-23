
public class MultidArray {

    public static void main(String[] args) {
        int[][] marry = new int[2][3];
        marry[0][0] = 101;
        marry[0][1] = 102;
        marry[0][2] = 103;
        marry[1][0] = 201;
        marry[1][1] = 202;
        marry[1][2] = 203;
        
        for (int i = 0; i < marry.length; i++) {

            for (int j = 0; j < marry[i].length; j++) {

                System.out.print(marry[i][j] + " ");

            }
            System.out.print("\n");

        }

    }
}
