package forum.hub.api.domain.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Entity(name = "Topico")
@Table(name = "topicos")
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private String autor;
    private String curso;
    private LocalDate data;
    private Boolean estadoTopico;

    public Topico() {
    }

    public Topico(DadosCadastroTopico dados){
        this.estadoTopico = true;
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.autor = dados.autor();
        this.curso = dados.curso();
        this.data = LocalDate.now();
    }

    public void atualizar(@Valid DadosAtualizacaoTopico dados){
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }
        if (dados.autor() != null) {
            this.autor = dados.autor();
        }
        if (dados.curso() != null) {
            this.curso = dados.curso();
        }
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public LocalDate getData() {
        return data;
    }

    public Boolean getEstadoTopico() {
        return estadoTopico;
    }
}
