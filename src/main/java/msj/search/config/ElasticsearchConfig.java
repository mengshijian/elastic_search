package msj.search.config;

import java.net.InetAddress;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

/*@Configuration
@EnableElasticsearchRepositories(basePackages = "msj.search.dao")*/
public class ElasticsearchConfig {
	
	private static final Logger LOG = LoggerFactory.getLogger(ElasticsearchConfig.class);
	
	@Value("${elasticsearch.cluster.name}")
	private String clusterName;

	@Value("${elasticsearch.node}")
	private String clusterAddress;
	@Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(client());
    }
	
	@Bean
	public TransportClient client(){
		Settings settings = Settings.settingsBuilder().put("cluster.name", clusterName).put("client.transport.sniff", true).build();
		TransportClient client = TransportClient.builder().settings(settings).build();
		String[] addressArray = clusterAddress.split(",");
		try {
			for (String address : addressArray) {
				String[] addr = address.split(":");
				client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(addr[0]), Integer.parseInt(addr[1])));
			}
		} catch (Exception ex) {
			LOG.error("获取客户端失败{}",ex);
		}
        return client;
	}
}
