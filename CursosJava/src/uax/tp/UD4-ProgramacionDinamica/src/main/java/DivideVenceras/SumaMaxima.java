package DivideVenceras;

public class SumaMaxima {
    private static int sumaMaxima(int valores[]){
        int max=0;
        int suma;
        for(int izq=0; izq <= valores.length; izq++){
            for(int der = izq; der <= valores.length; der++){
                suma=0;
                for(int i=izq; i<=der; i++){
                    suma+=valores[i];
                }
                if(suma>max){
                    max=suma;
                }
            }
        }
        return max;
    }
    //ALGORITMO MEJORADO REDUCIENDO UN FOR
    private static int sumaMaxima2(int valores[]){
        int max=0;
        int suma;
        for(int izq=0; izq <= valores.length; izq++){
            suma=0;
            for(int der = izq; der <= valores.length; der++){
                suma+ = valores[der];//no reseteamos la suma cada vez que entramos en el for y la guardamos.
            }
            if(suma>max){
                max=suma;
            }
        }
        return max;
    }
    //ALGORITMO MEJORADO REDUCIENDO UN FOR Y UN IF
    private static int sumaMáxima3(int valores[], int prim, int ult) {
        int max, maxIzq, maxDer;
        int mitad;
        int suma;
        if(prim > ult) return 0;
        if(prim == ult) return Math.max(0, valores[prim]);
        mitad = (prim + ult)/2;
// para los casos en que se encuentre en la primera mitad o segunda mitad
        max = Math.max(sumaMáxima3(valores, prim, mitad), sumaMáxima3(valores, mitad+1,
                ult));
// para el caso que se encuentre entre las dos mitades
        maxIzq = 0;
        suma = 0;
        for (int i = mitad; i >= prim; i--) {
            suma += valores[i];
            maxIzq = Math.max(maxIzq, suma);
        }
        maxDer = 0;
        suma = 0;
        for (int i = mitad+1; i <= ult; i++) {
            suma += valores[i];
            maxDer = Math.max(maxDer, suma);
        }
        return Math.max(maxIzq+maxDer, max);
    }
}
