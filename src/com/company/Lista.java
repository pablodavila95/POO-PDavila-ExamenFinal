package com.company;


public class Lista<T> {
    private Node<Articulo> first = null;


    public void insert(Node<Articulo> node) {
        node.setNext(first);
        first = node;
    }

    //Verifica si el producto esta en stock y si no esta agrega un producto fantasma para evitar nullpointer!
    public void insertTicket(Node<Articulo> node) {
        int stock;
        int cant;
        double tot;

        if (node.getValue().getStock() > 0 && node.getValue().getCantLista() == 0) {
            node.setNext(first);
            first = node;
            stock = node.getValue().getStock();
            stock = stock  - 1;
            cant = node.getValue().getCantLista();
            cant = cant + 1;
            node.getValue().setStock(stock);
            node.getValue().setCantLista(cant);
        }
        else if (node.getValue().getStock() > 0 && node.getValue().getCantLista() == 1){
            stock = node.getValue().getStock();
            stock = stock  - 1;
            node.getValue().setStock(stock);
            cant = node.getValue().getCantLista();
            cant = cant + 1;
            node.getValue().setCantLista(cant);
            tot = node.getValue().getPrice();
            tot = tot + tot;
            node.getValue().setStock(stock);
            node.getValue().setPrice(tot);
        }
        else if (node.getValue().getStock() > 0 && node.getValue().getCantLista() > 1){
            stock = node.getValue().getStock();
            stock = stock  - 1;
            node.getValue().setStock(stock);
            cant = node.getValue().getCantLista();
            cant = cant + 1;
            node.getValue().setCantLista(cant);
            tot = node.getValue().getPrice();
            tot = tot + (tot/(cant-1));
            node.getValue().setStock(stock);
            node.getValue().setPrice(tot);
        }

        }


    public int sumarTotal() {
        Node<Articulo> n;
        n = (Node<Articulo>) first;
        int total = 0;

        while (n != null) {
            total = (int) (total + n.getValue().getPrice());
            n = n.getNext();
        }
        System.out.print(total);
        return total;
    }

    public void printTicket() {
        print();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("El total de tu compra es de $");
        sumarTotal();
    }

    public String search(int s) {
        Node<Articulo> n;
        n = (Node<Articulo>) first;
        while (n != null) {
            if (n.getValue().getClave() == s)
                System.out.println("Encontrado " + n.getValue().toString());
            n = n.getNext();
            System.out.println("NO Encontrado ");
        }
        return "no se encuentra";
    }

    public void remove(){
        if(first.getNext()!=null)
            first = first.getNext();
        else first = null;
    }


    private void printList(Node<Articulo> node) {
        System.out.println(node.getValue().toString());
        if(node.getNext()!=null)
            printList(node.getNext());
    }

    public void print(){
        printList(first);
    }

}
