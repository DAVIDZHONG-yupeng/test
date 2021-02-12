package org.example.ssm.dao;

import org.apache.ibatis.annotations.Select;
import org.example.ssm.domain.Product;

import java.util.List;

public interface IProductDao {

    //查询所有信息
    @Select("select * from product")
    public List<Product> findAll() throws Exception;
}
