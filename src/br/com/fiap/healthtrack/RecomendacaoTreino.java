/*
 * @author Wesley Azevedo
 * @version 1.0
 */

package br.com.fiap.healthtrack;


public class RecomendacaoTreino extends Exercicio {


	// Construtores
	public RecomendacaoTreino() {

	}

	public RecomendacaoTreino(int exercicioID, String nomeExercicio, int repeticao, int serie, int massa, int gordura, int caloria,
			int proteina) {
		super();
	}

	Usuario usuario;
	public RecomendacaoTreino(Usuario usuario) {
		this.usuario = usuario;
	}

	// Metodos
	public String recomendacaoTreino(Usuario usuario) {
		if (usuario.getImc() < 18.49) {
			System.out.println(
					"Você está um pouco abaixo do peso!\nMais isso não é algo ruim, ter uma baixa porcentagem de gordura significa que você pode definir o seu corpo de forma mais rapida do que pessoas que estão acima do peso por exemplo.\nA musculação vai ser sua maior aliada nesse processo, ajudando você a ganhar bastante massa muscular, mas isso só é possivel com um equilibrio entre treino e dieta. ");
			System.out.println(
					"Nesse aritigo vamos te ensinar como montar uma boa escala de treinos para Hipertrofia: https://www.elhombre.com.br/como-montar-um-treino-de-hipertrofia-ideal/");

		} else if (usuario.getImc() >= 18.50 && usuario.getImc() <= 24.99) {
			System.out.println(
					"Parabéns! Você está com o seu peso ideal.\nO objetivo agora é manter a porcentagem de gordura baixa e continuar com treinos moderados para o ganho de massa muscular.");
			System.out.println(
					"Nesse aritigo vamos te mostrar algumas praticas para manter o seu peso:https://exame.com/casual/5-exercicios-para-um-corpo-mais-saudavel-segundo-harvard/");

		} else {
			System.out.println(
					"Você está um pouco acima do peso! \nMas não se preocupe, com exercicios corretos e uma dieta equilibrada você pode retornar para o seu peso ideal e ter uma vida mais saudavel.\nExercicios aerobicos serão grandes aliados para a redução de gordura. Andar, correr, nadar, pedalar, dançar, são alguns dos principais exemplos de exercícios aeróbicos.");
			System.out.println(
					"Nesse artigo vamos te mostrar alguns exercicios que você fazer para perder peso: https://gooutside.com.br/exercicios-aerobicos-para-desempenho-2/");

		}
		return "";

	}

}
