package py.com.datapar.integracao.novo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="api_map_campo")
public class MapeamentoCampo {

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name="tabela_id")
	private MapeamentoTabela tabela;
	
	private String nome;
	
	private TipoCampo tipo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public MapeamentoTabela getTabela() {
		return tabela;
	}

	public void setTabela(MapeamentoTabela tabela) {
		this.tabela = tabela;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCampo getTipo() {
		return tipo;
	}

	public void setTipo(TipoCampo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "MapeamentoCampo [id=" + id + ", tabela=" + tabela + ", nome="
				+ nome + ", tipo=" + tipo + "]";
	}

	public MapeamentoCampo(long id, MapeamentoTabela tabela, String nome,
			TipoCampo tipo) {
		super();
		this.id = id;
		this.tabela = tabela;
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public MapeamentoCampo(){
		
	}
	
}
