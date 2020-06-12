package org.ribbon.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.RoundRobinRule;

public class RibbonConfig {

	@Autowired
    IClientConfig config;
	
  

    
	 @Bean
	    public IRule ribbonRule(IClientConfig config) {
	        
		 //return new BestAvailableRule();
		 
		 IRule rule = new RoundRobinRule();
	               return rule;
	               
	    }
		
		

}
