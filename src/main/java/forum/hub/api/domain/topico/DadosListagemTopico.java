package forum.hub.api.domain.topico;

import java.time.LocalDate;

public record DadosListagemTopico(Long id, String titulo, String mensagem, LocalDate data, Boolean status, String autor, String curso) {
    public DadosListagemTopico(Topico dados){
        this(dados.getId(), dados.getTitulo(), dados.getMensagem(), dados.getData(), dados.getEstadoTopico(), dados.getAutor(), dados.getCurso());
    }
}
