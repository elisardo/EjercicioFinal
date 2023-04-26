public class Secuenciacion {
    /*
    * @param b 100, 10, 15, 27
    * @param p  2, 1, 2, 1
    * @return
    *
    * */
    public static int[]calculoPlanificacion(int []b, int []p){
        int sol[]= new int[b.length];

        for (int i=0; i< sol.length; i++){
            sol[i]=-1;
        }

        for (int i=0; i< b.length; i++){
            for(int j= p[i]-1; j >=0; j--){//buscar que procesos podemos hacer en el tiempo que tenemos
                if(sol[j]==-1){
                    sol[j]=i;
                    break;
                }
            }
        }
        return null;
    }
}
