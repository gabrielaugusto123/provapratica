package provaQ1;
import javax.swing.JOptionPane;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		 int i, cnt=0;
		 double mediaAno=0;
	     ArrayList<String> rede = new ArrayList();

	   
	     do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Cadastrar Carro \n2-Listagem Geral\n3-Mostrar Resultados \n4-SAIR ");
	     i = Integer.parseInt(menu);
	     cnt++;
	     switch (i)
	        {
	             case 1:
	                String marca= JOptionPane.showInputDialog("Digite o Marca: ");
	                
	                String Modelo= JOptionPane.showInputDialog("Digite o Modelo do carro: ");
	                Double Ano = Double.parseDouble(JOptionPane.showInputDialog("Digite o Ano do carro: "));
	                mediaAno= Ano/cnt;
	                Double Valor= Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do carro: "));
	                
	                /*if(Valor>=50000);
	                System.out.println();
	                */
	                rede.add(marca+";"+Modelo+";"+Ano+";"+Valor);
	                JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso");
	                
	                 break;
	             case 2:
	            	
	            	 System.out.println(rede.toString());
	                 break;
	             case 3:
	            	 
	            	 
	            	 System.out.println("A média  dos  anos  de  todos  os  veículos cadastrados=  "+mediaAno);
	            	 
	                 break;
	            
	             case 4:
	                 break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
	        }
	     } while (i!=4);
	     
	}

}
