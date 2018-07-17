import java.util.stream.Stream

import static java.util.stream.Collectors.toList

class Groovy3Test extends GroovyTestCase {
    void testJavaDoWhile() {
        def count = 5
        do {
            println "count = $count"
        } while (count-- > 0)
    }

    void testMethodReferences() {
        // class::staticMethod
        assert ['1', '2', '3'] == Stream.of(1, 2, 3)
                                        .map(String::valueOf)
                                        .collect(toList())

        // class::instanceMethod
        assert [1, 2, 3] == ['a', 'bb', 'ccc'].stream()
                                              .map(String::length)
                                              .collect(toList())
    }

    void testNotInAndNotInstanceOf() {
        assert 45 !instanceof Date

        assert 4 !in [1, 3, 5, 7]
    }

    void testSafeIndexing() {
        String[] array = null
        assert null == array ?[1]     // return null for all index values
        array ?[1] = 'c'              // quietly ignore attempt to set value
        assert array == null
    }

}
