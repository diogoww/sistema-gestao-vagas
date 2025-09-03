package br.com.diogow.gestao_vagas.exceptions;

public class JobNotFoundException extends RuntimeException{

    public JobNotFoundException(){
        super("A vaga não existe");
    }
}
