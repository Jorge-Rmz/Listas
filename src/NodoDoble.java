
public class NodoDoble {

    public int dato;
    NodoDoble siguiente, anterior;

     //Constructor cuando no hay ningun nodo
    public NodoDoble(int el) {
        this(el, null, null);
    }

    //Costructor para cuando ya hay nodos
    public NodoDoble(int el, NodoDoble s, NodoDoble a) {
        dato = el;
        siguiente = s;
        anterior = a;

    }

}
