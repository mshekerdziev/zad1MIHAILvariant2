package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	Referat originalReferat = new Referat(new Author("Purvo"),"Matematika",10);

        Referat clone1 = (Referat) originalReferat.clone();
        clone1.getAvtor().setIme("Vtoro");

        Referat clone2 = (Referat) originalReferat.clone();
        clone2.getAvtor().setIme("Treto");

        Referat clone3 = (Referat) originalReferat.clone();
        clone3.getAvtor().setIme("Chetvurto");

        originalReferat.submit();
        clone1.submit();
        clone2.submit();
        clone3.submit();

        System.out.println(originalReferat);
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);



    }
}
