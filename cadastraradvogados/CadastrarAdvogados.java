/* Criar uma Classe Advogado com 2 Atributos Públicos e 5 Atributos Privados; 
A Classe deverá conter um construtor preenchendo os 2 atributos públicos e 1 Método para preencher cada atributo privado;
A Classe também deverá conter 1 método para retornar o valor preenchido de cada atributo privado;

Na Classe Principal solicitar o Cadastro de 8 Advogados preenchendo os Atributos Públicos diretamente e caso o atributo público
não for preenchido deverá ser validado solicitando para o Atributo ser cadastrado;

Solicitar o preenchimento dos outros atributos através do método definido na Classe Advogado;
Na Classe Principal retornar os 3 Últimos Advogados Cadastrados; 
1 Por linha; porém em cada linha concatenar todos os atributos do Advogado; */

package cachorro.cadastraradvogados;

public class CadastrarAdvogados {

    public static void main(String[] args) {
        privateAdvogado adv1 = new privateAdvogado("João", "Criminal", 999945645, "Avenida Brasil", 10);
        privateAdvogado adv2 = new privateAdvogado("Maria", "Aposentadoria", 98514549, "Avenida das pombas", 6);
        privateAdvogado adv3 = new privateAdvogado("Anderso", "Pensionista", 88564121, "Rua Barao do Rio Branco", 2);
        privateAdvogado adv4 = new privateAdvogado("Andresa", "Criminal", 45216587, "Rua Barao do Cerro Azul", 4);
        privateAdvogado adv5 = new privateAdvogado("Caio", "Conjugal", 98231456, "Avenida das pombas", 8);
        privateAdvogado adv6 = new privateAdvogado("Gabriel", "Aposentadoria", 99417788, "Rua Recife", 12);
        privateAdvogado adv7 = new privateAdvogado("Lucas", "Criminal", 98321221, "Rua Rio de Janeiro", 4);
        privateAdvogado adv8 = new privateAdvogado("Marcia", "Criminal", 99885144, "Rua Carlos Gomes", 3); 
        
        System.out.println("===============LISTA DE ADVOGADOS CADASTRADOS==============");
        System.out.println(adv1.getNome());
        System.out.println(adv1.getFuncao());
        System.out.println(adv1.getContato());
        System.out.println(adv1.getEndereco());
        System.out.println(adv1.getAnos());
        
        System.out.println("===========================================================");
        System.out.println(adv2.getNome());
        System.out.println(adv2.getFuncao());
        System.out.println(adv2.getContato());
        System.out.println(adv2.getEndereco());
        System.out.println(adv2.getAnos());
        
        System.out.println("===========================================================");
        System.out.println(adv3.getNome());
        System.out.println(adv3.getFuncao());
        System.out.println(adv3.getContato());
        System.out.println(adv3.getEndereco());
        System.out.println(adv3.getAnos());
        
        System.out.println("===========================================================");
        System.out.println(adv4.getNome());
        System.out.println(adv4.getFuncao());
        System.out.println(adv4.getContato());
        System.out.println(adv4.getEndereco());
        System.out.println(adv4.getAnos());
        
        System.out.println("===========================================================");
        System.out.println(adv5.getNome());
        System.out.println(adv5.getFuncao());
        System.out.println(adv5.getContato());
        System.out.println(adv5.getEndereco());
        System.out.println(adv5.getAnos());
        
        System.out.println("===========================================================");
        System.out.println(adv6.getNome());
        System.out.println(adv6.getFuncao());
        System.out.println(adv6.getContato());
        System.out.println(adv6.getEndereco());
        System.out.println(adv6.getAnos());
        
        System.out.println("===========================================================");
        System.out.println(adv7.getNome());
        System.out.println(adv7.getFuncao());
        System.out.println(adv7.getContato());
        System.out.println(adv7.getEndereco());
        System.out.println(adv7.getAnos());
        
        System.out.println("===========================================================");
        System.out.println(adv8.getNome());
        System.out.println(adv8.getFuncao());
        System.out.println(adv8.getContato());
        System.out.println(adv8.getEndereco());
        System.out.println(adv8.getAnos());
        
        System.out.println("=========================================================================================================================="); 
        System.out.println("" + adv6.getNome() + ", " + adv6.getFuncao() + ", " + adv6.getContato() + ", " + adv6.getEndereco() + ", " + adv6.getAnos());
        System.out.println("" + adv7.getNome() + ", " + adv7.getFuncao() + ", " + adv7.getContato() + ", " + adv7.getEndereco() + ", " + adv7.getAnos());
        System.out.println("" + adv8.getNome() + ", " + adv8.getFuncao() + ", " + adv8.getContato() + ", " + adv8.getEndereco() + ", " + adv8.getAnos());
    }
}
