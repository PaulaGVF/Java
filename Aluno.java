package br.org.lasalle.semana3;

import java.util.ArrayList;

public class Aluno {
	
	private int matricula;
	private String nome;
	private String curso;
	
	public ArrayList<Disciplina> disciplinas;
	
	//criar um construtor para aluno
	public Aluno(){
		this.curso = "Direito";
		this.disciplinas = new ArrayList<>();
	}
	
	public void setMatricula(int mat)
	{
		this.matricula = mat;
	}
	public int getMatricula()
	{
		return this.matricula;
	}
	
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return this.nome;
	}
	
	
	public void setCurso(String curso)
	{
		if (curso.equalsIgnoreCase("SI"))
			this.curso = "Sistemas de Informação";
		else
			this.curso = curso;
	
	}
	public String getCurso()
	{
		return this.curso;
	}

	public void mostrarLog()
	{
		System.out.println("Matricula = "+ this.matricula);
		System.out.println("Nome = "+ this.nome);
		System.out.println("Curso = "+ this.curso);
		System.out.println("Disciplina 1= "+ this.disciplinas.get(0));
		System.out.println("Disciplina 2 = "+ this.disciplinas.get(1));


	}
	
	
}
