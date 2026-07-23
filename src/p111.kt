fun main() {

    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), 2, 3)

    val secondMatrix = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), 3, 2)

    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), 3, 2)

    println("************** ADDITION **************")
    println("Matrix 1 (3 x 2):")
    println(secondMatrix1)

    println("Matrix 2 (3 x 2):")
    println(secondMatrix)

    val thirdMatrix = secondMatrix1 + secondMatrix

    println("Addition Result (3 x 2):")
    println(thirdMatrix)

    println("************** SUBTRACTION **************")
    println("Matrix 1 (3 x 2):")
    println(secondMatrix1)

    println("Matrix 2 (3 x 2):")
    println(secondMatrix)

    val subtractMatrix = secondMatrix1 - secondMatrix

    println("Subtraction Result (3 x 2):")
    println(subtractMatrix)

    println("************** MULTIPLICATION **************")
    println("Matrix 1 (2 x 3):")
    println(firstMatrix)

    println("Matrix 2 (3 x 2):")
    println(secondMatrix)

    val multiplication = firstMatrix * secondMatrix

    println("Multiplication Result (2 x 2):")
    println(multiplication)
}

class Matrix(
    var matrix: Array<IntArray>,
    var rows: Int,
    var cols: Int
) {

    operator fun plus(m: Matrix): Matrix {

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = matrix[i][j] + m.matrix[i][j]
            }
        }

        return Matrix(result, rows, cols)
    }

    operator fun minus(m: Matrix): Matrix {

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = matrix[i][j] - m.matrix[i][j]
            }
        }

        return Matrix(result, rows, cols)
    }

    operator fun times(m: Matrix): Matrix {

        val result = Array(rows) { IntArray(m.cols) }

        for (i in 0 until rows) {
            for (j in 0 until m.cols) {
                for (k in 0 until cols) {
                    result[i][j] += matrix[i][k] * m.matrix[k][j]
                }
            }
        }

        return Matrix(result, rows, m.cols)
    }

    override fun toString(): String {

        var output = "\n"

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                output += matrix[i][j].toString() + "\t"
            }
            output += "\n"
        }

        return output
    }
}