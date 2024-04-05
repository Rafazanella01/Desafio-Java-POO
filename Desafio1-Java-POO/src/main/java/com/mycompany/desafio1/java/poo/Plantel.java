package com.mycompany.desafio1.java.poo;
import java.util.Scanner;
/**
 *
 * @author rafaz
 */

public class Plantel {
    private Animal[] plantel = new Animal[100];
    private int proximoIndice = 0;  
    
    public void incluirAnimal(int id, float peso, String tipo, float altura, float largura, String status, float comprimento){
        if (proximoIndice < plantel.length) {
            Animal animal = new Animal(id, peso, tipo, altura, largura, status, comprimento);
            this.plantel[proximoIndice] = animal;
            proximoIndice++;
            System.out.println("Animal adicionado com sucesso!");
        } else {
            System.out.println("Não há espaço para adicionar mais animais.");
        }
    }
    
    public Animal consultarAnimal(int id)
    {
        for(Animal animal : plantel){
            if(animal != null && animal.getId() == id){
                return animal;
            }
        }
        System.out.println("Id não encontrado");
        return null;
    }
      
    public Animal avaliarAnimal()
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite o id do animal a ser alterado: ");
       int id = scanner.nextInt();
        scanner.nextLine();
        
        for(Animal animal : plantel){
            if(animal != null && animal.getId() == id){
                System.out.println("Digite qual atributo voce deseja alterar (Altura, Comprimento, Largura, Peso, Status): ");
                String op = scanner.nextLine();
                
                op = op.toLowerCase();
                
                switch(op){
                    
                    case"altura":
                        System.out.println("Digite o nova altura: ");
                        float altura = scanner.nextFloat();

                        if(!(altura < animal.getAltura())){
                           animal.setAltura(altura);
                           System.out.println("Altura alterada com sucesso!");
                        }
                        break;                   
                    case"comprimento":
                        System.out.println("Digite o novo comprimento: ");
                        float comprimento = scanner.nextFloat();

                        if(!(comprimento < animal.getComprimento())){
                           animal.setComprimento(comprimento);
                           System.out.println("comprimento alterado com sucesso!");  
                        }
                        break;    
                    case"largura":
                        System.out.println("Digite a nova largura: ");
                        float largura = scanner.nextFloat();

                        if(!(largura < animal.getLargura())){
                           animal.setLargura(largura);
                           System.out.println("largura alterada com sucesso!");  
                        }  
                        break;    
                    case"peso":    
                        System.out.println("Digite o novo peso: ");
                        float peso = scanner.nextFloat();

                        if(!(peso < animal.getPeso())){
                           animal.setPeso(peso);
                           System.out.println("peso alterado com sucesso!");  
                        }   
                        break;    
                    case"status":        
                        System.out.println("Digite o novo status: ");
                        String status = scanner.nextLine();

                        if(!status.equals(animal.getStatus())){
                           animal.setStatus(status);
                           System.out.println("Status alterado com sucesso!");  
                        }   
                        break;   
                    default:
                        
                    System.out.println("Atributo invalido! ");
                    break;
                } 
            }
        }
        return null;
    }
        
    public boolean registrarVendaAnimal(int id)
    {
        for (Animal animal : plantel) {
            if (animal != null && animal.getId() == id) {
              animal.setStatus("vendido");
              System.out.println("Animal vendido com sucesso!");
              return true;
            }
        }
          System.out.println("Animal com ID " + id + " não encontrado.");
          return false; 
    }
    
    public boolean registrarPerdaAnimal(int id)
    {
         for (Animal animal : plantel) {
            if (animal != null && animal.getId() == id) {
              animal.setStatus("perdido");
              System.out.println("Animal Perdido!");
              return true;
            }
        }
          System.out.println("Animal com ID " + id + " não encontrado.");
          return false; 
    }
     
    public void relatorioAnimaisPorTipo() {
        // Contadores para cada tipo de animal
        int totalBovinos = 0;
        int totalEquinos = 0;
        int totalSuinos = 0;

        // Contagem de animais por tipo
        for (Animal animal : plantel) {
            if (animal instanceof Bovino) {
                totalBovinos++;
            } else if (animal instanceof Equino) {
                totalEquinos++;
            } else if (animal instanceof Suino) {
                totalSuinos++;
            }
        }

        // Impressão do relatório
        System.out.println("Relatorio de Animais por Tipo:");
        System.out.println("Bovinos: " + totalBovinos);
        System.out.println("Equinos: " + totalEquinos);
        System.out.println("Suínos: " + totalSuinos);
    }

    public void relatorioVendas() {
        System.out.println("Relatorio de Vendas:");
        for (Animal animal : plantel) {
            if (animal != null && animal.getStatus().equalsIgnoreCase("vendido")) {
                Animal.formatado(animal);
            }
        }
    }

    public void relatorioPerdas() {
        System.out.println("Relatorio de Perdas:");
        for (Animal animal : plantel) {
            if (animal != null && animal.getStatus().equalsIgnoreCase("perdido")) {
                Animal.formatado(animal);
            }
        }
    }

    }
