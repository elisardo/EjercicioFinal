package TorresHanoi;

public class TorresDeHanoi {
    public static void main(String[] args) {
        int numDiscos =3;
        torresHanoi(numDiscos, 'A', 'B', 'C');
    }

    public static void torresHanoi(int num, char origen, char destino, char aux ){
        if(num==1){
            System.out.println("Mover disco uno de "+origen+" a "+destino);

        }else{
            torresHanoi(num-1,origen,aux,destino);
            torresHanoi(1,origen,destino,aux);
            torresHanoi(num-1,aux,destino,origen);

        }
    }
}
