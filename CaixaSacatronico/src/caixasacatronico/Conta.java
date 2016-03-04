package caixasacatronico;

import java.util.Scanner;

public class Conta {

    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);

    public Conta(String nome, int conta, double saldo_inicial) {
        this.nome = nome;
        this.conta = conta;
        saldo = saldo_inicial;
        saques = 0;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
            return true;
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
            return false;
        }
    }

    public void iniciar() {
        int opcao;

        do {
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        } while (opcao != 2);
    }

    public void exibeMenu() {

        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Sacar");
        System.out.println("2 - Sair\n");
        System.out.print("Opção: ");

    }

    public void escolheOpcao(int opcao) {
        double valor;

        switch (opcao) {
            case 1:
                if (saques < 3) {
                    System.out.print("Quanto deseja sacar (somente notas de 50 disponíveis para saque): ");
                    valor = entrada.nextDouble();

                    if (valor % 50 == 0) {
                        sacar(valor);
                    } else {
                        System.out.println("O caixa só possui notas de 50.");
                    }

                } else {
                    System.out.println("Limite de saques diários atingidos.\n");
                }
                break;
            case 2:
                System.out.println("Sistema encerrado.");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}
