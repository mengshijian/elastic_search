package msj.search.dao;

import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import msj.search.entity.Blog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/META-INF/spring-conf.xml")
public class SimpleBlogRepositoryTest {
	@Autowired
	private SimpleBlogRepository simpleBlogRepository;
	@Test
	public void testFindOne() {
		Blog blog = simpleBlogRepository.findOne("AVfRQfiMXNAxgGemoYNM");
		System.out.println(blog.getContent());
	}
	@Test
	public void testFindAll(){
		Iterable<Blog> blogs = simpleBlogRepository.findAll();
		for (Iterator<Blog> it = blogs.iterator(); it.hasNext();) {
			Blog blog = (Blog) it.next();
			System.out.println(blog.getContent());
		}
	}
}
