	package com.integrador.terraverde.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo título é Obrigatório!")
	@Size(max = 100, message = "O atributo título deve conter no minimo 05 e no maximo 100 caracteres")
	private String nome;

	@NotBlank(message = "O atributo receita é Obrigatório!")
	@Size(max = 1000, message = "O atributo receita deve conter no minimo 10 e no maximo 1000 caracteres")
	private String descricao;

	private String foto;

	@NotNull(message = "O preço é o obrigatório!")
	private float preco;
	
	@NotNull
	private String validade;

	@NotBlank(message = "A regiao é obrigatória!")
	private String regiao;

	@NotBlank(message = "O fornecedor é obrigatório!")
	private String fornecedor;

	@NotBlank(message = "A unidade de medida é obrigatória!")
	private String unidade_de_medida;

	@NotNull(message = "A quantidade é obrigatória!")
	private int quantidade;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getUnidade_de_medida() {
		return unidade_de_medida;
	}

	public void setUnidade_de_medida(String unidade_de_medida) {
		this.unidade_de_medida = unidade_de_medida;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
