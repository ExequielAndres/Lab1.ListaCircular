package List;
import java.util.Collections;

public class ListaCircular {
    private Nodo inicio;
    private Nodo ultimo;
    Nodo puntero;
    int indice=1;
    
    String print;

    public ListaCircular() {
        this.inicio = null;
        this.ultimo = null;
        
    }

    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getUltimo() {
        return ultimo;
    }


    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

   
    
    public boolean Vacia(){
        return inicio==null;
    }
    
    public void InsertarFinal (String nombre){
        
        Nodo nuevo =new Nodo(nombre, inicio);
        Nodo aux=this.inicio; 
        
        
        if(Vacia()==true){
            inicio=nuevo;
            inicio.setSgte(inicio);
            aux=inicio;
        }
        if(Vacia()==false){
            do{        
                aux=aux.getSgte();
           
            }while(aux.getSgte()!=inicio);
            aux.setSgte(nuevo);
            nuevo.setSgte(inicio);
        }
        
        
       
           
       
        }
     
     
    
    public void InsertarPosicion(String nombre, int posicion){
        
        Nodo aux;
        Nodo nuevo= new Nodo(nombre, null);
        aux = inicio;
        Nodo ant = aux;
        int puntero = 1;
        
        while(puntero!=posicion){
            puntero++;
            ant=aux;
            aux = aux.getSgte();
        }
        ant.setSgte(nuevo);
        nuevo.setSgte(aux);
        
    
}
         public boolean Repetido (String nombre){
             Nodo aux;
        
        aux = inicio;
        boolean repetido=false;
        
        do{  
            if (nombre.equals(aux.getNombre())){
                repetido = true;
            }
            else{
                aux = aux.getSgte();
                indice++;
            }
        }while(aux != inicio && repetido != true);
        
        if(repetido==false){
            return false;
        }
        else{
            return true;
        }
        
        }
    
        public void Buscar (String nombre){
        Nodo aux;
        
        aux = inicio;
        int saltos=0;
        boolean found=false;
        
        do{  
            if (nombre.equals(aux.getNombre())){
                found = true;
                puntero=aux;
            }
            else{
                aux = aux.getSgte();
                saltos++;
            }
        }while(aux != inicio && found != true);
        
        if(found==false){
            System.out.print(nombre+" No ha sido encontrado");
        }
        else{
            System.out.print("Nombre: "+nombre);
            System.out.print("Cantidad de saltos: "+saltos);
        }
        
        }
        
       
        
        public void Imprimir(){
            Nodo aux;
        indice=1;    
        aux = inicio;
        print="Lista vacia";
        
        if(Vacia()==true){
            System.out.println(print);
        }
        
        else{
            do{
                print = aux.getNombre();
                System.out.print("\n"+indice+"- "+print);
                aux=aux.getSgte();
                indice++;
                
            }while(aux!=inicio);
        }
        }
        
        public void EliminarFinal (){
            Nodo aux;
            Nodo ant;
            aux=inicio;
            ant=null;
        
       do{
           ant=aux;
           aux=aux.getSgte();
       
       }while(aux.getSgte()!=inicio);
       
       ant.setSgte(inicio);
       
     
        }
        
         public void EliminarPosicion(int posicion){
        
        Nodo aux;
        
        aux = inicio;
        Nodo ant = aux;
        int puntero = 1;
        
        while(puntero!=posicion){
            puntero++;
            ant=aux;
            aux = aux.getSgte();
        }
        ant.setSgte(aux.getSgte());
       
        
    
}
        
        public void Largo(ListaCircular lista){
            
            int largo=0;
            Nodo aux=inicio;
            if(Vacia()==true){
                System.out.print("La Lista esta vacia");
            }
            else{
                largo++;
                while(aux.getSgte()!=inicio){
                    largo++;
                    aux=aux.getSgte();         
                }
                System.out.print("El largo es: "+largo);              
                    }
        }
        
         public void Modificar (String nombre, int posicion){
            Nodo aux;
            aux = inicio;
            int saltos=1;
            boolean found=false;
            
        
        do{  
            if (posicion==saltos){
                System.out.print("\n Nombre actual: "+aux.getNombre());
                aux.setNombre(nombre);
                System.out.print("\n Nombre nuevo: "+aux.getNombre());
                found=true;
                break;
            }
            else{
                aux = aux.getSgte();
                saltos++;
            }
        }while(aux!=inicio);
        
        if(found==false){
            System.out.print(nombre+"El elemento en la posicion: "+posicion+" No ha sido encontrado");
        }
        
        }
        
        }
        
        
        
        
        
        

        
        
  



     
  
    

