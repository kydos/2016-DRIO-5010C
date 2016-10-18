package object prelude {
  def randomIntList(min: Int)(max: Int)(n: Int) = (1 to n).toList.map(_ => (min + (Math.random*(max - min))).toInt)
}
