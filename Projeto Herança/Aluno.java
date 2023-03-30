
package com.mycompany.projetoheranca;

import java.util.Date;

public class Aluno extends Pessoa{
        public Aluno(String _nome, String _cpf, Date _data) {
            super(_nome, _cpf, _data); //super função reservada que atribui valor no construtor da origem da herança
        }   //constrói o que está pré-construido
        public String matricula;
}

