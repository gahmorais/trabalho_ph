package com.example.maquina_de_comida;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Maquina {
    private String nome;
    private int saldo;

    // Construtores, getters e setters
    public Maquina(String nome) {
        this.nome = nome;
        this.saldo = 0; // Inicializa com saldo 0
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public void adicionarMoeda(int valor) {
        this.saldo += valor;
    }

    public String comprarDoce(String tipo) {
        int preco = 0;
        //A letra está vindo acompanhada de aspas do frontend, precisa tratar..
        //Como medida paleativa utilizar replace para rancar as aspas..
        String tipoCorrigido = tipo.replace("\"","");
        switch (tipoCorrigido) {
            case "A": preco = 6; break;
            case "B": preco = 7; break;
            case "C": preco = 8; break;
            default: return "Doce não encontrado!";
        }

        if (this.saldo >= preco) {
            this.saldo -= preco;
            return "Você comprou o Doce " + tipo + "!";
        } else {
            return "Saldo insuficiente!";
        }
    }
}

