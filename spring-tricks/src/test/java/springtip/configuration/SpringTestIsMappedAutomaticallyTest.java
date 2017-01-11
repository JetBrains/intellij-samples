package springtip.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// when Spring facet is configured, this context will be setup automatically
@ContextConfiguration(classes = SpringTestIsMappedAutomaticallyContext.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestIsMappedAutomaticallyTest {

    @Autowired
    private String myStringBean;

    @Test
    public void isMyBeanConfigured() {
        System.out.println(myStringBean);
    }
}
