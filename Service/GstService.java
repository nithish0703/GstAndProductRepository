package com.gstMain.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gstMain.Dao.GstDao;
import com.gstMain.Gst.Gst;
@Service
public class GstService {
	@Autowired
	GstDao gstDao;
	public String addGst(List<Gst> gst) {
		return gstDao.addGst(gst);
	}
	public List<Gst> getGst(){
		return gstDao.getGst();
	}
	public String deleteGst( int id) {
		return gstDao.deleteGst(id);
	}
	public String updateGst(Gst value) {
		return gstDao.updateGst(value);
	}
	public int getPercentage(int hsn1) {
		return gstDao.getPercentage(hsn1);
	}
	
}
