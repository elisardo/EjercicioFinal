package HashAbiertaConFC;

import Estructuras.HashTable;
import com.sun.tools.corba.se.idl.InterfaceGen;

public class HashTableAbierta {
    private final Integer size=13;//primo cercano a una potencia de 2
    public HashTableAbierta(){

    }
    private Integer hash(Integer k){
        Integer key=0;
        key = k % size;
      /*  key = (k & 0x7fffffff) % size;//eliminamos el signo de la key */
        return key;
    }

    public Integer buscar();{
        return null;
    }
    public void insertar(Integer k);{
        System.out.println(k+" tiene el hash --> "+hash(k));
    }
    public void borra(Integer k);{

    }
}
