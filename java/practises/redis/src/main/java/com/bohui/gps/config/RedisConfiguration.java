package com.bohui.gps.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.MapPropertySource;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description redis集群,需要装ruby，完成集群。本类暂时无法测试
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/26 10:51
 **/
//@Configuration
public class RedisConfiguration {
//
//    @Autowired
//    ClusterConfig clusterConfig;
//
//    @Bean
//    public RedisClusterConfiguration redisClusterConfiguration() {
//        Map<String, Object> source = new HashMap();
//        source.put("spring.redis.cluster.nodes", clusterConfig.getNodes());
//        source.put("spring.redis.cluster.timeout", clusterConfig.getTimeout());
//        source.put("spring.redis.cluster.max-redirects", clusterConfig.getMaxRedirects());
//        return new RedisClusterConfiguration(new MapPropertySource("RedisProperties", source));
//    }
//
//    @Bean
//    public RedisConnectionFactory redisConnectionFactory() {
//        RedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory(redisClusterConfiguration());
//        return redisConnectionFactory;
//    }
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
//        RedisTemplate<String, Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(factory);
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper om = new ObjectMapper();
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jackson2JsonRedisSerializer.setObjectMapper(om);
//        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//        // key采用String的序列化方式
//        template.setKeySerializer(stringRedisSerializer);
//        // hash的key也采用String的序列化方式
//        template.setHashKeySerializer(stringRedisSerializer);
//        // value序列化方式采用jackson
//        template.setValueSerializer(jackson2JsonRedisSerializer);
//        // hash的value序列化方式采用jackson
//        template.setHashValueSerializer(jackson2JsonRedisSerializer);
//        template.afterPropertiesSet();
//        return template;
//    }
}
