package Backtracking;

public class ProblemaDeLas8Reinas {

    private static int[] reinas(int reinas) {//indicamos cuantas reinas queremos
        int sol[] = new int[reinas];//el array será el numero de reinas x numero de reinas
        int nivel = 0;
        boolean fin = false;
        sol[0] = -1;
        do{
            sol[nivel]++;//generamos una posible solucion
            if(nivel == (reinas - 1) && noEstanEnJaque(nivel, sol))//verificamos si es una solucion.
                fin = true;//hemos encontrado UNA solucion.
             else if(noEstanEnJaque(nivel, sol)){//mirar que no estan en jake.Si es factible y avanzamos nivel.
                nivel++;
                sol[nivel] = -1;
            }else{//deshacer si no es factible
                while(sol[nivel] == (reinas - 1)){//si no es factible, retrocedemos un nivel y generamos una nueva solucion
                    sol[nivel] = -1;
                    nivel--;
                }
            }
        }while(!fin);
        return sol;
    }
    private static boolean noEstanEnJaque(int nivel, int sol[]) {//si devuelbe TRUE es que no hay jake.
        for (int i = 0; i < nivel; i++) {
            if(sol[i] == sol[nivel]) {//las reinas no estan en la misma fila
                return false;
            }else if(Math.abs(nivel - i) == Math.abs(sol[nivel] - sol[i])){//las reinas no estan en la misma diagonal.
                return false;
            }
        }
        return true;
    }
}
