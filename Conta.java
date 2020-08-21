public class Conta{
  //atributos
  private String titular;
	private double saldo;
	private int numero;

  //metodos
  //construtor
  public Conta(String titular, double saldo, int numero){
    this.titular = titular;
    this.saldo = saldo;
    this.numero = numero;
  }



  public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}



}