package forum.hub.api.topico;

import java.time.LocalDate;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, LocalDate data, Boolean status, String autor, String curso) {
    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData(), topico.getEstadoTopico(), topico.getAutor(), topico.getCurso());
    }
}
