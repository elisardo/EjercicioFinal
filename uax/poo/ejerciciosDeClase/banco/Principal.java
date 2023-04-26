package uax.poo.ejerciciosDeClase.banco;

public class Principal {
    public static void main(String[] args) {

        //Instanciacion del cliente Titular
    Cliente objCliente =new Cliente("12345678A", "Juan", "Perez", "miemail@email.com");

    //In
        // stanciacion del cuentas del Titular

        Cuenta objCuenta =new Cuenta("12345678901234567890", objCliente, 1000f, 0.5f);

        //Obtener el saldo de la cuenta
        float capital =objCuenta.getCapital();

        //Modificar el saldo de la cuenta
        objCuenta.setCapital(2000f);

        //modificar el interes de la cuenta
        objCuenta.setInteres(0.8f);



    }
}


