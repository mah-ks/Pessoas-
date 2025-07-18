public class PessoaAluno extends Pessoas{

private int aulas; , 
private double matrícula;
private double notaFinal;
private String curso;


PessoaAluno(){

}

PessoaAluno(String nome,
            int idade,
            boolean casado,
             boolean filhos,
              int Aulas,
              double matrícula,
             double notaFinal,
            String curso  ){

 super ( nome, idade, casado,  filhos  )  ;            
 this.Aulas = Aulas;
 this.matrícula = matrícula;
 this.notaFinal = notaFinal;
 this.curso = curso;
 

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