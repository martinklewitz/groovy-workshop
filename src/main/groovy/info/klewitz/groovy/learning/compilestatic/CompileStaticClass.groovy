package info.klewitz.groovy.learning.compilestatic

import groovy.transform.CompileStatic

//@CompileStatic
class CompileStaticClass {

  def number = 1

  public def calc(){
    number = 2.0

    return number
  }

  public String multiply(){
    return calc() * calc()
  }

  public def compare(){
    return calc()<calc()
  }

}
