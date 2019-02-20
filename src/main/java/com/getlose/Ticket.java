package com.getlose;

public class Ticket {

    int origin;
    int price;
    int destination;

    public Ticket() {
    }

    public Ticket(int origin, int price, int destination) {
        this.origin = origin;
        this.price = price;
        this.destination = destination;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
}
