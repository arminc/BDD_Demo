package nl.iteye.jbehave;

import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.LoadFromURL;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: armin
 * Date: 9/23/12
 * Time: 11:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class RegisterHours extends JUnitStory {

    @Override
     public Configuration configuration()
     {
        return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath())
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.HTML_TEMPLATE));
     }

     public InjectableStepsFactory stepsFactory()
     {
         return new InstanceStepsFactory(configuration(), new HoursRegistrationSteps());
     }
}
