package pdev.com.streams.bean;

public class Estado {

    private int id;
    private String nome;
    private String sigla;
    private String capital;
    private int municipios;

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

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getMunicipios() {
        return municipios;
    }

    public void setMunicipios(int municipios) {
        this.municipios = municipios;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", municipios=" + municipios +
                '}';
    }
}
