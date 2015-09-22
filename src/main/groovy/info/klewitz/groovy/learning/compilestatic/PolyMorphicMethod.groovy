package info.klewitz.groovy.learning.compilestatic

import groovy.transform.CompileStatic

@CompileStatic
class PolyMorphicMethod {

  void accept(String s) { println "String: '$s'" }
  void accept(Number n) { println "Number: $n" }
  void accept(Double n) { println "Double: $n" }
  void accept(Object o) { println "Object: $o" }

  void accept(Object... objects) {
    objects.each {
      accept(it)
    }
  }


}


