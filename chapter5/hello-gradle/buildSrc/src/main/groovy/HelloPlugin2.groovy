import org.gradle.api.Plugin;
import org.gradle.api.Project;

class HelloPlugin2 implements Plugin<Project> {
	@Override
	void apply(Project project) {
		
		project.task('greet2') << {
			println 'Hello Gradle Plugin2'
		}
		
	}
}