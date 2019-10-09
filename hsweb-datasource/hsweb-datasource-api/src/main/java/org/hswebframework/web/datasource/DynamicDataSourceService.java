package org.hswebframework.web.datasource;

import org.hswebframework.web.datasource.exception.DataSourceNotFoundException;
import reactor.core.publisher.Mono;

/**
 * 动态数据源服务类
 *
 * @author zhouhao
 * @since 3.0
 */
public interface DynamicDataSourceService {

    /**
     * 根据数据源ID获取动态数据源,数据源不存在将抛出{@link DataSourceNotFoundException}
     *
     * @param dataSourceId 数据源ID
     * @return 动态数据源
     */
    JdbcDataSource getDataSource(String dataSourceId);

    Mono<R2dbcDataSource> getR2dbcDataSource(String dataSourceId);

    /**
     * @return 默认数据源
     */
    DynamicDataSource getDefaultDataSource();
}
