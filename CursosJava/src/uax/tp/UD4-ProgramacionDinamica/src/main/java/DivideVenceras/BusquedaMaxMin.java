package DivideVenceras;

public class BusquedaMaxMin {
    public class Valor {
        public int valor;
        @Override
        public String toString() {
            return ""+valor;
        }
    }
    private static void calculoMaximoMinimo(int[] valores, Valor maxV, Valor minV) {
        int max = valores[0];
        int min = valores[0];
        for (int i = 1; i < valores.length; i++) {
            max = Math.max(max, valores[i]);
            min = Math.min(min, valores[i]);
        }
        maxV.valor = max;
        minV.valor = min;
    }
    //aplicando Divide y venceras
    private static void calculoMaximoMinimo2(int[] valores, int prim, int ult, Valor maxV, Valor minV) {
        Valor max1 = new Valor();
        Valor min1 = new Valor();
        Valor max2 = new Valor();
        Valor min2 = new Valor();
        int max = valores[0];
        int min = valores[0];
        int mitad;
        if(prim < ult-1){
            mitad = (prim + ult)/2;
            calculoMaximoMinimo2(valores, prim, mitad, max1, min1);
            calculoMaximoMinimo2(valores, mitad + 1, ult, max2, min2);
            maxV.valor = Math.max(max1.valor, max2.valor);
            minV.valor = Math.min(min1.valor, min2.valor);
        }else if(prim == ult-1){
            maxV.valor = Math.max(valores[prim], valores[ult]);
            minV.valor = Math.min(valores[prim], valores[ult]);
        }else{
            maxV.valor = minV.valor = valores[prim];
        }
    }
}
