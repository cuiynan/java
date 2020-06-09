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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author : cuiyingnan
 * @date : 2020/6/8 15:26
 * @desc : 指定两个数据源，各mybatis包使用不同数据源而已
 */
@Configuration
@MapperScan(basePackages = "com.aidoctor.dao.**", sqlSessionFactoryRef = "aiSqlSessionFactory")
public class AIConfigure {

    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.ai")
    @Bean("aiDataSource")
    public DataSource aiDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean("aiSqlSessionFactory")
    public SqlSessionFactory aiSqlSessionFactory(@Qualifier("aiDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mappers/*.xml"));
        return bean.getObject();
    }

    @Primary
    @Bean("aiDataSourceTransactionManager")
    public DataSourceTransactionManager aiDataSourceTransactionManager(@Qualifier("aiDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean("aiSqlSessionTemplate ")
    public SqlSessionTemplate aiSqlSessionTemplate(@Qualifier("aiSqlSessionFactory") SqlSessionFactory sessionFactory) {
        return new SqlSessionTemplate(sessionFactory);
    }

}
