package dalvakarol;

public class Cadastro {
	private String nomeCompleto;
	private int cpf;
    private String endereco;
    private String email;
    private String numeroTelefone;
   
    public Cadastro(String nomeCompleto, int cpf, String endereco, String email,  String numeroTelefone) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
    }
    
    public String getNomeCompleto() {
		return nomeCompleto;
		
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
}
