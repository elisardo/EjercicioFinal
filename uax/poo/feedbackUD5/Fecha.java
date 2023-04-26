package uax.poo.feedbackUD5;

public class Fecha {

    //atributos
    private int dia;
    private int mes;
    private int anno;
    private int hora;
    private int minuto;
    private int segundo;


    //constructores
    public Fecha() {
    }
    public Fecha(int dia, int mes, int anno, int hora, int minuto, int segundo) {
        //aplicamos las restricciones
        if (anno == 2015 && mes == 6 && dia == 30 && hora == 23 && minuto == 59 && segundo == 60) { //segundo intercalar
            this.segundo = 60;
        } else {
            if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anno < 1582 || hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
                throw new IllegalArgumentException("Valores incorrectos. Revise: dia(1-31), mes(1-12), anno(>1582), hora(0-23), minuto(0-59), segundo(0-59)");
            }
            if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
                if (mes == 2 && dia > 29) {
                    throw new IllegalArgumentException(anno + " es bisiesto. Febrero no puede tener más de 29 días");
                }
            } else {
                if (mes == 2 && dia > 28) {
                    throw new IllegalArgumentException(anno + " no es bisiesto. Febrero no puede tener más de 28 días");
                }
            }
        }
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        System.out.println("Fecha introducida: " + dia + "/" + mes + "/" + anno + " " + hora + ":" + minuto + ":" + segundo);
    }
    /* constructor fecha sobrecargado con hh:mm:ss a 0 */
    public Fecha(int dia, int mes, int anno) {
        //aplicamos las restricciones
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anno < 1582) {
            throw new IllegalArgumentException("Valores incorrectos. Revise: dia(1-31), mes(1-12), anno(>1582)");
        }
        if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
            if (mes == 2 && dia > 29) {
                throw new IllegalArgumentException(anno + " es bisiesto. Febrero no puede tener más de 29 días");
            }
        } else {
            if (mes == 2 && dia > 28) {
                throw new IllegalArgumentException(anno + " no es bisiesto. Febrero no puede tener más de 28 días");
            }

                this.dia = dia;
                this.mes = mes;
                this.anno = anno;
                this.hora = 0;
                this.minuto = 0;
                this.segundo = 0;

                System.out.println("Fecha introducida: " + dia + "/" + mes + "/" + anno + " " + hora + ":" + minuto + ":" + segundo);

        }
    }

    /**representación de fecha en formato día/mes/año ***/
        public Fecha(String fechaString) {
            String[] separarFecha = fechaString.split("/");//separamos el string con /
            if (separarFecha.length != 3) {
                throw new IllegalArgumentException("Valores incorrectos. La fecha debe tener el formato 'dd/mm/aaaa'");
            }
            this.dia = Integer.parseInt(separarFecha[0]);//sacamos del array y convertimos a int dia, mes y año
            this.mes = Integer.parseInt(separarFecha[1]);
            this.anno = Integer.parseInt(separarFecha[2]);
            System.out.println("Fecha introducida por String: " + dia + "/" + mes + "/" + anno);
        }




    //metodos


    public static boolean isPosterior(Fecha primeraFecha, Fecha segundaFecha) {
        if (primeraFecha.getAnno() > segundaFecha.getAnno()) {
            return false;
        } else if (primeraFecha.getAnno() < segundaFecha.getAnno()) {
            return true;
        } else {                                // si los años son iguales comparamos los meses
            if (primeraFecha.getMes() > segundaFecha.getMes()) {
                return false;
            } else if (primeraFecha.getMes() < segundaFecha.getMes()) {
                return true;
            } else {                            // si los meses son iguales comparamos los días
                if (primeraFecha.getDia() > segundaFecha.getDia()) {
                    return false;
                } else if (primeraFecha.getDia() < segundaFecha.getDia()) {
                    return true;
                } else {                        // si los días son iguales comparamos las horas
                    if (primeraFecha.getHora() > segundaFecha.getHora()) {
                        return false;
                    } else if (primeraFecha.getHora() < segundaFecha.getHora()) {
                        return true;
                    } else {                // si las horas son iguales comparamos los minutos
                        if (primeraFecha.getMinuto() > segundaFecha.getMinuto()) {
                            return false;
                        } else if (primeraFecha.getMinuto() < segundaFecha.getMinuto()) {
                            return true;
                        } else {                // si los minutos son iguales comparamos los segundos
                            if (primeraFecha.getSegundo() > segundaFecha.getSegundo()) {
                                return false;
                            } else if (primeraFecha.getSegundo() < segundaFecha.getSegundo()) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
        }

    }

    /*****************Método diaSiguiente******************/
    public static Fecha diaSiguiente(Fecha fecha) {
        Fecha fechaSiguiente = new Fecha(fecha.dia, fecha.mes, fecha.anno);
        if (fechaSiguiente.dia== 31 && fechaSiguiente.getMes() == 12) { //si es 31 diciembre, el siguiente es 1 de enero del año siguiente
            fechaSiguiente.setDia(1);
            fechaSiguiente.setMes(1);
            fechaSiguiente.setAnno(fechaSiguiente.getAnno() + 1);
        } else if (fechaSiguiente.dia== 31 && (fechaSiguiente.mes == 1 || fechaSiguiente.mes == 3 || fechaSiguiente.mes == 5 || fechaSiguiente.mes == 7 || fechaSiguiente.mes== 8 || fechaSiguiente.mes== 10)) { //si el mes es de 31 dias
            fechaSiguiente.setDia(1);
            fechaSiguiente.setMes(fechaSiguiente.getMes() + 1);
        } else if (fechaSiguiente.dia == 30 && (fechaSiguiente.mes == 4 || fechaSiguiente.mes == 6 || fechaSiguiente.mes == 9 || fechaSiguiente.mes == 11)) { //si el mes es de 30 dias
            fechaSiguiente.setDia(1);
            fechaSiguiente.setMes(fechaSiguiente.mes + 1);
        } else if (fechaSiguiente.dia == 28 && fechaSiguiente.mes == 2) { //si febrero es de 28 dias
            fechaSiguiente.setDia(1);
            fechaSiguiente.setMes(3);
        } else { //resto de casos generales, el dia siguiente es dia+1
            fechaSiguiente.setDia(fechaSiguiente.dia + 1);
        }
        return fechaSiguiente;
    }

    /*****************Método equals******************/

      public static boolean equals(Fecha fechaA, Fecha fechaB) {
        if (fechaA.dia == fechaB.dia && fechaA.mes == fechaB.mes && fechaA.anno == fechaB.anno) {
            return true;
        } else {
            return false;
        }

    }


    /* getters y setter*/
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    /*metodo toString de cadena con formato dd/mm/aaaa hh:mm:ss*/
    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.anno + " " + this.hora + ":" + this.minuto + ":" + this.segundo;
    }
}


