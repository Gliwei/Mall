package com.lw.basic.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lw.basic.entity.Category;

@Repository
public interface CategoryMapper {
	public List<Category> selectAllCategory();
}