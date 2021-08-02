/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carest;
class Estudiante {
	String nombre; // nombre por default el valor es null
	int edad; // edad por default el valor 0
	boolean esCienciaMayor; // esCienciaMayor por default el valor es false
	char gender; // c por default el valor es '\u0000'
}

class CarEst {
	public static void main(String[] args) {
	Estudiante estudiante = new Estudiante();
	System.out.println("nombre? " + estudiante.nombre );
	System.out.println("edad? " + estudiante.edad );
	System.out.println("esCienciaMayor? " + estudiante.esCienciaMayor );
	System.out.println("gender? " + estudiante.gender );
	}
}