
import java.time.LocalDateTime;

public class Tarefas {

    private int id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime prazo;
    private boolean concluida;

    public Tarefas() {
    }

    public Tarefas(boolean concluida, LocalDateTime dataCriacao, String descricao, int id, LocalDateTime prazo, String titulo) {
        this.concluida = concluida;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
        this.id = id;
        this.prazo = prazo;
        this.titulo = titulo;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDateTime prazo) {
        this.prazo = prazo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }


}