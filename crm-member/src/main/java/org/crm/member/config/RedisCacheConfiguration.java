package org.crm.member.config;

import com.common.config.BaseRedisCacheConfiguration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class RedisCacheConfiguration extends BaseRedisCacheConfiguration{

}
