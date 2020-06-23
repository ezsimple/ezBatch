package ezfarm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.mkeasy.resolver.CommandMap;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {
	
	@RequestMapping("/")
	public Object hello(CommandMap commandMap) throws Exception {
		
		commandMap.debugParams();

		log.debug("{}", "Hello ezBatch");
		
		return "{}";
	}

}
