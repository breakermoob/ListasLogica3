package Clases;
public class NodoDoble {
   
    private NodoDoble siguiente;
    private NodoDoble anterior;
    private char cadena;

    public NodoDoble(char Dato) {
        cadena = Dato;
        siguiente = null;
        anterior = null;
    }

    public void setDato(char dato) {
        cadena = dato;
    }

    public void setLigaDerecha(NodoDoble x) {
        siguiente = x;
    }

    public void setLigaIzquierda(NodoDoble y) {
        anterior = y;
    }

    public char getDato() {
        return cadena;
    }

    public NodoDoble getLigaDerecha() {
        return siguiente;
    }

    public NodoDoble getLigaIzquierda() {
        return anterior;
    }
 
}
