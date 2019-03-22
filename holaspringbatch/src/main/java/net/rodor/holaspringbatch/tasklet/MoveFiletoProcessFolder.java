package net.rodor.holaspringbatch.tasklet;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MoveFiletoProcessFolder implements Tasklet {

	private String inputPath;
	private String processPath;
	
	@Override
	public RepeatStatus execute(StepContribution step, ChunkContext chunk) throws Exception {
		System.out.println("Buscando ficheros en carpeta de input para moverlo a procesar:"+Files.list(Paths.get(inputPath)).count());
		
		if(Files.list(Paths.get(inputPath)).count() <= 0){
			// si no encuentro ficheros a procesar acabamos.
			chunk.getStepContext().getStepExecution().upgradeStatus(BatchStatus.STOPPED);
			return RepeatStatus.FINISHED;
		}
		
		// si hay movemos ficheros para comenzar seguir con el proceso de los mismos
		Files.list(Paths.get(inputPath)).forEach(file -> moveFile(file));
		
		
		return RepeatStatus.FINISHED;
	}
	
	private void moveFile(Path obj) {
		System.out.println("--->"+obj.getFileName());
		/***/
		try {
			Files.move((Path)obj,Paths.get(processPath+"/"+obj.getFileName()),StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/***/
	}
	public String getInputPath() {
		return inputPath;
	}
	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}


	public String getProcessPath() {
		return processPath;
	}


	public void setProcessPath(String processPath) {
		this.processPath = processPath;
	}

	/***
	 File dir = directory.getFile();
	Assert.state(dir.isDirectory());

	File[] files = dir.listFiles();
	for (int i = 0; i < files.length; i++) {
	  boolean deleted = files[i].delete();
	  if (!deleted) {
		throw new UnexpectedJobExecutionException(
                       "Could not delete file " + files[i].getPath());
	  } else {
	        System.out.println(files[i].getPath() + " is deleted!");
	  }
	}
	return RepeatStatus.FINISHED;
	 */
}
