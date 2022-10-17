package pdev.com.streams.bean;

public class EstadoDTO {

    private int id;
    private String nome;
    private String sigla;

    public EstadoDTO(int id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public static EstadoDTO estadoToEstadoDTO(Estado estado) {
        return new EstadoDTO(estado.getId(), estado.getNome(), estado.getSigla());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "EstadoDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
