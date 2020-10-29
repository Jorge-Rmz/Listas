
import javax.swing.JOptionPane;

public class Listas_doble_Enlazada {

    public static void main(String[] args) {
        ListaDoble listita = new ListaDoble();
        int opcion = 0, elemento;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.-Agregar UN nodo al inicio"
                        + "\n2.-Agregar un nodo al final"
                        + "\n3.-Mostrar la lista de inicio a fin"
                        + "\n4.-Mostrar la lista de fin a inicio"
                        + "\n5.-Eliminar un nodo del inicio"
                        + "\n6.-Elininar un nodo del final"
                        + "\n7.-Salir"
                        + "\nQue desea Hacer?", "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento del nodo"));
                        listita.agregarAlInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento del nodo"));
                        listita.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if (!listita.estaVacia()) {
                            listita.mostrarListaInicioFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "NO hay nodos Aun.\nLista Vacia");
                        }
                        break;
                    case 4:
                        if (!listita.estaVacia()) {
                            listita.mostrarListaFinInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "NO hay nodos Aun.\nLista Vacia");
                        }
                        break;
                    case 5:
                        if (!listita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El Numero eliminado es: " + listita.eliminarDelInicio());
                        } else {
                            JOptionPane.showMessageDialog(null, "NO hay nodos Aun.\nLista Vacia");
                        }

                        break;
                    case 6:
                        if (!listita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El Numero eliminado es: " + listita.eliminarDelFinal());
                        } else {
                            JOptionPane.showMessageDialog(null, "NO hay nodos Aun.\nLista Vacia");
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menu.");
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error!!!!!" + e.getMessage());
            }

        } while (opcion != 7);
    }

}
