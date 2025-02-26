package org.lesson.java.bookStore;

import java.util.Scanner;

public class book {
    public static void main(String[] args){
        String titolo = "I promessi sposi";
        boolean IscopertinaFlessibile = true;
        String autore = "Alessandro Manzoni";
        float valutazione = 4.5f;
        int numeroDiVoti = 873;
        String sinossi = "Sinossi";
        String isbn = "99095325x245";
        float prezzo  ;
        int numeroPagine = 686;
        float peso = 460f;
        float lunghezza = 3.8f;
        float larghezza = 19.5f;
        float altezza = 5.3f;
        Scanner in = new Scanner(System.in);
        prezzo = in.nextFloat();
        System.out.println("Il libro intitolato " + titolo + " che ha una copertina flessibile: " + IscopertinaFlessibile );
        System.out.println("Scritto da " + autore + ", e valutato da " + numeroDiVoti + " utenti" + " per una valutazione media di " + valutazione + " su 5 stelle");
        System.out.println("La cui sinossi e' " + sinossi);
        System.out.println("Il prezzo e': " + prezzo + " euro" + " e ha " + numeroPagine + " pagine, " + "e dimensioni " + lunghezza + " X " + larghezza + " X " + altezza + " cm, pesa inoltre " + peso + " kg" + " con codice isbn: " + isbn);
    }
}
