package py.com.datapar.integracao.novo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import py.com.datapar.integracao.novo.model.MapeamentoTabela;

public interface MapeamentoTabelaRepository extends PagingAndSortingRepository<MapeamentoTabela, Long> {
	
	
}
