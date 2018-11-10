import breeze.linalg.DenseMatrix

object BreezeExample extends App{

  val dml = DenseMatrix((1.0,2.0),(3.0,4.0))

  val dmlTranspose = dml.t

  println(s"${dml} transposed is  ${dmlTranspose} ")

  val dml2 = DenseMatrix((5.0,6.0),(7.0,8.0))

  val matrixProduct = dml*dml2

  println(s"The product of  ${dml} and ${dml2} is ${matrixProduct}")

  val matrixElSum = dml:+dml2

  println(s"The element wise sum of ${dml} and ${dml2} is ${matrixElSum}")
}
