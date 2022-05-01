package model;

public class List {
	private Node head;
	
	private void add(Node node) {
		
		if(head == null) {
			
			node = new Node(1);
			node.setTurn(new Turn("TURN_ACTUAL"));
			
			head = node;
			head.setNext(head);
			head.setPrev(head);
		}else {
			
			Node tail = head.getPrev();
			//node.setValue(tail.getValue()+1);
			node = new Node(tail.getValue()+1);
			tail.setNext(node);
			node.setPrev(tail); 
			
			node.setNext(head);
			head.setPrev(node);
			
		}
	}
	public void add() {
		add(head);
	}
	
	public void print() {
		print(head);
	}
	
	private void print(Node node) {
		//Condiciones de parada
		if(node  == null) {
			System.out.println("No_HAy_TURNOS");
		}
		if(node.getNext() == head) {
			//System.out.println(node.getValue());
			System.out.println(node.getValue()+" "+(node.getTurn() != null ? node.getTurn().getTurn():""));
			return;
		}
		
		System.out.println(node.getValue()+" "+(node.getTurn() != null ? node.getTurn().getTurn():""));
		//Algoritmo recursivo
		print(node.getNext());
	}
	
	
	public void moveTurn(int t) {
		Node turnNode = findTurn(head);
		
		//movePlayer(playerNode, dice);
		
		Turn tu = turnNode.getTurn();
		turnNode.setTurn(null);
		moveTurn(turnNode,tu,t);
		
		
	}
	
	private void moveTurn(Node current,Turn turn,int t) {
		//condicion de parada
		if(t == 0){
			current.setTurn(turn);
			return;
		}
		//Metodo recursivo
		moveTurn(current.getNext(),turn,t-1);
	}

	
	private Node findTurn(Node current) {
		if(current.getTurn() != null) {
			return current;
		}
		return findTurn(current.getNext());
	}
	
	
	private void delete(Node current,Turn turn) {
		//Condición de parada
		 if(current == null){
			
			 return;
			 
		 }if(current.getPrev() == head && current == head) {
			 head.getNext().setPrev(null);
			 head = current.getNext();
			 return;
 
		 }if(current.getNext() == head && current == head) {
			 current.getPrev().setNext(current.getNext());
			 current.getNext().setPrev(current.getPrev());
			 return;
		 }
			
			/* current.getNext().setPrev(null);
			 
			 current = null;
			 */
			/*Node prev = current.getPrev();
			 Node next = current.getNext();
			 
			 Node tail = head.getPrev();
			 node = new Node(tail.getValue()+1);
			
			 tail.setNext(node);
			 node.setPrev(tail); 
				
			 node.setNext(head);
			 head.setPrev(node);*/
		 
		 	
		 	//Node tail = head.getPrev();
		 	
		 	
		 	Node prev = current.getPrev();
			Node next = current.getNext();
			//node.setValue(tail.getValue()+1);
			next = new Node(prev.getValue()+1);
			prev.setNext(next);
			next.setPrev(prev); 
			
			next.setNext(prev);
			prev.setPrev(next);
			 	
	}

	
	public void delete() {
		
		Node turnNode = findTurn(head);
	
		Turn tu = turnNode.getTurn();
		turnNode.setTurn(null);
		delete(turnNode,tu);
		
	}
}
