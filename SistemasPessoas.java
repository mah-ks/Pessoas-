import java.util.Scanner;

public class SistemasPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nCadastro da pessoa " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("É casado? : ");
            String casado = scanner.nextLine();

            System.out.print("Tem filhos? : ");
            String filhos = scanner.nextLine();
            
            System.out.print("Voluntariado: ");
            String voluntariado = scanner.nextLine();

            System.out.print("É aluno ou professor? ");
            String alunoProfessor = scanner.nextLine().toLowerCase();

            if (alunoProfessor.equals("aluno")) {
                System.out.print("Curso: ");
                String curso = scanner.nextLine();

                System.out.print("Nota final: ");
                double notaFinal = scanner.nextDouble();
                scanner.nextLine();

                 System.out.print("Matricula : ");
                double matricula = scanner.nextDouble();
                scanner.nextLine();

                 System.out.print("Numero de aulas: ");
                int aulas = scanner.nextInt();
                scanner.nextLine();

                Aluno aluno = new Aluno();
                aluno.setNome(nome);
                aluno.setIdade(idade);
                aluno.setCasado(casado);
                aluno.setFilhos(filhos);
                aluno.setVoluntariado(voluntariado);
                aluno.setAlunoProfessor(alunoProfessor);
                aluno.setCurso(curso);
                aluno.setNotaFinal(notaFinal);
                aluno.setMatricula(matricula);
                aluno.setAulas(aulas);

                pessoas[i] = aluno;
            } else if (alunoProfessor.equals("professor")) {
                System.out.print("Disciplina: ");
                String disciplina = scanner.nextLine();

                System.out.print("Salário: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                Professor professor = new Professor();
                professor.setNome(nome);
                professor.setIdade(idade);
                professor.setCasado(casado);
                professor.setFilhos(filhos);
                professor.setVoluntariado(voluntariado);
                professor.setAlunoProfessor(alunoProfessor);
                professor.setDisciplina(disciplina);
                professor.setSalario(salario);

                pessoas[i] = professor;
            } else {
                System.out.println("Tipo inválido. Salvando como Pessoa comum.");
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(nome);
                pessoa.setIdade(idade);
                pessoa.setCasado(casado);
                pessoa.setFilhos(filhos);
                pessoa.setVoluntariado(voluntariado);

                pessoas[i] = pessoa;
            }
        }

        System.out.println("\n--- INFORMAÇÕES CADASTRADAS ---");
        for (Pessoa pessoa : pessoas) {
            System.out.println();
            pessoa.exibirInformacoes();
        }

        scanner.close();
    }
}
