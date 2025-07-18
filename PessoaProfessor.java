
public class PessoaProfessor extends Pessoas{

private double salario;
private String disciplina;
private double registroDeProfessor;



PessoaProfessor(){

}

PessoaProfessor(String nome,
            int idade,
            boolean casado,
            double salario,
             boolean filhos,
              double salario,
             double registroDeProfessor,
            String  disciplina  ){

 super ( nome, idade, casado,  filhos  )  ;            
 this.salario = salario;
 this.matrícula = registroDeProfessor;
 this.disciplina = disciplina; 

}

public int getAulas(){
    return aulas;
}

public double getMatrícula(){
    return matrícula;
}

public double getNotaFinal(){
return notaFinal;

}


public String getCurso(){
    return curso;
}

}