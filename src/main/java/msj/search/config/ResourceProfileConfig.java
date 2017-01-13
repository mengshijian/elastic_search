/** 
 *@Project: okdeer-essearch 
 *@Author: yangq
 *@Date: 2016年9月6日 
 *@Copyright: ©2014-2020 www.okdeer.com Inc. All rights reserved. 
 */    
package msj.search.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

/**
 * ClassName: ResourceProfileConfig 
 * @author yangq
 * @date 2016年9月6日
 *
 * =================================================================================================
 *     Task ID			  Date			     Author		      Description
 * ----------------+----------------+-------------------+-------------------------------------------
 *
 */
@Configuration
@Profile("dev")
@ImportResource({"classpath:/META-INF/spring-conf.xml"})
public class ResourceProfileConfig {

}
