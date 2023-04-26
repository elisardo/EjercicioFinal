public class TablaHAshTelefonos {

    public int fHash(String telefono){ int suma = 0; for (int i = 0; i < telefono.length(); i++) {
        suma += telefono.charAt(i) - '0';
    }
        int tamañoTabla;
        return suma % tamañoTabla;
    }
}
