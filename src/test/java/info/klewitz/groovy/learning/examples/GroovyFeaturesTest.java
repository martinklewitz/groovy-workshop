package info.klewitz.groovy.learning.examples;

import org.junit.Test;

public class GroovyFeaturesTest {

  @Test
  public void testDynamic() throws Exception {
    GroovyFeatures groovy = new GroovyFeatures();

    groovy.checkOperators();
  }

  @Test
  public void testStatic() throws Exception {
    GroovyFeatures groovy = new GroovyFeatures();

    groovy.checkIntegerStatic();
  }

  @Test
  public void testStaticDef() throws Exception {
    GroovyFeatures groovy = new GroovyFeatures();

    groovy.checkIntStatic();
  }
}