
public class Cliente {
	private String nome ;
	private String Profissao;
	private String cpf;
	
	//getters e setters this.nome...
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	//getters e setter this.profissao
	public void setProfissao(String profissao) {
		this.Profissao = profissao;
	}
	public String getProfissao() {
		return this.Profissao;
	}
	
	
	//getters e setters this.cpf
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
