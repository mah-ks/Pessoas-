public class Pessoa{

 private String nome;
 private int idade;
 private String casado;
 private String filhos;
  private String voluntariado;
   private String alunoProfessor;

 Pessoa(String nome,int idade,String casado, String filhos,String voluntariado,String alunoProfessor){
 this.nome = nome;
 this.idade = idade;
 this.casado = casado;
 this.filhos = filhos;
 this.voluntariado = voluntariado; 
 this.alunoProfessor = alunoProfessor;
 

}

   public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.casado = "";
        this.filhos = "";
        this.voluntariado = "";
    }


public String getNome(){
    return nome;
}

public int getIdade(){
    return idade;
}

public String getCasado(){
return casado;

}


public String getFilhos(){
    return filhos;
}

public String getVoluntariado(){
    return voluntariado;
}

public String getAlunoProfessor(){
    return alunoProfessor;
}


    //  SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    public void setFilhos(String filhos) {
        this.filhos = filhos;
    }

    public void setVoluntariado(String voluntariado) {
        this.voluntariado = voluntariado;
    }

    public void setAlunoProfessor(String alunoProfessor) {
        this.alunoProfessor = alunoProfessor;
    }



public void exibirInformacoes() {
        System.out.println("\nInformações pessoais:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Casado: " + getCasado());
        System.out.println("Filhos: " + getFilhos());
        System.out.println("Voluntariado: " + getVoluntariado());
        System.out.println("Aluno ou Professor : "+getAlunoProfessor());

    }



}























