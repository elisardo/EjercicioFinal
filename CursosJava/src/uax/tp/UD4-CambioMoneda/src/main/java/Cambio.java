public class Cambio {

    public static int[] devolverCambio(int v[],int P){
        int valorActual = 0;
        int x[]=new int[v.length];

        while (valorActual != P){
            int j= eligeMoneda(v,P-valorActual);
            if (j==-1){
                System.out.println( "No hay solución");
                return null;
            }
            x[j]= (P-valorActual)/v[j];
            valorActual += v[j]*x[j];
        }
        return x;
    }

/* POSICION ARRAY     0       1       2      3       4       5       6      7        8       9      10
*  VALOR MONEDA     0,001   0,002   0,005   0,01    0,02    0,05    0,1    0,2      0,5     1,0     2,0
* No se admiten monedas de 1cent.
* */
    public static int eligeMoneda(int v[],int P){
       int indice=0;
       for(int i=0; i<v.length; i++){
           if((v[i]>v[indice]) && (v[i]<=P))
               indice=i;
       }
       return indice;
    }
}
