package models;

import io.ebean.Model;
import io.ebean.Finder;

import java.math.BigInteger;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Bicicleta extends Model{

	@Id
	public BigInteger serial;
	public String marca;
	public String color;

	public static final Finder<Integer, Bicicleta> find = new Finder<>(Bicicleta.class);
}

