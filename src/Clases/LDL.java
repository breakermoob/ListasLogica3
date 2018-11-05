package Clases;

public class LDL {

    private NodoDoble primero;
    private NodoDoble ultimo;

    public LDL() {
        primero = null;
        ultimo = null;
    }

    public NodoDoble ultimoNodo() {
        return ultimo;
    }

    public NodoDoble primerNodo() {
        return primero;
    }

    public boolean isVoid() {
        return primero == null;
    }

    public void conectar(NodoDoble x, NodoDoble y) {// Método que conecta los nodos de la lista
        if (y == null) {//condicion para conectar nodo al principio de la lista
            x.setLigaDerecha(primero);
            if (primero != null) {
                primero.setLigaIzquierda(x);
            } else {
                ultimo = x;
            }
            primero = x;
        } else if (y.getLigaDerecha() == null) {// se conecta el nodo al final de la lista
            y.setLigaDerecha(x);
            x.setLigaIzquierda(y);
            ultimo = x;
        } else {
            x.setLigaDerecha(y.getLigaDerecha());
            x.setLigaIzquierda(y);
            x.getLigaDerecha().setLigaIzquierda(x);
            y.setLigaDerecha(x);
        }
    }

    // Metodo que sirve para desconectar un nodo cualquiera de la lista
    public void desconectar(NodoDoble x) {
        if (x != null) {
            if (x.getLigaIzquierda() == null) {//pregunta si es primerNodo
                primero = x.getLigaDerecha();
                if (primero == null) {
                    ultimo = null;
                } else {
                    primero.setLigaIzquierda(null);
                }
            }
            if (x.getLigaDerecha() == null) {//Pregunta si es ultimoNodo
                ultimo = x.getLigaIzquierda();
                if (ultimo != null) {
                    ultimo.setLigaDerecha(null);
                }
            }
            if ((x.getLigaDerecha() != null) && (x.getLigaIzquierda() != null)) {
                x.getLigaDerecha().setLigaIzquierda(x.getLigaIzquierda());
                x.getLigaIzquierda().setLigaDerecha(x.getLigaDerecha());
            }
        }
    }

    public void insertar(char cadena, NodoDoble y) {//metodo que inserta una letra
        //en la lista, implementa el metodo conectar
        NodoDoble x;
        x = new NodoDoble(cadena);
        this.conectar(x, y);
    }

    public LDL copia() {// metodo que sirve para hacer una copia de la lista
        NodoDoble p = this.primerNodo();
        LDL q = new LDL();
        while (p != null) {
            q.insertar(p.getDato(), q.ultimo);
            p = p.getLigaDerecha();
        }
        return q;
    }

    public String mostrar() {// metodo que sirve para mostrar las listas 
        NodoDoble p = this.primerNodo();
        String cadena = null;
        String b;
        while (p != null) {
            if (cadena == null) {
                b = Character.toString(p.getDato());
                cadena = b;
            } else {

                b = Character.toString(p.getDato());
                cadena = cadena + b;
            }
            p = p.getLigaDerecha();
        }
        return cadena;
    }

    public void creaLista(String a) {// Crea la lista sacando cada letra con el metodo charAT 
        // e implementa el metodo insertar
        if (a.length() == 1) {
            if (a.charAt(0) != ' ') {
                insertar(a.charAt(0), this.primero);
            }
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != ' ') {
                    insertar(a.charAt(i), this.ultimo);
                }
            }
        }
    }

    public LDL invertirHilera() {// Invierte la hilera original que es llamada desde el this

        LDL q = new LDL();
        NodoDoble p = this.ultimoNodo();
        while (p != null) {// ciclo para recorrer la lista
            q.insertar(p.getDato(), q.ultimoNodo());
            p = p.getLigaIzquierda();
        }

        return q;
    }

    public void adicionaHilera(String x) {//Este método utiliza la logica del metodo crearLista solo que cambia
        // los parametros del metodo insertar
        NodoDoble p = this.ultimoNodo();
        int y = x.length();
        int i = 0;
        while (y > 0) {
            if (x.charAt(i) != ' ') {
                insertar(x.charAt(i), this.ultimo);
            }
            y--;
            i++;
        }
    }// usa tambien charAt

    //Este metodo retorna verdadero si la palabra es un palindromo, invoca desde 
    // el this, para ello crea dos nodos, uno que apunta al ultimo y otro a primero
    public boolean palindromo() {
        boolean pali = true;
        NodoDoble p = ultimoNodo();
        NodoDoble q = primerNodo();
        String k = " ";
        if (q == p) {
            return false;
        }
        while (p != q) {//recorre mientras no sean iguales 
            String b = Character.toString(p.getDato());
            String c = Character.toString(q.getDato());
            if (b.equalsIgnoreCase(c)) {
                p = p.getLigaIzquierda();
                q = q.getLigaDerecha();
            } else {
                return false;
            }
            if (p != null) {
                while (p.getDato() == ' ') {

                    p = p.getLigaIzquierda();
                    if (p == null) {
                        return pali;
                    }
                }
            }
            if (q != null) {
                while (q.getDato() == ' ') {
                    q = q.getLigaDerecha();
                    if (q == null) {
                        return pali;
                    }
                }
            }
        }
        return pali;
    } // usa conversion de char a int y compara con metododo de strings 

    public boolean subHilera(String m) {//Método que pregunta si una hilera esta contenida en una 
        //hilera que esta en la lista
        NodoDoble p = this.primerNodo();
        int i = 0;
        String j = m;
        boolean bandera = false;
        while (p != null) { //recorre la lista que se ha seleccionado
            if (i < m.length()) {
                String ch = Character.toString(m.charAt(i));
                String cy = Character.toString(p.getDato());
                if (cy.equalsIgnoreCase(ch)) {//compara caracteres
                    bandera = true;
                    i = i + 1;
                } else if (i > 0) {
                    bandera = false;
                    i = 0;
                }
            } else {
                break;
            }
            p = p.getLigaDerecha();
        }
        return bandera;
    }

    public void OrdenaAlfaLista() {// Metodo que ordena alfabeticamente la lista
        NodoDoble p = this.primerNodo();
        char aux;
        while (p != null) { //ciclo que recorre la lista
            NodoDoble q = p.getLigaDerecha();
            while (q != null) { //ciclo que recorre misma lista pero desde distintas posiciones
                String b = Character.toString(p.getDato());
                String c = Character.toString(q.getDato());
                if (b.compareToIgnoreCase(c) > 0) {// compara las letras para su respectivo ordenamiento
                    aux = p.getDato();
                    p.setDato(q.getDato());
                    q.setDato(aux);
                    q = q.getLigaDerecha();
                } else {
                    q = q.getLigaDerecha();
                }
            }
            p = p.getLigaDerecha();
        }
    }

    public int tamañoLista() {//retorna un entero que es el tamaño de la lista
        NodoDoble p = this.primerNodo();
        int cont = 0;
        while (p != null) {
            cont = cont + 1;
            p = p.getLigaDerecha();
        }
        return cont;
    }//retorna el numero de elementos de la lista

    //Metodo que retorna verdadero en caso de que la hilera sea un anagrama de 
    //otra ingresada por el usuario, para ello con el string ingresado hace una lista
    // y a ambas las ordena alfabeticamente para hcer la comparacion
    public boolean anagrama(String m) {
        boolean k = false;
        NodoDoble p, q;
        String a, d;
        LDL lista;
        LDL anagrama;
        int b, c;
        lista = this.copia();
        anagrama = new LDL();
        anagrama.creaLista(m);
        lista.OrdenaAlfaLista();
        anagrama.OrdenaAlfaLista();
        b = lista.tamañoLista();
        c = anagrama.tamañoLista();
        q = anagrama.primerNodo();
        p = lista.primerNodo();
        if (b != c) {
            return false;
        }
        while (p != null) {
            a = Character.toString(p.getDato());
            d = Character.toString(q.getDato());
            if (p != null && q != null) {
                if (a.equalsIgnoreCase(d)) {
                    p = p.getLigaDerecha();
                    q = q.getLigaDerecha();
                }
            }
        }
        if (p == null && q == null) {
            k = true;
        }
        return k;
    }

    //Metodo que elimina una parte ingresada por un usuario
    public LDL eliminarParte(String k) {
        NodoDoble p, q, r = null;
        String a, b;
        int dim = k.length(), i = 0;
        LDL lista = this.copia();
        boolean subS = this.subHilera(k);
        if (subS == false) {
            return lista;
        }
        LDL parte = new LDL();
        parte.creaLista(k);
        p = lista.primerNodo();
        while (p != null) {// Este While busca donde insertar 
            q = parte.primerNodo();
            a = Character.toString(p.getDato());
            b = Character.toString(q.getDato());
            while (q != null && p != null && a.equalsIgnoreCase(b)) {
                if (r == null) {
                    r = p;
                }
                i++;
                p = p.getLigaDerecha();
                q = q.getLigaDerecha();
                if (dim == i) {
                    p = null;
                }
                if (p != null && q != null) {
                    a = Character.toString(p.getDato());
                    b = Character.toString(q.getDato());
                }
            }
            if (p != null) {
                if (dim != i) {
                    r = null;
                    i = 0;
                }
                p = p.getLigaDerecha();
            }
        }
        p = r;
        while (dim != 0) {
            lista.desconectar(p);
            if (p != null) {
                p = p.getLigaDerecha();
            }
            dim--;
        }
        return lista;

    }

    //Metodo que modifica una parte de la hilera por otra que ingresa el usuario
    public void modificar(String k, String h) {
        LDL parte = new LDL();
        LDL mod = new LDL();
        mod.creaLista(h);
        parte.creaLista(k);
        NodoDoble p, q, r;
        String pt = null, qt = null;
        boolean sal = false;
        int i = 0, j = k.length();
        p = this.primerNodo();
        r = p;
        while (p != null) { // ciclo que recorre la lista original
            q = parte.primerNodo();
            if ((p != null) && (q != null)) {
                pt = Character.toString(p.getDato());
                qt = Character.toString(q.getDato());
            }
            while ((p != null) && (q != null) && (pt.equalsIgnoreCase(qt))) {
                i++;
                if (i == j) {
                    r = p;
                    p = null;
                } else {
                    r = null;
                }
                if ((p != null) && (q != null)) {
                    p = p.getLigaDerecha();
                    q = q.getLigaDerecha();
                }
                if ((p != null) && (q != null)) {
                    pt = Character.toString(p.getDato());
                    qt = Character.toString(q.getDato());
                }
                sal = true;
            }
            if (i != j) {
                i = 0;
            }
            if (sal != true) {
                p = p.getLigaDerecha();

            }
            sal = false;
        }
        if (i != j) {
            return;
        }
        q = p;
        if (r != null) {
            q = r.getLigaDerecha();
        }
        while (j > 0) {
            q = r;
            p = r;
            this.desconectar(r);
            if (p != null) {
                r = p.getLigaIzquierda();
            }
            j--;
        }
        j = h.length();
        p = mod.ultimoNodo();
        if (q != null) {
            q = q.getLigaIzquierda();
        }
        while (j > 0) {
            this.insertar(p.getDato(), q);
            j--;
            p = p.getLigaIzquierda();
        }

    }
}
