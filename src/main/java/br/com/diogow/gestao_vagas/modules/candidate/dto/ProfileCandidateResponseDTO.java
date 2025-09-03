package br.com.diogow.gestao_vagas.modules.candidate.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {

    @Schema(example = "Desenvolvedor Java")
    private String description;

    @Schema(example = "diogow2003")
    private String username;

    @Schema(example = "diogow@dev.com.br")
    private String email;

    private UUID id;

    @Schema(example = "Diogo J. V. de Oliveira")
    private String name;
}
