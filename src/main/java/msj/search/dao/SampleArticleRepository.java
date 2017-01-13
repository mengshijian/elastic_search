package msj.search.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import msj.search.entity.Article;

public interface SampleArticleRepository extends ElasticsearchRepository<Article,String> {
}
