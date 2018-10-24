package BancoExercicio.DAO;

import BancoExercicio.Conta;

public class ContaDAO {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.cadastro();
        Conta c2 = new Conta();
        c2.cadastro();

        if (c1 == c2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        c2 = c1;

        if (c1 == c2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
