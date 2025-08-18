package br.com.diogow.gestao_vagas.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CreateJobDTO {
    @Schema(example = "Vaga para pessoal desenvolvedora JR", requiredMode = Schema.RequiredMode.REQUIRED)
    private String description;

    @Schema(example = "Plano de saúde, GYMPass, Vale Alimentação", requiredMode = Schema.RequiredMode.REQUIRED)
    private String benefits;

    @Schema(example = "JUNIOR", requiredMode = Schema.RequiredMode.REQUIRED)
    private String level;
}
