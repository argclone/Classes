package departamentos;

public abstract class funcionario {
	private String bonifica��o;
	private String bairro;
	private long cep;
	private String endereco;
	
	public String getBonifica��o() {
		return bonifica��o;
	}
	public void setBonifica��o(String bonifica��o) {
		this.bonifica��o = bonifica��o;
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
