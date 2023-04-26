package uax.poo.feedbackUD6;

public class fecha {

//atributos
    private int dia;
    private int mes;
    private int anno;
    private int hora;
    private int minuto;
    private int segundo;


    //constructores

    public fecha(int dia, int mes, int anno, int hora, int minuto, int segundo) {
        //aplicamos las restricciones
        if (anno == 2015 && mes == 6 && dia == 30 && hora == 23 && minuto == 59 && segundo == 60) { //segundo intercalar
            this.segundo = 60;
        } else {
            if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anno < 1582 || hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
                throw new IllegalArgumentException("Valores incorrectos. Revise: dia(1-31), mes(1-12), anno(>1582), hora(0-23), minuto(0-59), segundo(0-59");
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
    }
/* constructor fecha sobrecargado con hh:mm:ss a 0 */
    public fecha(int dia, int mes, int anno) {
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
        }
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    /**representación de fecha en formato día/mes/año ***/
    public fecha(String fecha) {
        String[] separarFecha = fecha.split("/");//separamos con / y convertimos a String dia, mes y año
        if (separarFecha.length != 3) {
            throw new IllegalArgumentException("Valores incorrectos. La fecha debe tener el formato dd/mm/aaaa");
        }
        this.dia = Integer.parseInt(separarFecha[0]);//sacamos del array y convertimos a int dia, mes y año
        this.mes = Integer.parseInt(separarFecha[1]);
        this.anno = Integer.parseInt(separarFecha[2]);
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

//metodos

    /* devuelve true si la segunda fecha es posterior a la primera fecha. He incluido hasta los segundos*/

    public boolean posterior(fecha fecha2) {
        if (this.anno > fecha2.anno) {
            return false;
        } else if (this.anno < fecha2.anno) {
            return true;
        } else {                                // si los años son iguales comparamos los meses
            if (this.mes > fecha2.mes) {
                return false;
            } else if (this.mes < fecha2.mes) {
                return true;
            } else {                            // si los meses son iguales comparamos los días
                if (this.dia > fecha2.dia) {
                    return false;
                } else if (this.dia < fecha2.dia) {
                    return true;
                } else {                        // si los días son iguales comparamos las horas
                    if (this.hora > fecha2.hora) {
                        return false;
                    } else if (this.hora < fecha2.hora) {
                        return true;
                    } else {                // si las horas son iguales comparamos los minutos
                        if (this.minuto > fecha2.minuto) {
                            return false;
                        } else if (this.minuto < fecha2.minuto) {
                            return true;
                        } else {                // si los minutos son iguales comparamos los segundos
                            if (this.segundo > fecha2.segundo) {
                                return false;
                            } else if (this.segundo < fecha2.segundo) {
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

    /* devuelve una nueva fecha con el día siguiente a la fecha actual*/
    public fecha diaSiguiente() {
        fecha fechaSiguiente = new fecha(this.dia, this.mes, this.anno);
        if (fechaSiguiente.dia == 31 && fechaSiguiente.mes == 12) { //si es 31 diciembre, el siguiente es 1 de enero del año siguiente
            fechaSiguiente.dia = 1;
            fechaSiguiente.mes = 1;
            fechaSiguiente.anno = fechaSiguiente.anno + 1;
        } else if (fechaSiguiente.dia == 31 && (fechaSiguiente.mes == 1 || fechaSiguiente.mes == 3 || fechaSiguiente.mes == 5 || fechaSiguiente.mes == 7 || fechaSiguiente.mes == 8 || fechaSiguiente.mes == 10)) { //si el mes es de 31 dias
            fechaSiguiente.dia = 1;
            fechaSiguiente.mes = fechaSiguiente.mes + 1;
        } else if (fechaSiguiente.dia == 30 && (fechaSiguiente.mes == 4 || fechaSiguiente.mes == 6 || fechaSiguiente.mes == 9 || fechaSiguiente.mes == 11)) { //si el mes es de 30 dias
            fechaSiguiente.dia = 1;
            fechaSiguiente.mes = fechaSiguiente.mes + 1;
        } else if (fechaSiguiente.dia == 28 && fechaSiguiente.mes == 2) { //si febrero es de 28 dias
            fechaSiguiente.dia = 1;
            fechaSiguiente.mes = 3;
        } else { //resto de casos generales, el dia siguiente es dia+1
            fechaSiguiente.dia = fechaSiguiente.dia + 1;
        }
        return fechaSiguiente;
    }

/*metodo equals si fechas son iguales*/
    public boolean equals(fecha fecha2) {
        if (this.dia == fecha2.dia && this.mes == fecha2.mes && this.anno == fecha2.anno && this.hora == fecha2.hora && this.minuto == fecha2.minuto && this.segundo == fecha2.segundo) {
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









