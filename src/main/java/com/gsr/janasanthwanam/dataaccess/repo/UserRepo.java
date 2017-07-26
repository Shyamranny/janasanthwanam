package com.gsr.janasanthwanam.dataaccess.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gsr.janasanthwanam.dataaccess.entity.TblUser;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepo extends PagingAndSortingRepository<TblUser, Integer>{
  
}
