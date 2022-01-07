class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    val d: Double = a.toDouble();
    var e: Double = b.toDouble();
    var f: Double = c.toDouble();

    init{
        if ((d < 0.0) || (e < 0.0) || (f < 0.0)) {
            throw IllegalArgumentException()
        }
        if((d + e < f) && (e + f < d) && (f + d < e)) {
            throw IllegalArgumentException()
        }
    }

    val isEquilateral: Boolean = (d == e) && (e == f)
    val isIsosceles: Boolean = (d == e) || (e == f) || (f == d)
    val isScalene: Boolean = (d != e) && (e != f) && (f != d)
}
