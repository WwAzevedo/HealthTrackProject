/*
 * @author Wesley Azevedo
 * @version 1.0
 */

package br.com.fiap.healthtrack;


public class RecomendacaoDieta extends Dieta {

	
	// Construtores
	public RecomendacaoDieta() {

	}


	public RecomendacaoDieta(String alimento, int quantidade, int porcoes, int serie, int massa, int gordura,
			int caloria, int proteina) {
		super();

	}

	Usuario usuario;
	public RecomendacaoDieta(Usuario usuario) {
		this.usuario = usuario;
	}

	
	// Metodos
	public String recomendacaoDieta(Usuario usuario) {
		if (usuario.getImc() < 18.49) {
			System.out.println(
					"Voc� est� um pouco abaixo do peso!\nPara ganhar massa voc� precisa ingerir por menos o 2950kcal diariamente e tamb�m o dobro de proteinas do seu peso, exemplo, se voc� possui 60kg � necessario consumir 120g de proteinas por dia. ");
			System.out.println(
					"Nesse aritigo vamos te ensinar como montar uma boa dieta para Hipertrofia: https://www.hipertrofia.org/blog/2017/07/27/dieta-para-hipertrofia/");

		} else if (usuario.getImc() >= 18.50 && usuario.getImc() <= 24.99) {
			System.out.println(
					"Parab�ns! Voc� est� com o seu peso ideal.\nPara manter o seu peso � necessario ingerir pelo menos 2600kcal. diariamente");
			System.out.println(
					"Nesse aritigo vamos te mostrar algumas dietas para manter o seu peso:https://melhorcomsaude.com.br/3-dietas-para-manter-o-seu-peso/");

		} else {
			System.out.println(
					"Voc� est� um pouco acima do peso! \nPara diminuir o seu peso � necessario ingerir somente a quantidade de calorias que seu corpo precisa para realizar as func��es do dia a dia, cerca de 2200kcal diariamente.");
			System.out.println(
					"Nesse artigo vamos te mostrar algumas dietas para diminuir o seu peso: https://www.minhavida.com.br/alimentacao/tudo-sobre/23034-dieta-para-emagrecer");

		}
		return "";

	}
}
