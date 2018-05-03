package metodos;

public class Conta {
    private static int totalContas;
    private int numero;
    private String nome;
    
    public Conta ( ){
          Conta.totalContas++;
          this.numero = totalContas;
    }
    public static int getTotalContas (){
          return Conta.totalContas;
    }
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Conta [numero = " + numero + ", nome = " + nome + "]";
	}
    
    
}
