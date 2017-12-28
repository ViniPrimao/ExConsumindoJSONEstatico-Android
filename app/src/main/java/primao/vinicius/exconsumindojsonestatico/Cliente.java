package primao.vinicius.exconsumindojsonestatico;

/**
 * Created by QI on 21/12/2017.
 */

public class Cliente {

    private int id;
    private String nome;
    private String RG;
    private String email;

    public Cliente() {
    }

    public Cliente(int id, String nome, String RG, String email) {
        this.id = id;
        this.nome = nome;
        this.RG = RG;
        this.email = email;
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

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", RG='" + RG + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
