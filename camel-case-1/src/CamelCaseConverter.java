
public class CamelCaseConverter {

	/**
	 * Transforma o primeiro caracter em maiusculo e depois concatena com o resto da
	 * String nome a partir do segundo caracter
	 * 
	 * @param nome
	 * @return String
	 */
	public String converter(String nome) {
		return nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
	}

}
