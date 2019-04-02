package Semana5;

public class Funcionario extends Pessoa {
	
	private String setor;
	private boolean trabalhando;
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean mudarTrabalho() {
		System.out.println("Trabalho mudado");
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	
}
