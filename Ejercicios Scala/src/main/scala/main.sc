// Ejercicios Scala
import scala.collection.View.Filter


// -- Ejercicio 1: De una lista de numeros, encontrar el segundo mas grande
val listaNumeros = List(1, 2, 3, 3, 8, 10, 11, 15, 8, 3, 4, 6, 7, 9)
println("Ejercicio 1 ------------")

//// ---- Eliminar duplicados y ardenar de forma inversa
val numerosUnicos = listaNumeros.distinct
val numerosOrdenados = numerosUnicos.sorted(Ordering[Int].reverse)

println(s"Original Numbers : $listaNumeros")
println(s"Unique Numbers : $numerosUnicos")
println(s"Reverse Order Numbers: $numerosOrdenados")

//// ---- Encontrar el segundo elemento mas grande
println("El segundo numero mas grande de la lista es: " + numerosOrdenados(1))


//// ---- Full Code:
println("FULL CODE: ------- \n El segundo número más grande de la lista es: " + 
  (if (listaNumeros.length > 1) listaNumeros.sorted(Ordering[Int].reverse).distinct(1) else "none"))

println()
println()

// -- Ejercicio 2 -- De una lista de palabras (o de una frase dividida por espacios), 
// -- encontrar las palabras más largas (más de 6 letras), y devolverlas en una lista en mayúsculas.
val listaPalabras = List("Hola", "bienvenido", "a", "este", "ejercicio", "de", "programación", "en", "Scala")
println("Ejercicio 2 ------------")

//// -- Econtrar las palabras de mas de 6 letras: Filter
val words6letters = listaPalabras.filter(_.length() >= 6)
println(s"Lista de palabras con 6 letras: $words6letters")

val capsWords = words6letters.map(_.toUpperCase())
println(s"Lista de palabras en Mayus: $capsWords")


//// ---- Full Code:
println("FULL CODE: ------- \n Lista de palabras con mas de 6 letras y en mayusculas: " + listaPalabras.filter(_.length() >= 6).map(_.toUpperCase()))

