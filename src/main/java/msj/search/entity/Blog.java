package msj.search.entity;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.LazyDynaClass;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "test", type = "blog", shards = 1, replicas = 0, refreshInterval = "-1")
public class Blog {
	@Id
	@Field(index = FieldIndex.not_analyzed, store = true)
	private String id;
	@Field(index = FieldIndex.not_analyzed, store = true, type = FieldType.String)
	private String title;
	@Field(index = FieldIndex.not_analyzed, store = true, type = FieldType.String)
	private String posttime;
	@Field(index = FieldIndex.not_analyzed, store = true, type = FieldType.String)
	private String content;

	public Blog() {
	}

	public Blog(String id, String title, String posttime, String content) {
		this.id = id;
		this.title = title;
		this.posttime = posttime;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosttime() {
		return posttime;
	}

	public void setPosttime(String posttime) {
		this.posttime = posttime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public static void main(String[] args) {
		try {
			// 定义动态属性
			DynaProperty[] props = new DynaProperty[] {
					new DynaProperty("username", String.class),
					new DynaProperty("address", java.util.Map.class) };
			// 动态类
			LazyDynaClass dynaClass = new LazyDynaClass("person", null, props);
			// 动态bean
			DynaBean person = dynaClass.newInstance();
			person.set("username", "jhlishero");// 设置值
			Map<String, String> maps = new HashMap<String, String>();
			maps.put("key1", "value1");
			maps.put("key2", "value2");
			person.set("address", maps);// 设置值
			person.set("address", "key3", "value3");// 第二种方法设置map中的值
			System.out.println(person.get("username"));// 获取字符串值
			System.out.println(person.get("address", "key1"));// 获取map中值
			System.out.println(person.get("address", "key2"));
			System.out.println(person.get("address", "key3"));
			// 使用PropertyUtils工具获取属性值
			System.out.println(
					PropertyUtils.getSimpleProperty(person, "username"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}