package br.com.mateusdrumond.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo deve não deve conter espaços")
    private String username;

    @Email(message = "O campo deve conter um email válido!")
    private String email;

    @Length(min = 10, max = 100, message = "A senha deve conter no mínimo 10 caracteres!")
    private String password;
    private String description;
    private String curriculum;
}
