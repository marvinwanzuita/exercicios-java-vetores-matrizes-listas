package JavaCompleto.Exercicios._09_Listas;

public class _09_Empregado {

  private Integer id;
  private String nome;
  private Double salario;

  public _09_Empregado(Integer id, String nome, Double salario) {
    this.id = id;
    this.nome = nome;
    this.salario = salario;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }

  public void aumentarSalario(double porcentagem){
    salario += (salario * (porcentagem / 100));
  }

  @Override
  public String toString() {
    return id + ", " + nome + ", " + salario;
  }
}
