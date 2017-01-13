package msj.search.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import msj.search.entity.OperationDocument;

/**
 * Created by mohsinhusen on 10/04/15.
 */
public interface OperationDocumentRepository  extends ElasticsearchRepository<OperationDocument, Long> {

}
