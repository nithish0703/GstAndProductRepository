package com.gstMain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gstMain.Gst.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer> {
@Query(value="select percentage from gst where hsn_code=:hsn1 ",nativeQuery =true)
public int getPercentageByHsnCode(@Param("hsn1") int hsn1);
}
