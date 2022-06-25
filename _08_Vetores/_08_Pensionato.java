package JavaCompleto.Exercicios._08_Vetores;

public class _08_Pensionato {

  private String nome;
  private String email;
  private int quartoEscolhido;

  public _08_Pensionato(String nome, String email, int quartoEscolhido) {
    this.nome = nome;
    this.email = email;
    this.quartoEscolhido = quartoEscolhido;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getQuartoEscolhido() {
    return quartoEscolhido;
  }

  public void setQuartoEscolhido(int quartoEscolhido) {
    this.quartoEscolhido = quartoEscolhido;
  }

  @Override
  public String toString() {
    return quartoEscolhido + ": " + nome + ", " + email;
  }
}
