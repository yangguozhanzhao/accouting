package com.accounting.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.accounting.entity.Report;
import com.accounting.entity.User;

@Repository
public interface ReportDao extends JpaRepository<Report, Long> {
	@Query("select s from Report s where s.recordDate= ? ")
	public List<Report> findByRecordDate(Date date);

}
