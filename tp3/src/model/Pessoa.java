package model;

/**
 * Classe abstrata que define parametros comuns �s pessoas cadastradas no
 * programa.
 * 
 * @author Arthur Taylor e Thiago Oliveira
 * @version 1.0 (Out 2021)
 */

public abstract class Pessoa {

	private String nome;
	private String endereco;
	private String cpf;

	/**
	 * Construtor da classe Pessoa.
	 * 
	 * @param nome
	 * @param endereco
	 * @param cpf
	 */

	protected Pessoa(String nome, String endereco, String cpf) {

		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;

	}

	@Override
	public abstract String toString();

	// getter e setter de nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// getter e setter de endere�o
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// ggetter e setter de CPF
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}