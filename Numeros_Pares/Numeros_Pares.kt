import java.util.Scanner

fun pares(num : Int) : Boolean {
	return (num % 2 == 0)
}

fun keyboard() : Int{
	val teclado = Scanner(System.`in`)
	println("!Introduce un numero por teclado!: ")
	val numero: Int = teclado.nextInt()
	return numero

}

fun main(){
		val numero: Int = keyboard()

		if (pares(numero) == true) {
			println("El numero $numero es par")
		} else {
			println("El numero $numero es impar")
		}
}
