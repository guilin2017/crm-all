package org.crm.card.config;

import com.common.config.BaseRedisCacheConfiguration;
import com.github.pagehelper.PageInterceptor;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;

import java.util.Properties;

import static org.crm.card.core.ProjectConstant.*;

/**
 * ${DESCRIPTION}
 *
 * @author linguilin
 * @create 2018-04-19 14:51
 **/

@Configuration
@EnableTransactionManagement
public class MybatisConfiguration extends BaseRedisCacheConfiguration{

}
