package com.empresa;

import java.util.Scanner;

//problema complejo:

// realizar un algoritmo que permita el cálculo del promedio de tres notas de un alumno y la
//definición de la condición final de acuerdo con el promedio.

//dividimos el problema complejo en pequeño problemas (modularizacion):
//Subproblema 1: entrada de datos (nota 1, nota 2 y nota 3).
//Subproblema 2: cálculo del promedio.
//Subproblema 3: cálculo de la condición del alumno.
//Subproblema 4: salida de resultados.

public class AppPrincipal {
	// variables Globales : es una variable que puede ser utilizada dentro de todos
	// los metodos (funciones o procedimientos ) de nuestro programa
	static float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
	static String condicionAlumno = "";

	// algoritmo principal
	public static void main(String[] args) {
		System.out.println("Inicio del App");
		// invocamos a los subAlgoritmos (procedimientos o funciones)
		solicitarDatos();
		calcularPromedio();
		validarCondicion();
		mostrarResultados();
		System.out.println("Fin del App");
	}

	// resolvemos el subproblema 1 : Entrada de datos (nota 1, nota 2 y nota 3).
	public static void solicitarDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la nota 1");
		nota1 = teclado.nextFloat();
		System.out.println("Ingrese la nota 2");
		nota2 = teclado.nextFloat();
		System.out.println("Ingrese la nota 3");
		nota3 = teclado.nextFloat();
		teclado.close();
	}

	// resolvemos el Subproblema 2: cálculo del promedio.
	public static void calcularPromedio() {
		promedio = (nota1 + nota2 + nota3) / 3;
	}

	// resolvemos el subproblema 3: cálculo de la condición del alumno.
	public static void validarCondicion() {
		if (promedio >= 7) {
			condicionAlumno = "aprobado";
		} else {
			condicionAlumno = "desaprobado";
		}
	}

	// resolvemos el subproblema 3: salida de resultados.
	public static void mostrarResultados() {
		System.out.println("Las notas del alumno son :" + nota1 + " - " + nota2 + " - " + nota3);
		System.out.println("El promedio del alumnos es : " + promedio);
		System.out.println("la condicion del alumno es : " + condicionAlumno);
	}

}

