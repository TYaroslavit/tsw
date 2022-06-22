package Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class GameCard implements Serializable{
	private static final long serialVersionUID = 1L;
	
	int id;
	String nome;
	Date dataRelease;
	Date dataAdded;
	String urlImg;
	float price;
	String description;
	
	public GameCard(){
		
	}
	
	public GameCard(int id, String nome, Date dR, Date dA, String urlI, float price, String dsc) {
		this.id = id;
		this.nome = nome;
		this.dataRelease = dR;
		this.dataAdded = dA;
		this.urlImg = urlI;
		this.price = price;
		this.description = dsc;
	}
	
	public int getID() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Date getDataRel() {
		return dataRelease;
	}
	public Date getDataAdd() {
		return dataAdded;
	}
	public String getUrl() {
		return urlImg;
	}
	public float getPrice() {
		return price;
	}
	public String getDsc() {
		return description;
	}
	
	public void setID(int id) {
		 this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataRel(Date dR) {
		this.dataRelease = dR;
	}
	public void setDataAdd(Date dA) {
		this.dataAdded = dA;
	}
	public void settUrl(String UrlI) {
		this.urlImg = UrlI;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setDsc(String dsc) {
		this.description = dsc;
	}
}
