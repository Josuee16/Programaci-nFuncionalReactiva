//def f(x: Int): Double = Math.pow(x, 2) + 1
//f(2)
//f(8)
(1 to 10).product
100 + (1 to 10).product
100 + (1 to 10).product + 100
3628800 == (1 to 10).product

(1 to 20).sum

val fac10 = (1 to 10).product
print(s"El factorial de 10 es $fac10")
//def g(n :Int) = (1 to n).product
//g(6)
def h(n: Int) = (1 to n).sum * Math.pow(n,n-1)-1
h(9)
def i (n : Int)= Math.pow((1 to n).sum,2)-2*n
i(4)
def f (x: Double): Double = 3*x + 1
def g (x: Double): Double = Math.pow(x,2).toDouble
f(g(2))
g(f(2))
def j (x:Int) = x+1
def k (x:Int) = Math.sin(x)
k(j(1))
