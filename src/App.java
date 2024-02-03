import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
		
		System.out.println("As informações solicitadas  foram repassadas de maneira clara,suas duvidas foram esclarecidas?");
		 String pesquisa = sc.nextLine();
		 
		 if(pesquisa.equals("sim")){
			 System.out.println("Sua satisfação é nosso principal objetivo!");
			  
			
		 }else if (pesquisa.equals("não")){
			 System.out.println("Eu entendo,vamos providenciar melhoria em nosso canal de comunicação.");
              sc.nextLine();
		 }else {
			 System.out.println("Por gentileza ajude-nos a melhorar respondendo com Sim ou Não.");
		 
		 }
			 sc.close();
	}
		 }
		
