package py.com.datapar.integracao;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class ApiTransicaoFiveApplication {

	@Autowired
	@Qualifier("newLocalidadeResource")
	private py.com.datapar.integracao.novo.repo.LocalidadeResource locaRepoNew;

	@Autowired
	@Qualifier("oldLocalidadeResource")
	private py.com.datapar.integracao.old.repo.LocalidadeResource locaRepoOld;

	public static void main(String[] args) {
		SpringApplication.run(ApiTransicaoFiveApplication.class, args);
	}

	@PostConstruct
	public void init() {
		py.com.datapar.integracao.old.model.Localidade l2 = new py.com.datapar.integracao.old.model.Localidade();
		l2.setDescricao("OLD-8");
		locaRepoOld.save(l2);
		py.com.datapar.integracao.novo.model.Localidade l1 = new py.com.datapar.integracao.novo.model.Localidade();
		l1.setDescricao("NEW-8");
		locaRepoNew.save(l1);
	}

}
