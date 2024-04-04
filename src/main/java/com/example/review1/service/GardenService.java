package com.example.review1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.review1.repository.GardenRepo;
import com.example.review1.model.Garden;
@Service
public class GardenService {
     @Autowired
     GardenRepo ev;
     public Garden create(Garden e){
      return ev.save(e);
     }
     public List<Garden> getAll(){
      return ev.findAll();
     }
     public Garden getId(int eid){
      return ev.findById(eid).orElse(null);
     }
     public boolean update(int eid,Garden ee){
          if(this.getId(eid)==null)
          {
              return false;
          }
          try{
              ev.save(ee);
          }
          catch(Exception ex)
          {
              return false;
          }
          return  true;
     }
     public boolean delete(int eid){
          if(this.getId(eid)==null){
             return false;
          }
          ev.deleteById(eid);
          return true;
     }
}