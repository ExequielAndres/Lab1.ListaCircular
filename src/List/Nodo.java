package List;


public class Nodo {
    String nombre;
    Nodo sgte; 

    public Nodo(String nombre, Nodo sgte) {
        this.nombre = nombre;
        this.sgte = sgte;
    }

    public String getNombre() {
        return nombre;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
    


   
}
