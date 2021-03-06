package net.rodor.holaspringbatch.tasklet;

import java.util.Map;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskletB implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution step, ChunkContext chunk) throws Exception {
		System.out.println("Ejecutando TaskletB");
		
		chunk.getStepContext().getStepExecution().getExecutionContext().put("whereToGo", "GO_D");
		
		return RepeatStatus.FINISHED;
	}

}
