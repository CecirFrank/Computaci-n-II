public class ThePowerSum {

    public static void main(String[] args) {
        double suma=0;
        int numero=10;
        int potencia=2;
        double[] m=menores(numero);
        int cont=0;
        for(int y=m.length-1;y>=0;--y)
            for(int x=0;x<y;++x){
                suma+=m[x]+m[y];
                if(suma==numero)
                ++cont;
        }
        System.out.println(cont);
        }
        public static double[] menores(int n){
                double[] menores=new double[3];
                int cont=0;
                for(double x=1;Math.pow(x,2)<n && cont<Math.pow(x,2);++x)
                        menores[cont++]=Math.pow(x,2);
                return menores;
        }
}
