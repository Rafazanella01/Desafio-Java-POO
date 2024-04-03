package com.mycompany.desafio1.java.poo;
import java.util.Scanner;
/**
 *
 * @author rafaz
 */
public class Plantel {
    private Animal[] plantel = new Animal[100];
      
    
    public void incluirAnimal(Animal animal)
    {
        this.plantel[0] = animal;
    }
    
    public Animal consultarAnimal(int id)
    {
        for(Animal animal : plantel){
            if(animal != null && animal.getId() == id){
                return animal;
            }
        }
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
        
    public void registrarVendaAnimal(int id)
    {
        
    }
    
    public void registrarPerdaAnimal(int id)
    {
        
    }
     
    public void relatorioAnimaisPorTipo(int id)
    {
        
    }
      
    public void relatorioVendas(int id)
    {
        
    }
    
    public void relatorioPerdas(int id)
    {
        
    }
    
}
