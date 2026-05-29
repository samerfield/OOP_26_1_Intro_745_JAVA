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
    if (arreglo == null || arreglo.length == 0) {
        return arreglo;
    }
    int n = arreglo.length;
    int pos = posiciones % n;
    if (pos < 0) {
        pos += n;
    }
    int[] resultado = new int[n];
    for (int i = 0; i < n; i++) {
        resultado[(i + pos) % n] = arreglo[i];
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
    if (numero < 0) {
        return "-" + Integer.toBinaryString(Math.abs(numero));
    }
    return Integer.toBinaryString(numero);
}

public String convertirAHexadecimal(int numero) {
    if (numero < 0) {
        return "-" + Integer.toHexString(Math.abs(numero)).toUpperCase();
    }
    return Integer.toHexString(numero).toUpperCase();
}

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
    if (eleccionUsuario == null) {
        return "Elección inválida";
    }

    String usuario = eleccionUsuario.trim().toLowerCase();
    String[] opciones = {"piedra", "papel", "tijera", "lagarto", "spock"};
    
    boolean opcionValida = false;
    for (String opcion : opciones) {
        if (opcion.equals(usuario)) {
            opcionValida = true;
            break;
        }
    }
    
    if (!opcionValida) {
        return "Elección inválida";
    }

    int indiceAleatorio = (int) (Math.random() * opciones.length);
    String computadora = opciones[indiceAleatorio];

    if (usuario.equals(computadora)) {
        return "Empate";
    }

    boolean usuarioGana = false;
    switch (usuario) {
        case "piedra":
            usuarioGana = computadora.equals("tijera") || computadora.equals("lagarto");
            break;
        case "papel":
            usuarioGana = computadora.equals("piedra") || computadora.equals("spock");
            break;
        case "tijera":
            usuarioGana = computadora.equals("papel") || computadora.equals("lagarto");
            break;
        case "lagarto":
            usuarioGana = computadora.equals("spock") || computadora.equals("papel");
            break;
        case "spock":
            usuarioGana = computadora.equals("tijera") || computadora.equals("piedra");
            break;
    }

    return usuarioGana ? "Ganaste" : "Perdiste";
}

    public String pptls2(String game[]) {
    if (game == null || game.length != 2) {
        return "Empate";
    }
    String p1 = game[0];
    String p2 = game[1];
    if (p1.equals(p2)) {
        return "Empate";
    }
    boolean p1Gana = false;
    switch (p1) {
        case "R":
            p1Gana = p2.equals("S") || p2.equals("L");
            break;
        case "P":
            p1Gana = p2.equals("R") || p2.equals("V");
            break;
        case "S":
            p1Gana = p2.equals("P") || p2.equals("L");
            break;
        case "L":
            p1Gana = p2.equals("V") || p2.equals("P");
            break;
        case "V":
            p1Gana = p2.equals("S") || p2.equals("R");
            break;
    }
    return p1Gana ? "Player 1" : "Player 2";
}

public double areaCirculo(double radio) {
    if (radio < 0) {
        throw new IllegalArgumentException("El radio no puede ser negativo.");
    }
    return Math.PI * radio * radio;
}

	
public String zoodiac(int dia, int mes) {
    if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
        return "Invalid Date";
    }
    if (mes == 2 && dia > 29) return "Invalid Date";
    if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) return "Invalid Date";

    switch (mes) {
        case 1: return (dia <= 19) ? "Capricornio" : "Acuario";
        case 2: return (dia <= 18) ? "Acuario" : "Piscis";
        case 3: return (dia <= 20) ? "Piscis" : "Aries";
        case 4: return (dia <= 19) ? "Aries" : "Tauro";
        case 5: return (dia <= 20) ? "Tauro" : "Géminis";
        case 6: return (dia <= 20) ? "Géminis" : "Cáncer";
        case 7: return (dia <= 22) ? "Cáncer" : "Leo";
        case 8: return (dia <= 22) ? "Leo" : "Virgo";
        case 9: return (dia <= 22) ? "Virgo" : "Libra";
        case 10: return (dia <= 22) ? "Libra" : "Escorpio";
        case 11: return (dia <= 21) ? "Escorpio" : "Sagitario";
        case 12: return (dia <= 21) ? "Sagitario" : "Capricornio";
        default: return "Invalid Date";
    }
}

}

