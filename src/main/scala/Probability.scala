case class Probability(prob: Float) {

  def combinedWith(that: Probability): Probability = Probability(this.prob * that.prob)

  def inverseOf(): Probability = Probability(1 - this.prob)

  def either(that: Probability) = Probability((this.prob + that.prob) - (this.prob * that.prob))

}


