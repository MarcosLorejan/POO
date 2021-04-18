import java.util.Scanner;

public class ExClasses  {

	public static void main(String[] args) {
		
			
			Scanner p  = new Scanner (System.in);
		
			
			System.out.println("Nome: ");
		    Aluno.setNome(p.nextLine());
			
			System.out.println("Sexo: ");
			Aluno.setSexo(p.nextLine()); 
			
			System.out.println("Matricula: ");
			Aluno.setMatricula(p.nextLine()); 
			
			System.out.println("Cpf: ");
			Aluno.setSexo(p.nextLine()); 
			
			System.out.println("Data Nascimento: ");
			Aluno.setdataNascimento(p.nextLine());

			
			
			Scanner input= new Scanner (System.in);
			
			
			System.out.println("Codigo: ");
		    Turma.setCodigo(input.nextLine());
			
			System.out.println("Ano: ");
			Turma.setAno(input.nextLine()); 
			
			System.out.println("Semestre: ");
			Turma.setSemestre(input.nextLine()); 
			
			System.out.println("NomeCurso: ");
			Turma.setNomeCurso(input.nextLine()); 
			
			
            Scanner ler= new Scanner (System.in);
			
			
			System.out.println("Registro: ");
		    Professor.setRegistro(input.nextLine());
			
			

            Scanner ler1= new Scanner (System.in);
			
			
			System.out.println("NomeCurso: ");
		    Curso.NomeCurso(ler1.nextLine());
			
		    System.out.println("PeriodoCurso: ");
		    Curso.PeriodoCurso(ler1.nextLine());
			
			
			
           Scanner ler2= new Scanner (System.in);
			
			
			System.out.println("NomeCurso: ");
		   Disciplina.NomeCurso(ler2.nextLine());
			
		    System.out.println("PeriodoCurso: ");
		    Disciplina.PeriodoCurso(ler2.nextLine());
		    
		    System.out.println("Fim do Programa");
		
			

	}
	
	
	

			    } 

		

		
		

	


