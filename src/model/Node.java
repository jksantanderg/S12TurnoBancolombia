package model;

public class Node {
		//Datos
		private int value;
		private Turn turn;
		
		//Enlaces
		private Node prev;
		private Node next;
		
		public Node() {
			
		}
		
		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Turn getTurn() {
			return turn;
		}

		public void setTurn(Turn turn) {
			this.turn = turn;
		}

}
