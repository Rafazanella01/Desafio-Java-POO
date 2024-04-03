package com.mycompany.desafio1.java.poo;
import com.mycompany.desafio1.java.poo.Animal;
import com.mycompany.desafio1.java.poo.Bovino;
import com.mycompany.desafio1.java.poo.Equino;
import com.mycompany.desafio1.java.poo.Suino;
import com.mycompany.desafio1.java.poo.Plantel;

/**
 *
 * @author rafaz
 */
public class Main {
   public static void main(String[] args) {
        
       //Animal animal = new Animal(1, 23, "boi", 2, 3, "ativo", 2);
       
       Bovino bovino = new Bovino(4, 23, "", 2, 3, "ativo", 3);
       
       bovino.setId(2);
       String tipo = bovino.getTipo();
       
       int idDoBovino = bovino.getId();
       System.out.println("ID do bovino: " + idDoBovino);
       System.out.println("Tipo do bovino: " + tipo);

   }
}
