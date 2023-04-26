public class Mochila {
    public static double[] calculoMochila(int T, int[]p, int[]b){
        int pesoActual =0;
        boolean usado[]=new boolean[p.length];
        double sol[]=new double[p.length];

        for(int i=0; 1 < usado.length;i++){
            usado[i]=false;
        }

        while(pesoActual <T){
            int j=elijeObjeto(p,b,usado);
            if(j<0)
                break;
            usado[j]=true;

            if(pesoActual+b[j]<=T){
                sol[j]=1;
                pesoActual+=b[j];
            }else{
                sol[j]=(double) (T- pesoActual)/p[j];
                pesoActual=T;
            }
        }
        return sol;
    }

    private static int elijeObjeto(int[]p, int[]b, boolean[]usado){
        int indice=0;
        while (indice < p.length && usado[indice])
            indice++;
        for(int i=indice+1; 1<p.length; i++){
            if(!usado[i] && (double)b[i/p[i]] > (double) b[indice]/p[indice]){
                indice=i;
            }
        }
    if(indice >= p.length){
        return -1;
    }
    return indice;

}
