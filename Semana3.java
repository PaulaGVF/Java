package br.org.lasalle.semana3;
import java.util.Scanner;

public class Semana3 {
	public static void main(String[] args){
		Aluno aluno = new Aluno();
		
		Scanner input = new Scanner(System.in);
		
		 System.out.println("Digite sua matrícula:");
		 	aluno.setMatricula(input.nextInt());
		 System.out.println("Digite seu nome:");
		 	aluno.setNome(input.next());	 
		 System.out.println("Digite a curso:");
		 	aluno.setCurso(input.next());
		 	
		 System.out.println("Digite a disciplina 1:");
		 Disciplina disciplinas = new Disciplina();
		 
		 disciplinas.setDescricao(input.next());
		 disciplinas.setTurno("noite");
		 
		 aluno.disciplinas.add(disciplinas);
		 
		 System.out.println("Digite a disciplina 2:");
		 disciplinas.setDescricao(input.next());
		 disciplinas.setTurno("noite");
		 
		 aluno.disciplinas.add(disciplinas);
		 
		 disciplinas.getDescricao();
		 	aluno.mostrarLog();
}}
