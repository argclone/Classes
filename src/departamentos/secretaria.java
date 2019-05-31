package departamentos;

public abstract class secretaria {
	private String empregados;
	private String bonificação;

	public String getEmpregados() {
		return empregados;
	}

	public void setEmpregados(String empregados) {
		this.empregados = empregados;
	}

	public String getBonificação() {
		return bonificação;
	}

	public void setBonificação(String bonificação) {
		this.bonificação = bonificação;
	}

}
