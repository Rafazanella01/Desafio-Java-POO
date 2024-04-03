package com.mycompany.desafio1.java.poo;

/**
 *
 * @author rafaz
 */
public class Animal {
    
    private int id;
    private float peso;
    private String tipo;
    private float altura;
    private float largura;
    private String status;
    private float comprimento;
    
    public Animal(int Id, float peso, String tipo, float altura, float largura, String status, float comprimento){
        
        if(!(altura  <= 0 || comprimento  <= 0 || largura  <= 0 || peso <= 0)){
        this.id = id;
        this.peso = peso;
        this.tipo = tipo;
        this.altura = altura;
        this.largura = largura;
        this.status = status;
        this.comprimento = comprimento;
        }
        System.out.println("As informações do Animal não são aceitas");
    }
}
