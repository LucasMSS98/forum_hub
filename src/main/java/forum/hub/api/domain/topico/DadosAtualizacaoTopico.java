package forum.hub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoTopico(@NotBlank
                                     String titulo,
                                     @NotBlank
                                     String mensagem,
                                     @NotBlank
                                     String autor,
                                     @NotBlank
                                     String curso) {
}
