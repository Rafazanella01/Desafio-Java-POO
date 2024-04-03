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
    
    public Animal(int id, float peso, String tipo, float altura, float largura, String status, float comprimento){
        
        if(!(altura  <= 0 || comprimento  <= 0 || largura  <= 0 || peso <= 0)){
        this.id = id;
        this.peso = peso;
        this.tipo = tipo;
        this.altura = altura;
        this.largura = largura;
        this.status = status;
        this.comprimento = comprimento;
        } else{
        System.out.println("As informacoes do Animal nao sao aceitas");
        }
    }
    
    //=========================Getters=================================//
    public int getId()
    {
        return id;
    }
    
    public float getPeso()
    {
        return peso;
    }
     
    public String getTipo()
    {
        return tipo;
    }
      
    public float getAltura()
    {
        return altura;
    }
       
    public float getLargura()
    {
        return largura;
    }
        
    public String getStatus()
    {
        return status;
    }
         
    public float getComprimento()
    {
        return comprimento;
    }
    
    //=========================Setters=================================//
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setPeso(float peso)
    {
        this.peso = peso;
    }
     
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
      
    public void setAltura(float altura)
    {
        this.altura = altura;
    }
       
    public void setLargura(float largura)
    {
        this.largura = largura;
    }
        
    public void setStatus(String status)
    {
         this.status = status;
    }
         
    public void setComprimento(float comprimento)
    {
        this.comprimento = comprimento;
    }
}
