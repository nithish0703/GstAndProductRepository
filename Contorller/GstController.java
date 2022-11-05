package com.gstMain.Contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gstMain.Service.GstService;

import com.gstMain.Gst.Gst;
@RestController
public class GstController {
@Autowired
GstService gstSer;
@PostMapping("/addGst")
public String addGst(@RequestBody List<Gst> gst) {
	return gstSer.addGst(gst);
}
@GetMapping("/getGstValue")
public List<Gst> getGst(){
	return gstSer.getGst();
}
@DeleteMapping("/deleteGst/{id}")
public String deleteGst(@PathVariable int id) {
	return gstSer.deleteGst(id);
}
@PutMapping("/updateGstValue")
public String updateGst(@RequestBody Gst value) {
	return gstSer.updateGst(value);
}
@GetMapping("/getPercentage/{hsn1}")
public int getPercentage(@PathVariable int hsn1) {
	return gstSer.getPercentage(hsn1);
}
}
