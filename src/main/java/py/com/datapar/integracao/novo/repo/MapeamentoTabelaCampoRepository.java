package py.com.datapar.integracao.novo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import py.com.datapar.integracao.novo.model.MapeamentoCampo;

public interface MapeamentoTabelaCampoRepository extends PagingAndSortingRepository<MapeamentoCampo, Long> {

}
