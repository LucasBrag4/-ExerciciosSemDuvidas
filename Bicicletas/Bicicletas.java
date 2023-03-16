/* Criar um projeto para Cadastrar Bicicletas.

Criar uma Classe Bicicleta com 3 Atributos públicos e 4 Atributos privados; 
criar 2 métodos para cadastrar os atributos privados; 
Criar um construtor para atribuir 2 atributos; 
Na Classes principal Cadastrar no mínimo 4 Bicicletas;
Na Classe principal Mostrar 4 Mensagens destacando os 7 atributos das 2 primeiras bicicletas cadastradas; */

package Bicicletas;

 class Bicicletas {
    private final String marcaBicicleta;
    private final int aroBicicleta;
    private final String modeloBicicleta;
    private final String corBicicleta;
    
    public Bicicletas (String marca, int aro, String modelo, String cor) {
        marcaBicicleta = marca;
        aroBicicleta = aro;
        modeloBicicleta = modelo;
        corBicicleta = cor;
    }
    public String getMarca(){
        return "Marca da Bicicleta: " + marcaBicicleta;
    }
    public String getAro(){
        return "Aro da Bicicleta: " + aroBicicleta;
    }
    public String getModelo(){
        return "Modelo da bicicleta: " + modeloBicicleta;
    }
    public String getCor() {
        return "A cor da bicicleta é: " + corBicicleta;
    }
}
