package msj.search.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import msj.search.entity.Person;

public interface SimplePersonRepository extends ElasticsearchRepository<Person,String> {
}
