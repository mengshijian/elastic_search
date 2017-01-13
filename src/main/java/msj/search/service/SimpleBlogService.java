package msj.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.GetQuery;
import org.springframework.stereotype.Service;

import msj.search.dao.SimpleBlogRepository;
import msj.search.entity.Blog;
@Service
public class SimpleBlogService {
	 @Autowired
	 private ElasticsearchTemplate template; 
	 @Autowired
	 private SimpleBlogRepository repository;
	 
	 public void getbyId(){
		 GetQuery query = new GetQuery();
		 query.setId("AVfRQfiMXNAxgGemoYNM");
		 Blog blog = template.queryForObject(query,Blog.class);
		 System.out.println(blog.getContent()); 
	 }
	 
	 public void insert(Blog blog){
		 repository.save(blog);
	 }
}