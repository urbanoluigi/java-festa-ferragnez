package com.ferragnez.party;

import java.util.Scanner;
public class CheckGuest {
    public static void main(String[] args) {

        // Lista degli invitati
        String[] listaInvitati = {
                "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax",
                "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis",
                "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
        };

        // Input del nome dall'utente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nomeUtente = scanner.nextLine();

        // Verifica se il nome è presente nella lista
        boolean presente = false;
        for (String invitato : listaInvitati) {
            if (invitato.equals(nomeUtente)) {
                presente = true;
                break;
            }
        }

        // Stampa il risultato
        if (presente) {
            System.out.println("Benvenuto alla festa!");
        } else {
            System.out.println("Mi dispiace, non sei nella lista degli invitati. Arrivederci!");
        }

        // Chiudi lo scanner
        scanner.close();
    }
}
