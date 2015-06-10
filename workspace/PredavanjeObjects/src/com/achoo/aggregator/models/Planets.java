package com.achoo.aggregator.models;

public class Planets {
	
	private static final Integer g = 10;
	
	private Integer tezina;
	
	private Integer masa;
	
	private String oblik;
	
	private String ime;
	
	/**
	 * This is default constructor for our class
	 * @param tezina
	 * @param masa
	 * @param oblik
	 * @param ime
	 */
	
	public Planets(Integer tezina, Integer masa, String oblik, String ime) {
		super();
		this.tezina = tezina;
		this.masa = masa;
		this.oblik = oblik;
		this.ime = ime;
	}
	/**Method for calculating mass
	 * 
	 * @param dodatak
	 */
	public void dodajMasu(Integer dodatak){
		this.masa += dodatak;
	}
	/**Method for printing mass value
	 * 
	 * @return
	 */
	public Integer vrijednostMase(){
		return this.masa;
	}
	/**Method for calculating weight
	 * 
	 * @return
	 */
	public Integer racunajTezinu(){
		this.tezina = this.masa * g;
		return this.tezina;
	}
	
}
