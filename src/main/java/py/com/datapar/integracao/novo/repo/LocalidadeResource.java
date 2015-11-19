package py.com.datapar.integracao.novo.repo;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import py.com.datapar.integracao.novo.model.Localidade;

//Pode usar @Component ou @Resource para qualificação
//@Repository("newLocalidadeResource")  
@Component("newLocalidadeResource")
@RepositoryRestResource(collectionResourceRel = "newlocalidade", path = "newlocalidade", exported = true)
public interface LocalidadeResource extends JpaRepository<Localidade, Long>{

}
