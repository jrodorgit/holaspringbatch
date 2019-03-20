package net.rodor.holaspringbatch.itemprocessor;

import org.springframework.batch.item.ItemProcessor;

import net.rodor.holaspringbatch.itemreader.Report;

public class ReportItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		System.out.println("Processing..." + item);
		return item;
	}

}
