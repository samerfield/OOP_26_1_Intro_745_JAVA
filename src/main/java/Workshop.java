import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
	// holasssssssssss
	if (a>b && a>c)return a;
	if (b>a && b>c)return b;
	return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
	int[] resultado = new int[limite];
	for(int i=0;i<limite;i++){
	resultado[i] = numero * (i+1);

	}



        return resultado;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.
	// aaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	if(n<0){
		throw new IllegalArgumentException("el numero no debe ser negativo");
	}

	int resultado = 1;
	for(int i=n;i>0;i--){
		resultado = resultado * i;
	}
        return resultado;
    }
	//metodo que devuelve un numero si es primo
	public static boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
	int contador = 0;
	for(int i=0;i<=numero;i++){
		if(numero%(i+1) == 0){
			contador++;
		}
	}

	if(numero<=1){
		return false;
	}


	if(contador>2){
		System.out.println(contador);
		return false;
	}
	else{
		System.out.println(contador);
		return true;
	}    
    }

    
    public int[] serieFibonacci(int n) {
    
    if (n < 0) {
        throw new IllegalArgumentException("El número n no puede ser negativo.");
    }

   
    if (n == 0) {
        return new int[0];
    }

   
    int[] resultado = new int[n];

    
    resultado[0] = 0;

    
    if (n > 1) {
        resultado[1] = 1;
    }

    
    for (int i = 2; i < n; i++) {
        resultado[i] = resultado[i - 1] + resultado[i - 2];
    }

    return resultado;
}

    public int sumaElementos(int[] arreglo) {
    int suma = 0;
    for (int num : arreglo) {
        suma += num;
    }
    return suma;
}

public double promedioElementos(int[] arreglo) {
    if (arreglo.length == 0) {
        return 0.0;
    }
    int suma = 0;
    for (int num : arreglo) {
        suma += num;
    }
    return (double) suma / arreglo.length;
}

public int encontrarElementoMayor(int[] arreglo) {
    if (arreglo.length == 0) {
        throw new IllegalArgumentException("El arreglo no puede estar vacío.");
    }
    int mayor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
        if (arreglo[i] > mayor) {
            mayor = arreglo[i];
        }
    }
    return mayor;
}

    public int encontrarElementoMenor(int[] arreglo) {
    if (arreglo.length == 0) {
        throw new IllegalArgumentException("El arreglo no puede estar vacío.");
    }
    int menor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
        if (arreglo[i] < menor) {
            menor = arreglo[i];
        }
    }
    return menor;
}

public boolean buscarElemento(int[] arreglo, int elemento) {
    for (int num : arreglo) {
        if (num == elemento) {
            return true;
        }
    }
    return false;
}

public int[] invertirArreglo(int[] arreglo) {
    int[] invertido = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
        invertido[i] = arreglo[arreglo.length - 1 - i];
    }
    return invertido;
}

public int[] ordenarArreglo(int[] arreglo) {
    int[] ordenado = arreglo.clone();
    for (int i = 0; i < ordenado.length - 1; i++) {
        for (int j = 0; j < ordenado.length - 1 - i; j++) {
            if (ordenado[j] > ordenado[j + 1]) {
                int temp = ordenado[j];
                ordenado[j] = ordenado[j + 1];
                ordenado[j + 1] = temp;
            }
        }
    }
    return ordenado;
}

    public int[] eliminarDuplicados(int[] arreglo) {
    java.util.LinkedHashSet<Integer> set = new java.util.LinkedHashSet<>();
    for (int num : arreglo) {
        set.add(num);
    }
    int[] resultado = new int[set.size()];
    int i = 0;
    for (int num : set) {
        resultado[i++] = num;
    }
    return resultado;
}

public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
    int[] resultado = new int[arreglo1.length + arreglo2.length];
    System.arraycopy(arreglo1, 0, resultado, 0, arreglo1.length);
    System.arraycopy(arreglo2, 0, resultado, arreglo1.length, arreglo2.length);
    return resultado;
}

public int[] rotarArreglo(int[] arreglo, int posiciones) {
    if (arreglo.length == 0) {
        return arreglo;
    }
    int n = arreglo.length;
    int pos = posiciones % n;
    if (pos < 0) {
        pos += n;
    }
    int[] resultado = new int[n];
    for (int i = 0; i < n; i++) {
        resultado[i] = arreglo[(i + pos) % n];
    }
    return resultado;
}

public int contarCaracteres(String cadena) {
    if (cadena == null) {
        return 0;
    }
    return cadena.length();
}

public String invertirCadena(String cadena) {
    if (cadena == null) {
        return null;
    }
    return new StringBuilder(cadena).reverse().toString();
}
    

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        return false;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
    if (cadena == null || cadena.trim().isEmpty()) {
        return 0;
    }
    return cadena.trim().split("\\s+").length;
}

public String convertirAMayusculas(String cadena) {
    if (cadena == null) {
        return null;
    }
    return cadena.toUpperCase();
}

public String convertirAMinusculas(String cadena) {
    if (cadena == null) {
        return null;
    }
    return cadena.toLowerCase();
}

public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
    if (cadena == null || antiguaSubcadena == null || nuevaSubcadena == null) {
        return cadena;
    }
    return cadena.replace(antiguaSubcadena, nuevaSubcadena);
}

public int buscarSubcadena(String cadena, String subcadena) {
    if (cadena == null || subcadena == null) {
        return -1;
    }
    return cadena.indexOf(subcadena);
}

   
    public boolean validarCorreoElectronico(String correo) {
    if (correo == null) {
        return false;
    }
    String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    return correo.matches(regex);
}

public double promedioLista(java.util.List<Integer> lista) {
    if (lista == null || lista.isEmpty()) {
        return 0.0;
    }
    int suma = 0;
    for (int num : lista) {
        suma += num;
    }
    return (double) suma / lista.size();
}

public String convertirABinario(int numero) {
    return Integer.toBinaryString(numero);
}

public String convertirAHexadecimal(int numero) {
    return Integer.toHexString(numero).toUpperCase();
}

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        return "";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
        return 0.0;
    }

    public String zoodiac(int day, int month) {
        return "";
    }


}

