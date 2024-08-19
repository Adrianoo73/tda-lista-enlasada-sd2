public class Main {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
    
        System.out.println("ELEMENTOS EN LA LISTA:");
        lista.recorrer();
    
        System.out.println("BUSCAR 20: " + lista.buscar(20));
        lista.eliminar(20);
        System.out.println("ELEMENTOS DESPUES DE ELIMINAR 20:");
        lista.recorrer();
    
        System.out.println("¿LA LISTA VASIA? " + lista.estaVacia());
    }
    }