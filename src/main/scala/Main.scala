object Main {
  def main(args: Array[String]): Unit = {
    println(normalDistribution(2, 3, 4))
  }

  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    val a = 1 / (sigma * Math.sqrt(2 * Math.PI))
    val b = Math.pow(Math.E, -(Math.pow(x-mu, 2) / Math.pow(2*sigma, 2)))
    a * b
  }

  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    // your code here
    this.hashCode()
  }

}
