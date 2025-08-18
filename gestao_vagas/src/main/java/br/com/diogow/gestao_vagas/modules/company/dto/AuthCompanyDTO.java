package br.com.diogow.gestao_vagas.modules.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class AuthCompanyDTO {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
}
