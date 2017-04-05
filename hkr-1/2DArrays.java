public class 2DArrays {

    public static void main(String[] args) {

        int arr[][] ={{1,1,1,0,0,0},
                      {0,1,0,0,0,0},
                      {1,1,1,0,0,0},
                      {0,9,2,-4,-4,0},
                      {0,0,0,-2,0,0},
                      {0,0,-1,-2,-4,0}};
       int[] s=sumas(arr);
        int i,j,aux;
		for(i=1;i<s.length;++i){
			aux=s[i];
			for(j=i-1;j>=0 && s[j]>aux;--j){
				s[j+1]=s[j];
				s[j]=aux;

				}
			}
		System.out.println(s[s.length-1]);
	}
    public static int[] sumas(int[][]a){
        int suma=0;
        int x,y;
        int[] arr=new int[16];
        int cont=0;
        for(x=1;x<5;++x){
            suma=0;
            for(y=1;y<5;++y){
                suma=a[x-1][y-1]+a[x-1][y]+a[x-1][y+1]+
                                    a[x][y]+
                     a[x+1][y-1]+a[x+1][y]+a[x+1][y+1];
                arr[cont++]=suma;
            }
        }
        return arr;
    }

}
