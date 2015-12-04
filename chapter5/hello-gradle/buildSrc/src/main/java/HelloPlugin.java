
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import java.util.Map;
import java.util.HashMap;

public class HelloPlugin implements Plugin<Project> {
	@Override
	public void	apply(Project project) {
		project.getTasks().create("greet", GreetTask.class);
	}

}
