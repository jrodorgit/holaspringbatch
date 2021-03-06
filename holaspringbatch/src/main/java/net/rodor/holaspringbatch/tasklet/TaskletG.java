package net.rodor.holaspringbatch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskletG implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution step, ChunkContext chunk) throws Exception {
		System.out.println("Ejecutando TaskletG");
		
		return RepeatStatus.FINISHED;
	}

}