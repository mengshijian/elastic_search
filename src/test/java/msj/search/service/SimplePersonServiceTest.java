package msj.search.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.okdeer.base.common.utils.UuidUtils;

import msj.search.BaseTest;
import msj.search.entity.Car;
import msj.search.entity.Person;

public class SimplePersonServiceTest extends BaseTest {
	
	@Autowired
	private SimplePersonService service;

	@Test
	public void testInsert() {
		try {
			Person user = new Person();
			user.setId(UuidUtils.getUuid());
			user.setName("张三李四");
			Car car1 = new Car();
			car1.setName("宝马");
			car1.setModel("auto");
			Car car2 = new Car();
			car2.setName("奥迪");
			car2.setModel("auto");
			List<Car> cars = new ArrayList<Car>();
			cars.add(car1);
			cars.add(car2);
			user.setCar(cars);
			service.insert(user);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
