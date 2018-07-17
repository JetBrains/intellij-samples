import groovy.transform.NamedParam
import groovy.transform.NamedVariant
import org.junit.jupiter.api.Test

class NamedParamsTest {

    @NamedVariant
    String fullName(String lastName, @NamedParam String firstName) {
        "$firstName $lastName"
    }

    @Test
    void testNamedParams() {
        println fullName('Smith', firstName: 'Ash')
    }
}

