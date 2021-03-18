package Programas;

import java.util.Scanner;

import Classes.Cliente;
import Classes.Conta;



public class ProgramaConta {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente("Bernard", conta);
        int opcao = -1;
    
          while (opcao != 0){
           exibeMenu();
           opcao = ler.nextInt();
           

        switch(opcao){
            case 0:
              System.out.println("Encerrando a aplicação");
              return;
            case 1:
              sacar(ler, cliente);
              break;
            case 2:
               depositar(ler, cliente);
               break;
            case 3:
            exibirSaldo(cliente);
              break;
          default :
            System.out.println("Operação inválida. Tente novamente"); 

        }
          }
    
    
    
    

     ler.close();
}

    private static void exibirSaldo(Cliente cliente) {
        cliente.exibirSaldo();
    }

    private static void depositar(Scanner ler, Cliente cliente) {
        Double valor;
        System.out.println("Digite o valor a depositar");
           valor = ler.nextDouble();
           cliente.depositar(valor);
    }

    private static void sacar(Scanner ler, Cliente cliente) {
        Double valor;
        System.out.println("Digite o valor a sacar");
          valor = ler.nextDouble();
          cliente.sacar(valor);
    }

    private static void exibeMenu() {
           System.out.println("\n******************");
           System.out.println("1 - Saque"); 
           System.out.println("2 - Deposito");
           System.out.println("3 - Saldo");
           System.out.println("0 - Sair");
           System.out.println("Digite a opção desejada:");
    }
}

