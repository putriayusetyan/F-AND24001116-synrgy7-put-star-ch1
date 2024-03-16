fun main() {
    val shapes = Shapes()
    println("Piramida bintang:")
    shapes.drawStarPyramid(8)

    println("\nPiramida terbalik bintang:")
    shapes.drawInvertedStarPyramid(8)

    println("\nLayang-layang bintang:")
    shapes.drawDiamond(8)

    println("\nX Bintang:")
    shapes.drawXStar(8)

    println("\nPiramida hollow bintang:")
    shapes.drawHollowStarPyramid(6)
}

class Shapes {
    fun drawStarPyramid(rows: Int) {
        for (i in 1..rows) {
            for (j in 1..(rows - i)) {
                print(" ")
            }
            for (j in 1..(2 * i - 1)) {
                print("\u001B[32m*\u001B[0m")
            }
            println()
        }
    }

    fun drawInvertedStarPyramid(rows: Int) {
        for (i in rows downTo 1) {
            for (j in 1..(rows - i)) {
                print(" ")
            }
            for (j in 1..(2 * i - 1)) {
                print("\u001B[33m*\u001B[0m")
            }
            println()
        }
    }

    fun drawDiamond(rows: Int) {
        for (i in 1..rows) {
            for (j in 1..(rows - i)) {
                print(" ")
            }
            for (j in 1..(2 * i - 1)) {
                print("\u001B[34m*\u001B[0m")
            }
            println()
        }
        for (i in rows - 1 downTo 1) {
            for (j in 1..(rows - i)) {
                print(" ")
            }
            for (j in 1..(2 * i - 1)) {
                print("\u001B[34m*\u001B[0m")
            }
            println()
        }
    }

    fun drawXStar(rows: Int) {
        for (i in 1..rows) {
            for (j in 1..rows) {
                if (j == i || j == rows - i + 1) {
                    print("\u001B[35m*\u001B[0m")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }

    fun drawHollowStarPyramid(rows: Int) {
        for (i in 1..rows) {
            for (j in 1..(rows - i)) {
                print(" ")
            }
            for (j in 1..(2 * i - 1)) {
                if (j == 1 || j == 2 * i - 1 || i == rows) {
                    print("\u001B[31m*\u001B[0m")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}
