package msj.search.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import msj.search.entity.Product;

public interface SampleProductRepository extends ElasticsearchRepository<Product,String> {
    List<Product> findByName(String name);
    List<Product> findByName(String name, Pageable pageable);
    List<Product> findByNameAndId(String name, String id);
}
