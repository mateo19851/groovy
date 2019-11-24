package org.bar

class Zot implements Serializable {
  def steps
  Zot(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
  }
}