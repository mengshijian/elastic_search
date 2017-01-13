/** 
 *@Project: okdeer-essearch 
 *@Author: yangq
 *@Date: 2016年9月5日 
 *@Copyright: ©2014-2020 www.okdeer.com Inc. All rights reserved. 
 */

package msj.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * ClassName: OkdeerEssearchApplication 
 * @Description: 启动入口
 * @author yangq
 * @date 2016年9月5日
 *
 * =================================================================================================
 *     Task ID			  Date			     Author		      Description
 * ----------------+----------------+-------------------+-------------------------------------------
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		SpringApplication.run(Application.class, args);
		long timeConsume = System.currentTimeMillis() - startTime;
		LOG.info("应用启动耗时{}ms",timeConsume);
	}
}
