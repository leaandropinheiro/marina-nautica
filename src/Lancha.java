public class Lancha {
    private long id;
    private String nome;

    public Lancha(){}

    public Lancha(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Lancha{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
