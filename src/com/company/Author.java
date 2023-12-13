package com.company;

public class Author implements Cloneable {
    String ime;

    public Author(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "Author{" +
                "ime='" + ime + '\'' +
                '}';
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
