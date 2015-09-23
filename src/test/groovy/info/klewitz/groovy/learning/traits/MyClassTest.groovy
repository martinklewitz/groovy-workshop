package info.klewitz.groovy.learning.traits

import org.junit.Test

class MyClassTest {

  @Test
  public void sayHello() throws Exception {
    MyClass myClass = new MyClass()
    myClass.sayHello()
  }

  @Test
  public void sayGoodby() throws Exception {
    MyClass myClass = new MyClass()
    myClass.sayGoodby()
  }
}
