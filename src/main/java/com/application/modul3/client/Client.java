package com.application.modul3.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.application.modul3.comanda.Comanda;

@Entity
@Table(name = "client", schema = "administration")
public class Client {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;

		@Column(name = "nume")
		private String nume;
		
		@Column(name = "adresa")
		private String adresa;
		
		@Column(name = "varsta")
		private Integer varsta;
		
		@OneToMany(mappedBy="comanda", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval=true)
		private List<Comanda> comenzi = new ArrayList<>();

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNume() {
			return nume;
		}

		public void setNume(String nume) {
			this.nume = nume;
		}

		public String getAdresa() {
			return adresa;
		}

		public void setAdresa(String adresa) {
			this.adresa = adresa;
		}

		public Integer getVarsta() {
			return varsta;
		}

		public void setVarsta(Integer varsta) {
			this.varsta = varsta;
		}

		public List<Comanda> getComenzi() {
			return comenzi;
		}

		public void setComenzi(List<Comanda> comenzi) {
			this.comenzi = comenzi;
		}

		
		
		
}
