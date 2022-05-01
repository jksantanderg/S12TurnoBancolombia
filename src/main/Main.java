package main;

import java.util.Scanner;

import model.List;
import model.Node;
import model.Turn;

public class Main {
	static Scanner  sc = new Scanner (System.in);
	
	public static List list = new List();
	public static void main(String[] args) {
		
		/*List list = new List();
		
		list.add();	
		list.print();
		
		list.add();	
		list.add();	
		list.add();	
		list.add();	
		list.print();+*/
		
		menu();
		
	}
	
	
	
	public static void menu() {
		boolean exit = false;
		int opcion = 0;
		
		while(exit != true) {
			System.out.println("---¿Qué deseas hacer?----\n"+
					"1. Dar turno\n"+
					"2. Mostrar turno\n"+
					"3. Pasar turno\n"+
					"4. Eliminar turno actual\n"+
					
					"\nEnter an option\n");
			opcion = sc.nextInt ();
			List list = new List();
		switch (opcion) {
				
			case 1:
				addTurn();
			
				break;
			case 2:
				ShowTurn();
				break;
			case 3:
				passTurn();
				break;
			case 4:
				DeleteCurrentShift();
				break;
			}
		}		
	}



	private static void addTurn() {
		list.add();
		
		
	}
	

	private static void ShowTurn() {
		list.print();
		
	}
	
	private static void passTurn() {
		int t = 1;
		list.moveTurn(t);
		list.print();
		
	}
	
	private static void DeleteCurrentShift() {
		list.delete();
		
	}

}
