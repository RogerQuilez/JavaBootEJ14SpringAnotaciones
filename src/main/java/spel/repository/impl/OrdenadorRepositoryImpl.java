package spel.repository.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.springframework.stereotype.Repository;

import spel.entity.Computer;
import spel.repository.OrdenadorRepository;

@Repository
public class OrdenadorRepositoryImpl implements OrdenadorRepository{

	@Override
	public boolean guardarOrdenador(Computer ordenador) {
		
		String fichero = "Ordenador.txt";
		
		try(FileOutputStream fos = new FileOutputStream(new File(fichero));
				ObjectOutputStream salida = new ObjectOutputStream(fos);) {

			salida.writeObject(ordenador.toString());
			
			return true;
			
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
		
	}

}
