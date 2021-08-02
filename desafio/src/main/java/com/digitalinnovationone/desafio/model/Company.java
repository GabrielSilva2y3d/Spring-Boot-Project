package com.digitalinnovationone.desafio.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Company {
    private long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade; 
    private String estado;
    private String tel;

}
