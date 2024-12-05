/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author USER
 */
public class Calculadora {
      
    private int resultadoActual;
    private Stack<Integer> pilaResultado;
    private Stack<Integer> pilaRehacer;

    public Calculadora() {
        resultadoActual = 0;
        pilaResultado = new Stack<>();
        pilaRehacer = new Stack<>();
    }  

    // Método para sumar
    public void sumar(int numero) {
        pilaResultado.push(resultadoActual); // Guarda el estado actual antes de la operación
        resultadoActual += numero;
        pilaRehacer.clear(); // Limpia la pila de rehacer
    }

    // Método para deshacer
    public void deshacer
    


        



    
    
    
    