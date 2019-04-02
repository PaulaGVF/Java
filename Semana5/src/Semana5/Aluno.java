package Semana5;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String curso;
	
	public String getMatr() {
		return matricula;
	}
	public void setMatr(String matr) {
		this.matricula = matr;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void cancelarMatr(String matricula){
		System.out.println("Cancelando Matricula");
	}

}
