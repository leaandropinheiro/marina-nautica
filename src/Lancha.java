public class Lancha {
    private String motor;

    private String tipo;

    private long id;
    private String nome;

    public Lancha(){}

    public Lancha(long id, String nome, String motor, String tipo) {
        this.id = id;
        this.nome = nome;
        this.motor = motor;
        this.tipo = tipo;
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
                ", motor='" + motor +
                ", tipo='" + tipo +
                '}';
    }

    public static void setMotor(String motor) {
    }

    public void setTipo(String tipo) {
    }
}
