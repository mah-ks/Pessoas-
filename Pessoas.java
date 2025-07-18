public class Pessoas{

 private String nome;
 private int idade;
 private boolean casado;
 private boolean filhos;

 Pessoas(String nome,int idade,boolean casado,double salario, boolean filhos){
 this.nome = nome;
 this.idade = idade;
 this.casado = casado;
 this.filhos = filhos;
 

}

Pessoas(){
this.nome = " ";
this.idade = 0;
this.casado =true ;
this.filhos = true;

}

public String getNome(){
    return nome;
}

public int getIdade(){
    return idade;
}

public boolean getCasado(){
return casado;

}


public boolean getFilhos(){
    return filhos;
}



































}