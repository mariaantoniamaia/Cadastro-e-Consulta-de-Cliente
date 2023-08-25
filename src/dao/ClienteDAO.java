package dao;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Cliente;

public class ClienteDAO {
	
	private File arq;
	private FileWriter fw;
	private BufferedWriter bw;

	public ClienteDAO()
	{
		arq=new File("dados.txt");
	}

	public boolean cadastraCliente(Cliente c) {

		
			try {
				fw = new FileWriter(arq, true);
				bw = new BufferedWriter(fw);

				bw.write(c.toString());
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			finally {
				try {
					fw.close();
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			return true;

	}
	
	public boolean consultaCliente(Cliente c)
	{
		boolean resp=false;
		
		try {
			FileReader fr= new FileReader(arq);
			BufferedReader br= new BufferedReader(fr);
			
			String linha=null;
			String[] campos= new String[4];
			
			while((linha=br.readLine())!=null)
			{
				campos=linha.split("#");
				
				if(campos[0].equals(c.getCpf()))
				{
					c.setNome(campos[1]);
					c.setEndereco(campos[2]);
					c.setProfissao(campos[3]);
					
					resp=true;
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return resp;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return resp;
		}
		
		return resp;
		
	}

}
