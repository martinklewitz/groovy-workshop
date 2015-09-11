package info.klewitz.groovy.learning;

import org.junit.Test;

public class CompileStaticClassTest {

  @Test
  public void compileStaticCompare() throws Exception {
    CompileStaticClass aClass = new CompileStaticClass();
    System.out.println(aClass.compare());
  }

  @Test
  public void compileDynamicCompare() throws Exception {
    CompileDynamicClass aClass = new CompileDynamicClass();
    System.out.println(aClass.compare());
  }

  @Test
  public void compileStaticMutliply() throws Exception {
    CompileDynamicClass aClass = new CompileDynamicClass();
    System.out.println(aClass.multiply());
  }
  @Test
  public void compileDynamicMultiply() throws Exception {
    CompileDynamicClass aClass = new CompileDynamicClass();
    System.out.println(aClass.multiply());
  }

}