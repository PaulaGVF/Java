package aula2;
public class TV{
String Cor;
int Tamanho;
String Marca;
int Status;
}

void ligar(){
if(Status == 1)
{
  Status = 2;
  System.out.println("Ligando");
}
else 
{
  Status= 2;
  System.out.println("Já estou ligada");
  }
 }

void desligar(){
if(Status == 2)
{
  Status = 1;
  System.out.println("Desligando");
}
else
{
  Status= 1;
}}
