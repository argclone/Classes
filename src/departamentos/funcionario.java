package departamentos;

public abstract class funcionario {
	private String bonificação;
	private String bairro;
	private long cep;
	private String endereco;
	
	public String getBonificação() {
		return bonificação;
	}
	public void setBonificação(String bonificação) {
		this.bonificação = bonificação;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
