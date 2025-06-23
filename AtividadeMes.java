package com.trabalho;

import java.util.Scanner;

public class AtividadeMes {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String Mes = "";
    int Ano = 0;
    boolean Bissexto = false;
    int n1 = 0;
    int n2 = 0;

    System.out.print("Digite o Nome do Mês ou o Número: ");
    Mes = scan.nextLine();
    
    System.out.print("Digite o Ano: ");
    Ano = scan.nextInt();
    
    if(Ano < 400){
        if(Ano % 4 == 0){
            Bissexto = true;
            System.out.println("Este Ano é Bissexto!");
        }else{
            Bissexto = false;
            System.out.println("Este Ano Não é Bissexto!");
        }
    }else if(Ano >= 400){
        n1 = (Ano % 100) / 10;
        n2 = Ano % 10;

        if(n1 == 0 && n2 == 0){
            int Calc = Ano % 4;
            int Calc2 = Ano % 400;

            if(Calc == 0 && Calc2 == 0){
                Bissexto = true;
                System.out.println("Ano Bissexto!");
            }else{
                Bissexto = false;
                System.out.println("Este Ano Não é Bissexto!");
            }
        }else{
            int Calc = Ano % 4;

            if(Calc == 0){
                Bissexto = true;
                System.out.println("Ano Bissexto!");
            }else{
                Bissexto = false;
                System.out.println("Este Ano Não é Bissexto!");
            }
        }
    }

    if (Mes.equals("Janeiro") || Mes.equals("1")) {
    System.out.println("Quantidade de dias: 31");
    }else if (Mes.equals("Fevereiro") || Mes.equals("2")) {
        if (Bissexto == true) {
            System.out.println("Quantidade de dias: 29");
        }else {
            System.out.println("Quantidade de dias: 28");
        }

    }else if (Mes.equals("Março") || Mes.equals("3")) {
        System.out.println("Quantidade de dias: 31");

    }else if (Mes.equals("Abril") || Mes.equals("4")) {
        System.out.println("Quantidade de dias: 30");

    }else if (Mes.equals("Maio") || Mes.equals("5")) {
        System.out.println("Quantidade de dias: 31");

    }else if (Mes.equals("Junho") || Mes.equals("6")) {
        System.out.println("Quantidade de dias: 30");

    }else if (Mes.equals("Julho") || Mes.equals("7")) {
        System.out.println("Quantidade de dias: 31");

    }else if (Mes.equals("Agosto") || Mes.equals("8")) {
        System.out.println("Quantidade de dias: 31");

    }else if (Mes.equals("Setembro") || Mes.equals("9")) {
        System.out.println("Quantidade de dias: 30");

    }else if (Mes.equals("Outubro") || Mes.equals("10")) {
        System.out.println("Quantidade de dias: 31");

    }else if (Mes.equals("Novembro") || Mes.equals("11")) {
        System.out.println("Quantidade de dias: 30");

    }else if (Mes.equals("Dezembro") || Mes.equals("12")) {
        System.out.println("Quantidade de dias: 31");

    }else {
        System.out.println("Mês inválido.");
    }
    }
}