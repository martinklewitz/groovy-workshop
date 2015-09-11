package info.klewitz.groovy.learning

import groovy.transform.CompileStatic;
import org.junit.Test;

import static org.junit.Assert.*;

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