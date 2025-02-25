/*declaração do pacote*/
package com.unijorge.pokemon;

/*importação da interface tipo água*/
import com.unijorge.tipos.TipoAgua;

/*importação de todos as classes do package ataque*/
import com.unijorge.ataque.*;

/*importação da classe array*/
import java.util.Arrays;

/*importação da classe arraylist*/
import java.util.ArrayList;

/*criação da classe sceptile filha de pokemon implementando classe tipo água*/
public class Empoleon extends Pokemon implements TipoAgua{
	
	/*declaração dos atributos da classe*/
	private static String nome = "Empoleon";
	private static int hp = 100;

	private static Hydro hydro = new Hydro();
	private static MuddyWater muddyWater = new MuddyWater();
	private static Boom boom = new Boom();
	private static Body body = new Body();
	
	private static ArrayList<Ataque> ataques = new ArrayList<Ataque>(Arrays.asList(muddyWater, hydro, body, boom));
	
	/*método construtor usando o da classe Pokemon*/ 
	public Empoleon() {
		super(nome, ataques,hp);

	}
	
	/*sobrescrição do método toString para imprimir o atributo nome*/
	@Override
	public String toString() {
		return this.nome; 
	}
}
