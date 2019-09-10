package com.cc.reponsitory;

import com.cui.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/25 18:10
 **/
@Repository
public interface UserReponsitory extends ElasticsearchRepository<User, String> {

    Page<User> findAll(Pageable pageable);


    @Query("{\"bool\" : {\"must\" : {\"match\" : {\"id\" : \":  id\"}},{\"should\" : { \"match\":{\"name\" : \":name\"}}}}}")
    Page<User> findByIdAndName(@Param("id") String id,@Param("name") String name, Pageable pageable);
}
