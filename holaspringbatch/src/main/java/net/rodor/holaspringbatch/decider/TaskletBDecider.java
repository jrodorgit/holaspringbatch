package net.rodor.holaspringbatch.decider;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;
import org.springframework.batch.item.ExecutionContext;

public class TaskletBDecider implements JobExecutionDecider {

	@Override
	public FlowExecutionStatus decide(JobExecution job, StepExecution step) {
		
		// dependiendo de algo que salga de B decidir el siguiente paso.
		ExecutionContext excCtx = job.getExecutionContext();
		String camino = (String) excCtx.get("whereToGo");
		
		
		if( "GO_C".compareToIgnoreCase(camino) == 0){
			return new FlowExecutionStatus("GO_C");
		}else{
			return new FlowExecutionStatus("GO_D");
		}
		
	}

}
