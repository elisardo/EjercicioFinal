package MochilaDinamico;

public class ProblemaMochilaDinamico {
    //nos dan unos pesos p, unos beneficios b y una capacidad T de la mochila
    private static int[][] rellenarTabla(int[] p, int [] b, int T){
/*nos creamos una matriz de beneficios donde guardamos los resultados y tiene un tamaño de
el tamaños de los pesos que tenemos + tamaño del peso que indicamos
 */
        int beneficios [][]=new int[p.length-1][T+1];

        for(int i=0;i<=p.length;i++){ //iniciamos la mochila a 0
            beneficios[0][1]=0;
        }
        for(int i=0;i<=p.length;i++){
            for(int j=0;j <=p[i-1];j++) {
                beneficios[i][j] = beneficios[i-1][j];
            }
            for (int j =p[i-1]; j <= T; j++) {
                beneficios[i][j] = Math.max(beneficios[i-1][j], b[i - 1]+beneficios[i-1][j-p[i-1]]);
            }
        }
        return beneficios;
    }
}
