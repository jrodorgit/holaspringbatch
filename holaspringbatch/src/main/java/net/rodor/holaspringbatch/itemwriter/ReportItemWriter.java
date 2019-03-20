package net.rodor.holaspringbatch.itemwriter;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import net.rodor.holaspringbatch.itemreader.Report;

public class ReportItemWriter implements ItemWriter<Report> {

	@Override
	public void write(List<? extends Report> items) throws Exception {
		System.out.println("Excribiendo numero de elementos...." + items.size());
		/*for (Report item : items) {
			System.out.println(item.toString());
		}*/

	}

}
