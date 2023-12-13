package com.company;

public class Referat extends Document implements Cloneable {
    Author avtor;
    String tema;
    int stranici;
    Referat () {}
    public Author getAvtor() {
        return avtor;
    }

    public String getTema() {
        return tema;
    }

    public int getStranici() {
        return stranici;
    }

    public void setAvtor(Author avtor) {
        this.avtor = avtor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setStranici(int stranici) {
        this.stranici = stranici;
    }

    public Referat(Author avtor, String tema, int stranici) {
        this.avtor = avtor;
        this.tema = tema;
        this.stranici = stranici;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Referat clonedReferat = (Referat) super.clone();
        clonedReferat.avtor = (Author) avtor.clone();
        return clonedReferat;
    }

    @Override
    void submit() {
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Referat{" +
                "avtor=" + avtor +
                ", tema='" + tema + '\'' +
                ", stranici=" + stranici +
                '}';
    }
}
