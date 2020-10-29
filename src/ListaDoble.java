
import javax.swing.JOptionPane;

public class ListaDoble {

    private NodoDoble inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    //Metodo para saber si la lista esta vacia 
    public boolean estaVacia() {
        return inicio == null;
    }

    //Metodo para agregar nodos al final
    public void agregarAlFinal(int el) {
        if (!estaVacia()) {
            fin = new NodoDoble(el, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(el);
        }
    }

    //Metodo para agregar al inicio
    public void agregarAlInicio(int el) {
        if (!estaVacia()) {
            inicio = new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(el);
        }
    }

    //Metodo para mostrar la lista de inicio a fin
    public void mostrarListaInicioFin() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando lista de inicio a fin ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Metodo para mostrar la lista de fin a inicio
    public void mostrarListaFinInicio() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando lista de inicio a fin ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //metodo para eliminar del inicio
    public int eliminarDelInicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }

    //Método para eliminar del final
    public int eliminarDelFinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;
    }
    
    

}
