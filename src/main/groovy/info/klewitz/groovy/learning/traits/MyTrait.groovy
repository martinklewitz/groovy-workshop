package info.klewitz.groovy.learning.traits

public trait MyTrait {

  // https://dict.leo.org/ende/index_de.html#/search=trait&searchLoc=0&resultOrder=basic&multiwordShowSingle=on

  public String name;

  public void sayHello() {
    println 'Hello ' + name + '!'
  }

  public void sayGoodby() {
    println 'Goodby ' + name + '!'
  }

  public void setName(String name) {
    this.name = name;
  }
}
