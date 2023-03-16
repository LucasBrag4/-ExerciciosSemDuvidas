/* Criar um projeto para Cadastrar Bicicletas.

Criar uma Classe Bicicleta com 3 Atributos públicos e 4 Atributos privados; 
criar 2 métodos para cadastrar os atributos privados; 
Criar um construtor para atribuir 2 atributos; 
Na Classes principal Cadastrar no mínimo 4 Bicicletas;
Na Classe principal Mostrar 4 Mensagens destacando os 7 atributos das 2 primeiras bicicletas cadastradas; */

package Bicicletas;

import java.util.Scanner;

public class BicicletasMain {

   
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        
       Bicicletas b01 = new Bicicletas("Thanos", 700, "modelo1", "branco");
       Bicicletas b02 = new Bicicletas("Thanos", 700, "modelo1", "branco");
       Bicicletas b03 = new Bicicletas("Thanos", 700, "modelo1", "branco");
       Bicicletas b04 = new Bicicletas("Thanos", 700, "modelo1", "branco");
       
       System.out.println("===============LISTA DE ADVOGADOS CADASTRADOS==============");
        System.out.println(b01.getMarca());
        System.out.println(b01.getAro());
        System.out.println(b01.getModelo());
        System.out.println(b01.getCor());

        
        System.out.println("===========================================================");
        System.out.println(b02.getMarca());
        System.out.println(b02.getAro());
        System.out.println(b02.getModelo());
        System.out.println(b02.getCor());
        
        
        System.out.println("===========================================================");
        System.out.println(b03.getMarca());
        System.out.println(b03.getAro());
        System.out.println(b03.getModelo());
        System.out.println(b03.getCor());
        
        
        System.out.println("===========================================================");
        System.out.println(b04.getMarca());
        System.out.println(b04.getAro());
        System.out.println(b04.getModelo());
        System.out.println(b04.getCor());
        
        
       
    }
    
}
