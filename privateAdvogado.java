/* Criar uma Classe Advogado com 2 Atributos Públicos e 5 Atributos Privados; 
A Classe deverá conter um construtor preenchendo os 2 atributos públicos e 1 Método para preencher cada atributo privado;
A Classe também deverá conter 1 método para retornar o valor preenchido de cada atributo privado;

Na Classe Principal solicitar o Cadastro de 8 Advogados preenchendo os Atributos Públicos diretamente e caso o atributo público
não for preenchido deverá ser validado solicitando para o Atributo ser cadastrado;

Solicitar o preenchimento dos outros atributos através do método definido na Classe Advogado;
Na Classe Principal retornar os 3 Últimos Advogados Cadastrados; 1 Por linha; porém em cada linha concatenar todos os atributos do Advogado; */

package cachorro.cadastraradvogados;


 class privateAdvogado {
    private final String nomeAdvogado;
    private final String funcaoAdvogado;
    private final int contatoAdvogado;
    private final String enderecoAdvogado;
    private final int anosProfissao;
    
    public privateAdvogado (String nome, String funcao, int contato, String endereco, int anos ){
        nomeAdvogado = nome;
        funcaoAdvogado = funcao;
        contatoAdvogado = contato;
        enderecoAdvogado = endereco;
        anosProfissao = anos;
    }

    public String getNome() { //retorna o get atribuido no nome cachorro
        return "Nome do Advogado: " + nomeAdvogado; 
    }
    public String getFuncao() {
        return "Área em que atua: " + funcaoAdvogado;
    }
    public String getContato() {
        return "Telefone: " + contatoAdvogado;
    }
    public String getEndereco() {
        return "Endereço: " + enderecoAdvogado;
    }
    public  String getAnos() {
        return "Anos de profissão: " + anosProfissao + " anos";
    }
}