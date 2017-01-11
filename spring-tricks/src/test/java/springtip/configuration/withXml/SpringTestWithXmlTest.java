package springtip.configuration.withXml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// SpringTestWithXmlTest-context.xml is mapped automatically
@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestWithXmlTest {

    @Autowired
    private String stringFromXml;

    @Test
    public void testBeanFromXml() {
        System.out.println(stringFromXml);
    }
}
