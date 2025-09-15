package br.com.diogow.gestao_vagas.modules.company.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthCompanyResponseDTO {

    private String access_token;
    private Long expires_in;
    private List<String> roles;
}
