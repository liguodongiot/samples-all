package com.lgd.es.dao;

/**
 * <p>Project: samples-all</p>
 * <p>Package: com.lgd.es.dao</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/5/18 11:48 星期五
 */
import com.lgd.es.bean.EmployeesDO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;



public interface EmployeesRepository extends ElasticsearchRepository<EmployeesDO,Integer>{

}
