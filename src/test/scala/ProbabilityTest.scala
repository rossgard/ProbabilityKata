import org.scalatest.FunSuite

class ProbabilityTest extends FunSuite {

  test("equals") {
    assert(Probability(0.25F) == Probability(0.25F))
    assert(Probability(0.25F) != Probability(0.3F))
  }

  test("combinedWith") {
    assert(Probability(0.25F) == Probability(0.5F).combinedWith(Probability(0.5F)))
  }

  test("inverseOf") {
    assert(Probability(0.25F) == Probability(0.75F).inverseOf())
  }

  test("Either") {
    print(Probability(0.25F).either(Probability(0.25F)))
    assert(Probability(0.4375F) == Probability(0.25F).either(Probability(0.25F)))
  }
}
