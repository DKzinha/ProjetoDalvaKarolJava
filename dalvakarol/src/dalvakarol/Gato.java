package dalvakarol;

public class Gato {
	  private int idade;
	    private double peso;
	    private String raca;
	    private String descricao;

	    public Gato(int idade, double peso, String raca, String descricao) {
	        this.idade = idade;
	        this.peso = peso;
	        this.raca = raca;
	        this.descricao = descricao;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public String getRaca() {
	        return raca;
	    }

	    public String getDescricao() {
	        return descricao;
	    }
}