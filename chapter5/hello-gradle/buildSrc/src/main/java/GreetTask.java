
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class GreetTask extends DefaultTask {
	
	@TaskAction
	public void greetAction() {
			System.out.println("Hello Gradle Plugin");
	}
	
}	