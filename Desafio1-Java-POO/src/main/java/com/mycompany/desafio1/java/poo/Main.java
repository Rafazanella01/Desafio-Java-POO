package com.mycompany.desafio1.java.poo;
import com.mycompany.desafio1.java.poo.Animal;
import com.mycompany.desafio1.java.poo.Bovino;
import com.mycompany.desafio1.java.poo.Equino;
import com.mycompany.desafio1.java.poo.Suino;
import com.mycompany.desafio1.java.poo.Plantel;
import java.util.Scanner;

/**
 *
 * @author rafaz
 */
public class Main {
  public static void main(String[] args) {
    Plantel plantel = new Plantel();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("\n====== Menu ======");
        System.out.println("1. Incluir Animal");
        System.out.println("2. Consultar Animal");
        System.out.println("3. Avaliar Animal");
        System.out.println("4. Registrar Venda de Animal");
        System.out.println("5. Registrar Perda de Animal");
        System.out.println("6. Relatorio de Animais por Tipo");
        System.out.println("7. Relatorio de Vendas");
        System.out.println("8. Relatorio de Perdas");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opcao: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (opcao) {
            case 1:                           
                System.out.println("\n=== Incluir Animal ===");
                System.out.print("Digite o ID do animal: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Digite o peso do animal: ");
                float peso = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Digite o tipo do animal: ");
                String tipo = scanner.nextLine();
                System.out.print("Digite a altura do animal: ");
                float altura = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Digite a largura do animal: ");
                float largura = scanner.nextFloat();
                scanner.nextLine(); 
                System.out.print("Digite o status do animal: ");
                String status = scanner.nextLine();
                System.out.print("Digite o comprimento do animal: ");
                float comprimento = scanner.nextFloat();
                scanner.nextLine(); 
                
                plantel.incluirAnimal(id, peso, tipo, altura, largura, status, comprimento);
                
                break;
            case 2:
                // Consultar Animal
                System.out.println("\n=== Consultar Animal ===");
                System.out.println("Digite o ID do animal: ");
                int idConsultar = scanner.nextInt();
                scanner.nextLine();
                Animal animalConsultado = plantel.consultarAnimal(idConsultar);
                if (animalConsultado != null) {
                    Animal.formatado(animalConsultado);
                }
                break;
            case 3:
                // Avaliar Animal
                System.out.println("\n=== Avaliar Animal ===");
                plantel.avaliarAnimal();
                break;
            case 4:
                // Registrar Venda de Animal
                System.out.println("\n=== Registrar Venda de Animal ===");
                System.out.println("Digite o ID do animal vendido: ");
                int idVenda = scanner.nextInt();
                scanner.nextLine();
                plantel.registrarVendaAnimal(idVenda);
                break;
            case 5:
                // Registrar Perda de Animal
                System.out.println("\n=== Registrar Perda de Animal ===");
                System.out.println("Digite o ID do animal perdido: ");
                int idPerda = scanner.nextInt();
                scanner.nextLine();
                plantel.registrarPerdaAnimal(idPerda);
                break;
            case 6:
                // Relatório de Animais por Tipo
                System.out.println("\n=== Relatorio de Animais por Tipo ===");
                plantel.relatorioAnimaisPorTipo();
                break;
            case 7:
                // Relatório de Vendas
                System.out.println("\n=== Relatorio de Vendas ===");
                plantel.relatorioVendas();
                break;
            case 8:
                // Relatório de Perdas
                System.out.println("\n=== Relatorio de Perdas ===");
                plantel.relatorioPerdas();
                break;
            case 9:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opcao invalida! Por favor, escolha uma opcao valida.");
                break;
        }
    } while (opcao != 9);

    scanner.close();
}

}
