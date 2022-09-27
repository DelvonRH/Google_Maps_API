package com.tts.MapsApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapsAppController {
	MapsAppService mapService = new MapsAppService();
    @GetMapping("/home")
    public String getDefaultMap() {
    	Location location = new Location();
    	location.setCity("Dallas");
    	location.setState("Texas");
    	mapService.addCoordinates(location);
    	System.out.println(location);
        return "index.html";
    }
}
