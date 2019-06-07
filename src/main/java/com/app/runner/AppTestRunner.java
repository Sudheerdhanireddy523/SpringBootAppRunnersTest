package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppTestRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// Read all the option keys
	Set<String> set=args.getOptionNames();
	System.out.println(set);
	
	
	// one key related to value
		List<String> l=args.getOptionValues("sudheer");
		System.out.println(l);
		
	//check key for exist
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));
		
	
	//Read all the NonOption keys
	List<String> list=args.getNonOptionArgs();
	System.out.println(list);
	
	//all args
	String[] s=args.getSourceArgs();
	System.out.println(s);
	System.out.println(Arrays.asList(s));
	
	
	
	
	}
	
    


}
