public class Sumatoria {

    public static void main(String[] args) {
        int[][] x={{1,2,4},
                   {2,4,6},
                   {3,6,7},
                   {3,6,7}};
        int[] y=new int[3];
        int suma=0;
        for(int n=0;n<3;++n){
            for(int m=0;m<4;++m){
                y[n]+=x[m][n];
            }
        System.out.print(y[n]+" ");
        }
    }
}
