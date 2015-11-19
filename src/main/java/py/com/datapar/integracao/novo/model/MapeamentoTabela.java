package py.com.datapar.integracao.novo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="api_map_tabela")
public class MapeamentoTabela {

	@Id
	@GeneratedValue
	private long id;
	
	private String tabelaOrigem;
	
	private String tabelaDestino;
	
	private String chaveOrigem;
	
	private String chaveDestino;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTabelaOrigem() {
		return tabelaOrigem;
	}

	public void setTabelaOrigem(String tabelaOrigem) {
		this.tabelaOrigem = tabelaOrigem;
	}

	public String getTabelaDestino() {
		return tabelaDestino;
	}

	public void setTabelaDestino(String tabelaDestino) {
		this.tabelaDestino = tabelaDestino;
	}

	public String getChaveOrigem() {
		return chaveOrigem;
	}

	public void setChaveOrigem(String chaveOrigem) {
		this.chaveOrigem = chaveOrigem;
	}

	public String getChaveDestino() {
		return chaveDestino;
	}

	public void setChaveDestino(String chaveDestino) {
		this.chaveDestino = chaveDestino;
	}

	public MapeamentoTabela(){
		
	}

	public MapeamentoTabela(long id, String tabelaOrigem, String tabelaDestino,
			String chaveOrigem, String chaveDestino) {
		super();
		this.id = id;
		this.tabelaOrigem = tabelaOrigem;
		this.tabelaDestino = tabelaDestino;
		this.chaveOrigem = chaveOrigem;
		this.chaveDestino = chaveDestino;
	}

	@Override
	public String toString() {
		return "MapeamentoTabela [id=" + id + ", tabelaOrigem=" + tabelaOrigem
				+ ", tabelaDestino=" + tabelaDestino + ", chaveOrigem="
				+ chaveOrigem + ", chaveDestino=" + chaveDestino + "]";
	}
	
	
}
