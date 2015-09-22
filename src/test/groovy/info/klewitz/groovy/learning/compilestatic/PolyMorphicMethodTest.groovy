package info.klewitz.groovy.learning.compilestatic

import info.klewitz.groovy.learning.compilestatic.PolyMorphicMethod;
import org.junit.Test

//@CompileStatic
public class PolyMorphicMethodTest {

  @Test
  public void testName() throws Exception {
    new PolyMorphicMethod().accept(
        "test",
        "${'b'}",
        1,
        true,
        ["one", "two", 2] as Object[],
        null
    )
  }

  @Test
  public void nullSafe() throws Exception {
    Number number = null //new Double("1")
    new PolyMorphicMethod().accept(
        number
    )
  }
}