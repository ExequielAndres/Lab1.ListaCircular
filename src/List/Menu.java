package List;
import java.util.Scanner;



class Menu
{
  static Scanner teclado = new Scanner(System.in); 

   public static void main(String x[])
  {   
    ListaCircular lista ;
    String nombre;
    lista = new ListaCircular();
    int opcion, posicion;
    lista.InsertarFinal("exequiel");
    lista.InsertarFinal("andres");
    lista.InsertarFinal("pedro");
    lista.InsertarFinal("juan");
    lista.InsertarFinal("diego");
    lista.InsertarFinal("cain");
    lista.InsertarFinal("abel");
    lista.InsertarFinal("drake");
    lista.InsertarFinal("josh");
    lista.InsertarFinal("megan");
   
    
           
            do
            {
                System.out.print("\n "); 
                System.out.print("\n "); 
                System.out.print("\n * * * * MENU * * * * * *"); 
                System.out.print("\n *  1.Insertar  nodo    *");  
                System.out.print("\n *  2.Insertar en posicion *");
                System.out.print("\n *  3.Buscar nombre    *");
                System.out.print("\n *  4.Mostrar  lista    *");                      
                System.out.print("\n *  5.Eliminar ultimo     *");
                System.out.print("\n *  6.Largo de la lista     *");
                System.out.print("\n *  7.Eliminar posicion   *");
                System.out.print("\n *  8.Modificar nodo  *");           
                System.out.print("\n *  9.Salir             *");
                System.out.print("\n * * * * * * * * * * * **");
                System.out.print("\n "); 
                System.out.print("\n "); 
                  
                System.out.print("\n Ingresa opcion :");
                opcion = teclado.nextInt();
                int posc;
            
                                     
                 switch(opcion) 
                 {
                  case 1:   System.out.print("\n Ingrese nuevo Elemento : ");
                            nombre = teclado.next();
                            if(lista.Vacia()==true){
                                lista.InsertarFinal(nombre);
                            }
                            else{
                            
                                if(lista.Repetido(nombre)==true){
                                System.out.print("El nombre: "+"'"+nombre+"'"+" ya fue ingresado");
                                }
                                else{
                                lista.InsertarFinal(nombre);
                                }
                            }
                        break;
                   
                  case 2:   System.out.print("\n Ingrese nombre: ");
                            nombre = teclado.next();
                            System.out.print("\n Ingrese posicion");
                            posicion = teclado.nextInt();
                            lista.InsertarPosicion(nombre, posicion);
                            
           
                        break;
                 
                  case 3: 
                            if(lista.Vacia()==true){
                            System.out.print("--La Lista esta vacia--");
                        }
                        else{
                            System.out.print("\n Ingrese nombre a buscar: ");
                            nombre=teclado.next();
                            lista.Buscar(nombre);
                        }
                        break;
                 
                  case 4:   System.out.print("\nº-º-º Elementos de la lista º-º-º");
                            if(lista.Vacia()==true){
                            System.out.print("La Lista esta vacia");
                        }
                        else{
                            
                            lista.Imprimir();
                        }
                        break;
                    
                   case 5:   lista.EliminarFinal();
                         break;
                   
                   case 6:   lista.Largo(lista);
                         break;
                         
                   case 7:  System.out.print("\n Ingrese posicion");
                            posicion = teclado.nextInt();
                            lista.EliminarPosicion(posicion);
                         break;
                   
                   case 8: 
                            System.out.print("\n Ingrese nombre nuevo: ");
                            nombre = teclado.next();
                            System.out.print(" Ingrese posicion del nodo ha modificar: ");
                            posicion = teclado.nextInt();
                            lista.Modificar(nombre, posicion);
                            
                         break;
                         
                        
                         
                  default:    System.out.print("\n PROGRAMA FINALIZADO ");
                           
            }
      }
                        while(opcion<=8);           
    }
}