package com.cg.onlineadmissionsyst.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.onlineadmissionsyst.module.Course;
import com.cg.onlineadmissionsyst.module.University;
@Repository
public interface IUniversityRepository extends JpaRepository<University, Integer >  {

	@Query(value = "select * from university inner join college on university.college_id=college.college_reg_id where college.college_name =:c",nativeQuery=true)
	List<University> findBycollegeName(@Param("c")String collegeName);
	
}