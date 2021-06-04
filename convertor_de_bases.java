
import java.util.Scanner;
public class convertor_de_bases {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        

/*de decimal para binario:

79       1 (impar). Dividimos entre dos:
39       1 (impar). Dividimos entre dos:
19       1 (impar). Dividimos entre dos:
9         1 (impar). Dividimos entre dos:
4         0 (par). Dividimos entre dos:
2         0 (par). Dividimos entre dos:
1        1 (impar).
Por tanto, 7910 = 1001111 

de decimal para hexadecimal:

devisão sucessiva por 16
10	A
11	B
12	C
13	D
14	E
15	F


de decimal para octal:

divisão sucessiva por 8

de binario para decimal:

com uma base  de 2  para se converter um número de binário para decimal 
multiplicando cada bit pela potência de sua posição e somar os resultados.


de hexadecimal para decimal:

com uma base  de 16  para, se converter um número de binário para decimal
multiplicando cada caracter pela potência de sua posição e somar os resultados.

de octal para decimal:

com uma base  de 8  para, se converter um número de binário para decimal
multiplicando cada caracter pela potência de sua posição e somar os resultados.
*/



//PASSO A PASSO:

// Solicite ao usuário uma base de entrada e a base de  saída,
//pode ser: Hexadecimal, Decimal, Octal ou Binária 
// a base de  saída.
System.out.println("1. Binario a octal\n" +
        "2. Binario a decimal\n" +
        "3. Binario a hexadecimal\n" +
        "4. Octal a binario\n" +
        "5. Octal a decimal\n" +
        "6. Octal a hexadecimal\n" +
        "7. Decimal a binario\n" +
        "8. Decimal a octal\n" +
        "9. Decimal a hexadecimal\n" +
        "10. Hexadecimal a binario\n" +
        "11. Hexadecimal a octal\n" +
        "12. Hexadecimal a decimal\n" +
        "Seleccione: ");

        Scanner cnv = new Scanner(System.in);
        int conversao = cnv.nextInt();

        if(conversao<1 || conversao>12)
        {
            System.out.println("Conversão inválida");
        }
        else
        {
            System.out.println("Qual será o número para a conversão: " + conversao);
        }

// Solicite ao usuário o número e  apresente a conversão do número na 
// base de entrada para seu valor correspondente na base de saída.
       
        Scanner n = new Scanner(System.in);
        switch (conversao) {
            case 1:
                int binario = n.nextInt();
                if (!validarBinario(binario)) {
                    System.out.println("Número inválido");
                    return;
                    }
                int decimal = binarioparaDecimal(binario);
                String resultadoOctal = decimalparaOctal(decimal);
                System.out.println("O resultado em octal é: " + resultadoOctal);
                break;
            case 2:
                binario = n.nextInt();
                if (!validarBinario(binario)) {
                    System.out.println("Número inválido");
                    return;
                }
                decimal = binarioparaDecimal(binario);
                System.out.println("O resultado em decimal é " + decimal);
                break;

            case 3:
                binario = n.nextInt();
                if (!validarBinario(binario)) {
                    System.out.println("Número inválido");
                    return;
                }
                decimal = binarioparaDecimal(binario);
                String resultadohexadecimal = decimalparaHexadecimal(decimal);
                System.out.println("O resultado em hexadecimal é " + resultadohexadecimal);
                break;
            case 4:
                int octal = n.nextInt();
                if (!validarOctal(octal)) {
                    System.out.println("Número inválido");
                    return;
                }
                decimal = octalparaDecimal(octal);
                String resultadoBinario = decimalparaBinario(decimal);
                System.out.println("O resultado em binario é " + resultadoBinario);
                break;
            case 5:
                octal = n.nextInt();
                if (!validarOctal(octal)) {
                    System.out.println("Número inválido");
                    return;
                }
                decimal = octalparaDecimal(octal);
                System.out.println("O resultado em decimal é " + decimal);
                break;
            case 6:
                octal = n.nextInt();
                if (!validarOctal(octal)) {
                    System.out.println("Número inválido");
                    return;
                }
                decimal = octalparaDecimal(octal);
                String resultadoHexadecimal = decimalparaHexadecimal(decimal);
                System.out.println("O resultado em hexadecimal é " + resultadoHexadecimal);
                break;
            case 7:
                decimal = n.nextInt();
                if (!validarDecimal(decimal)) {
                    System.out.println("Número inválido");
                    return;
                }
                resultadoBinario = decimalparaBinario(decimal);
                System.out.println("O resultado em binario é " + resultadoBinario);
                break;
            case 8:
                decimal = n.nextInt();
                if (!validarDecimal(decimal)) {
                    System.out.println("Número inválido");
                    return;
                }
                resultadoOctal = decimalparaOctal(decimal);
                System.out.println("O resultado em octal  é " + resultadoOctal);
                break;
            case 9:
                decimal = n.nextInt();
                if (!validarDecimal(decimal)) {
                    System.out.println("Número inválido");
                    return;
                }
                resultadoHexadecimal = decimalparaHexadecimal(decimal);
                System.out.println("O resultado em hexadecimal  é " + resultadoHexadecimal);
                break;
            case 10:
                resultadoOctal = n.nextLine().toUpperCase();
                if (!validarHexadecimal(resultadoOctal)) {
                    System.out.println("Número inválido");
                    return;
                }
                decimal = hexadecimalparaDecimal(resultadoOctal);
                resultadoBinario = decimalparaBinario(decimal);
                System.out.println("O resultado em binario é " + resultadoBinario);
                break;
            case 11:
                resultadoOctal = n.nextLine().toUpperCase();
                if (!validarHexadecimal(resultadoOctal)) {
                    System.out.println("Número inválido");
                    return;
                }
                decimal = hexadecimalparaDecimal(resultadoOctal);
                resultadoOctal = decimalparaOctal(decimal);
                System.out.println("O resultado em octal é " + resultadoOctal);
                break;
            case 12:
                resultadoOctal = n.nextLine().toUpperCase();
                if (!validarHexadecimal(resultadoOctal)) {
                    System.out.println("Número inválido");
                    return;
                }
                decimal = hexadecimalparaDecimal(resultadoOctal);
                System.out.println("O resultado em decimal é " + decimal);
                break;
        }
            
    }

// Funções de conversões:

public static String decimalparaBinario(int decimal) {
    String binario = "" ;
    while (decimal > 0) {
        binario = decimal % 2 + binario;
        decimal = decimal / 2;
    }
    return binario;
}

public static String decimalparaOctal(int decimal) {
    int resto;
    String octal = "";
    char[] digitosOctal = {'0', '1', '2', '3', '4', '5', '6', '7'};
    while (decimal > 0) {
        resto = decimal % 8;
        char digitos = digitosOctal[resto];
        octal = digitos + octal;
        decimal = decimal / 8;
    }
    return octal;
}

public static String decimalparaHexadecimal(int decimal) {
    int resto;
    String hexadecimal = "";
    char[] digitosHexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    while (decimal > 0) {
        resto = decimal % 16;
        char digitos = digitosHexadecimal[resto];
        hexadecimal = digitos + hexadecimal;
        decimal = decimal / 16;
    }
    return hexadecimal;
}

public static int binarioparaDecimal(int binario) {
    int decimal = 0;
    int potencia = 0;
    boolean i = true;
    while (i =true) {
        if (binario == 0) {
            break;
        } else {
            int digitobin = binario % 10;
            decimal += digitobin * Math.pow(2, potencia);
            binario = binario / 10;
            potencia++;
        }
    }
    return decimal;
}

public static int octalparaDecimal(int octal) {
    int decimal = 0;
    int potencia = 0;
    // Ciclo infinito que se rompe cuando octal es 0
    while (true) {
        if (octal == 0) {
            break;
        } else {
            int digitooctal = octal % 10;
            decimal += digitooctal * Math.pow(8, potencia);
            octal = octal / 10;
            potencia++;
        }
    }
    return decimal;
}

public static int hexadecimalparaDecimal(String hexadecimal) {
    String digitosHexadecimal = "0123456789ABCDEF";
    hexadecimal = hexadecimal.toUpperCase();
    int decimal = 0;
    for (int i = 0; i < hexadecimal.length(); i++) {
        char digitos = hexadecimal.charAt(i);
        int posicaoDigitos = digitosHexadecimal.indexOf(digitos);
        decimal = 16 * decimal + posicaoDigitos;
    }
    return decimal;


}



// Funções de validação:


public static boolean validarDecimal(int decimal) {
    return true;
}

public static boolean validarBinario(int binario) {
    String binariodigitos = String.valueOf(binario);
    for (int i = 0; i < binariodigitos.length(); i++) {
        char digitos = binariodigitos.charAt(i);
        if (digitos != '0' && digitos != '1') {
            return false;
        }
    }
    return true;
}

public static boolean validarOctal(int octal) {   
    String octaldigitos = String.valueOf(octal);
    String digitosOctal = "01234567";
    for (int i = 0; i < octaldigitos.length(); i++) {
        char digitos = octaldigitos.charAt(i);
        if (digitosOctal.indexOf(digitos) == -1) {
            return false;
        }
    }
    return true;
}


public static boolean validarHexadecimal(String hexadecimal) {  
    String digitosHexadecimal = "0123456789ABCDEF";
    for (int i = 0; i < hexadecimal.length(); i++) {
        char digitos = hexadecimal.charAt(i);
        if (digitosHexadecimal.indexOf(digitos) == -1) {
            return false;
        }
    }
    return true;
}



        
    }


