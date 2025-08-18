package br.com.diogow.gestao_vagas.modules.candidate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "candidate")
public class CandidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Schema(example = "Diogo Varaschin", requiredMode = Schema.RequiredMode.REQUIRED, description = "Nome do candidato.")
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "o campo [username] não deve conter espaços")
    @Schema(example = "diogow", requiredMode = Schema.RequiredMode.REQUIRED, description = "Username do candidato.")
    private String username;

    @Email(message = "o campo [email] deve conter um email valido!")
    @Schema(example = "diogow@dev.com.br", requiredMode = Schema.RequiredMode.REQUIRED, description = "Email do candidato.")
    private String email;

    @Length(min = 8, max = 100, message = "a senha deve conter entre (8) e (100) caracteres")
    @Schema(example = "diogow@123", minLength = 8, maxLength = 100, requiredMode = Schema.RequiredMode.REQUIRED, description = "Senha do candidato.")
    private String password;

    @Schema(example = "Desenvolvedor JAVA Jr.", requiredMode = Schema.RequiredMode.REQUIRED, description = "Breve descrisção do candidato.")
    private String description;
    private String curriculum;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
