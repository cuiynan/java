package configure;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author : cuiyingnan
 * @date : 2020/6/8 15:26
 * @desc : 注意扫描源文件路径和yml配置路径
 */
@Configuration
@MapperScan(basePackages = "com.bh.reponsitory.**", sqlSessionFactoryRef = "bhSqlSessionFactory")
public class BHConfigure {

    @ConfigurationProperties(prefix = "spring.datasource.bh")
    @Bean("bhDataSource")
    public DataSource bhDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean("bhSqlSessionFactory")
    public SqlSessionFactory bhSqlSessionFactory(@Qualifier("bhDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/bhmappers/*.xml"));
        return bean.getObject();
    }

    @Bean("bhDataSourceTransactionManager")
    public DataSourceTransactionManager bhDataSourceTransactionManager(@Qualifier("bhDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean("bhSqlSessionTemplate ")
    public SqlSessionTemplate bhSqlSessionTemplate(@Qualifier("bhSqlSessionFactory") SqlSessionFactory sessionFactory) {
        return new SqlSessionTemplate(sessionFactory);
    }

}
