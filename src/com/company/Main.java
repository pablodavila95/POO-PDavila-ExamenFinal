package com.company;


public class Main {

    public static void main(String[] args) {

        Lista<Articulo> misArticulos = new Lista<>();
        Articulo Art1 = new Articulo(1, "flores", 15, "2018-23-15", 23);
        Articulo Art2 = new Articulo(2, "comida", 16, "2018-23-15", 0);
        Articulo Art3 = new Articulo(3, "laptop", 76, "2018-23-15", 12);
        Articulo Art4 = new Articulo(4, "agua", 21, "2018-23-15", 5);
        Articulo Art5 = new Articulo(5, "gpu", 98, "2018-23-15", 3);

        misArticulos.insert(new Node<>(Art1));
        misArticulos.insert(new Node<>(Art2));
        misArticulos.insert(new Node<>(Art3));
        misArticulos.insert(new Node<>(Art4));
        misArticulos.insert(new Node<>(Art5));


        Lista<Articulo> ticket = new Lista<>();
        ticket.insertTicket(new Node<>(Art3));
        ticket.insertTicket(new Node<>(Art3));
        ticket.insertTicket(new Node<>(Art3));
        ticket.insertTicket(new Node<>(Art3));

        ticket.insertTicket(new Node<>(Art1));
        ticket.insertTicket(new Node<>(Art1));

        ticket.insertTicket(new Node<>(Art5));

        //Por limitaciones no se debe agregar un articulo vacio unicamente...
        ticket.insertTicket(new Node<>(Art2));


        ticket.printTicket();




        //misArticulos.print();
    }
}
