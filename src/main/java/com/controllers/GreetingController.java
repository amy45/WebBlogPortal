package com.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.GreetingIfc;
import com.data.GreetingData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/webPortal")
public class GreetingController {

	 
	@Autowired
	 GreetingIfc greetingIfc;
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

   
   
    
    @RequestMapping(value="/greeting",method=RequestMethod.GET)
  //  public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
     public @ResponseBody Map getData(GreetingData e){
    	 
    	System.out.println("Inside controller");
    	 Map returnmap=new HashMap<>();
    	 GreetingData gd=new GreetingData();
    	 gd.setId("MVCId");
    	 gd.setName("MVCString");
    	returnmap.put("MVC", greetingIfc.getData(gd).get(0));
    	 returnmap.put("title", "Amit");
    	 returnmap.put("Id","1001");
    	 
    	 return returnmap;
     }
    	
    @RequestMapping("/greeting1")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    	
    
    	
    	
}	
    	
    /*	return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    */
   /* @RequestMapping(value = "/mydata", method = RequestMethod.GET)
	public @ResponseBody Map getDATA() {
		Map returnMap = new HashMap<>();

		try {

			returnMap.put("myData", amitServiceIfc.getMyData());
			LOGGER.info("Into the amit data method ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return returnMap;
	}

*/    

