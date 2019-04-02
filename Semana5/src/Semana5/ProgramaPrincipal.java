package Semana5;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75);
		p4.setSetor("Estoque");
		p1.setIdade(21);
		
		p3.receberAumento(2500.75,10);
		p1.fazerAniversario();
		p4.mudarTrabalho();
		p2.cancelarMatr("abc22");
		
	}
}
