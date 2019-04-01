package net.rodor.holaspringbatch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskletF implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution step, ChunkContext chunk) throws Exception {
		System.out.println("Ejecutando TaskletF");
		
		// le hacemos tardar un rato para ver que hasta que no se finalizan las tareas E y F el proceso no ejecuta la G.
		for(int i=0;i<100000;i++){
			// no hago nada.
		}
		
		System.out.println("Acabando TaskletF");
		return RepeatStatus.FINISHED;
	}

}