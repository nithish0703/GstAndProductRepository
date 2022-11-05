package com.gstMain.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


import com.gstMain.Gst.Gst;
import com.gstMain.Repository.GstRepository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gstRepo;
	public String addGst(List<Gst> gst) {
		 gstRepo.saveAll(gst);
		 return "Gst list added successfully";
	}
	public List<Gst> getGst(){
		return gstRepo.findAll();
	}
	public String deleteGst(int id) {
		 gstRepo.deleteById(id);
		 return "Mentioned id has deleted";
	}
	public String updateGst(Gst value) {
		 gstRepo.save(value);
		 return "Gst value updated Successfully";
	}
	public int getPercentage(int hsn1) {
		return gstRepo.getPercentageByHsnCode(hsn1);
	}
}
