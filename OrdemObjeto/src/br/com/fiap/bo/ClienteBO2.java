package br.com.fiap.bo;


import br.com.fiap.dao.ClienteDAO;

public class ClienteBO2 {
	public static String novoCliente(String n, int num, int q)throws Exception{
		if (q<1 || q>5){
			return "Qtde de estrelas inv�lida";
		}
		if(n.length()>50){
			return "Nome inv�lido!";
		}
		if(num<0){
			return "N�mero inv�lido!";
		}
		ClienteDAO dao = new ClienteDAO();
		//Cliente objCliente = new Cliente(n, num, q);
		String msg = null; 
		//msg=dao.inserir(objCliente);
		dao.fechar();
		return msg;
	}
}






