package net.rodor.holaspringbatch.itemreader;

import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.core.io.ResourceLoader;

public class RodorMultiReader extends MultiResourceItemReader<Report>  { 

	private ResourceLoader resourceLoader; 
	
	public RodorMultiReader() {
		super();
		System.out.println("Creando RodorMultiReader");
		
		
	}

	
	 
}
