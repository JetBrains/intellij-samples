import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.expr.ClassExpression
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.macro.transform.MacroClass

def classNameMacro = macro(true) { getClass().name }


def date = new ConstantExpression(new Date().toString())
def version = new ConstantExpression(GroovySystem.version)
def body = macro(true) {
    """\
    Name: ${getClass().name}
    Compiled: ${$v { date }}
    Using Groovy version: ${$v { version }}""".stripIndent()
}



ClassNode buildInfoClass(ClassNode reference) {
    def date = new ConstantExpression(new Date().toString())
    def vers = new ConstantExpression(GroovySystem.version)
    def name = new ClassExpression(reference)
    ClassNode infoClass = new MacroClass() {
        class DummyName {
            java.lang.String getName() { $v{ name }.name }
            java.lang.String getVersion() { $v{ vers } }
            java.lang.String getCompiled() { $v{ date } }
        }
    }
    infoClass.name = reference.name + 'Info'
    return infoClass
}

//@Info
//class Foo {
//
//}