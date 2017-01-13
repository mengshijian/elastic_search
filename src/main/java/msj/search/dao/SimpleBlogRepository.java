package msj.search.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import msj.search.entity.Blog;

public interface SimpleBlogRepository extends ElasticsearchRepository<Blog,String> {
}
