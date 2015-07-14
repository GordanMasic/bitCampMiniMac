package ba.bitcampLinkedLists;

import ba.bitcamp.ArrayList.Song;

public class SongLinked {

	private Node start;

	public SongLinked(Song song){
		this.start.song = song;
	}
	
	public SongLinked(Song[] songs){
		for (int i = 0; i < songs.length; i++) {
			this.add(songs[i]);
		}
	}
	
	public SongLinked() {
		start = null;
	}

	private Node getLastNode() {
		if (start == null) {
			return null;
		}
		
		Node temp = start;
		while (temp.getNextNode() != null) {
			temp = temp.getNextNode();
		}
		
		return temp;
	}
	
	public void add(Song song) {
		if (start == null) {
			start = new Node(song);
		} else {
			Node last = getLastNode();
			
			last.setNextNode(new Node(song));
		}
	}
	
	public Song get(int index) {
		Node temp = start;
		
		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}
		
		return temp.getSong();
	}
	
	public void remove(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}
		
		Node previous = getPreviousNode(temp);
		
		previous.setNextNode(temp.getNextNode());
	}
	
	public Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}
		
		Node temp = start;
		while (temp.getNextNode() != n) {
			temp = temp.getNextNode();
		}
		
		return temp;
	}
	
	public void remove(Song s){
		if(start == null){
			throw new NullPointerException("There are no elements in list!");
		}
		Node temp = start;
		int counter = 0;
		while (!temp.getNextNode().song.equals(s)) {
			counter++;
			temp = temp.getNextNode();
		}
		remove(counter);
	}
	
	public int getListSize(){
		Node temp = start;
		int counter = 0;
		while (temp.getNextNode() != null) {
			counter++;
			temp = temp.getNextNode();
		}
		
		return counter;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		if (start == null) {
			return "The list is empty";
		}
		
		return start.toString();
	}
	
	public boolean equals(SongLinked other) {		
		if(this.start.equals(other.start)){
			return true;
		}
		return false;
	}
	
	
	private class Node {
		private Song song;
		private Node next;

		public Node(Song song) {
			this.song = song;
		}

		public Song getSong() {
			return song;
		}

		public Node getNextNode() {
			return next;
		}

		public void setNextNode(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			if (next == null) {
				return song.toString();
			}

			return song.toString() + " " + next.toString();
		}
		
		public boolean equals(Node other){
			if(this.song.equals(other.song) && this.next.equals(other.next)){
				return true;
			}else{
				return false;
			}
		}
	}
}
