package info.klewitz.groovy.learning.examples

import groovy.transform.CompileStatic


class GroovyFeatures {

  public House buildHouse(){
    House house = new House()
    house.window = new Window()


    return house
  }


  public void checkOperators(){

    def house = buildHouse()

    def intStrength = house?.window?.glass?.intStrength
    println "strength: " + intStrength
    def integerStrength = house?.window?.glass?.integerStrength
    println "integerStrength: " + integerStrength

  }

  @CompileStatic
  public void checkIntegerStatic(){

    def house = buildHouse()
    house.window.glass = new Glass()
    house.window.glass.integerStrength = new Integer(2)

    Integer integerStrength = house?.window?.glass?.integerStrength
    println "integerStrength: " + integerStrength

  }

  @CompileStatic
  public void checkIntStatic(){

    def house = buildHouse()
    house.window.glass = new Glass()
    house.window.glass.intStrength = 3

    int integerStrength = house?.window?.glass?.intStrength
    println "integerStrength: " + integerStrength

  }

}
