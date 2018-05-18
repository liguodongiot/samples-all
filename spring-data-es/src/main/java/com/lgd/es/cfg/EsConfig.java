package com.lgd.es.cfg;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * <p>Project: samples-all</p>
 * <p>Package: com.lgd.es.cfg</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/5/18 11:43 星期五
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.lgd.es.dao")
public class EsConfig {

}