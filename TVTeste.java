package aula2;

public class TVTeste extends TV{
  public static void main(String[] args) {
    TV S1 = new TV();
    S1.Cor = "Preta";
    S1.Tamanho = 55;
    S1.Marca = "Sony";
    S1.Status = 1;
    
    S1.ligar();
    S1.desligar();
  }
}
