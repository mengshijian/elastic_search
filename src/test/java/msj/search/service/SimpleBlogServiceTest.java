package msj.search.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.okdeer.base.common.utils.UuidUtils;

import msj.search.BaseTest;
import msj.search.entity.Blog;

public class SimpleBlogServiceTest extends BaseTest {
	
	@Autowired
	private SimpleBlogService simpleBlogService;
	@Test
	public void testGetbyId() {
		simpleBlogService.getbyId();
	}
	@Test
	public void testSave(){
		try{
			Blog blog = new Blog();
			blog.setId(UuidUtils.getUuid());
			blog.setTitle("java实战");
			blog.setContent("java是一门很牛逼的语言");
			blog.setPosttime("2017-01-11");
			simpleBlogService.insert(blog);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
}
