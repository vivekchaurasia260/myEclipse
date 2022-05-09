package com.enquero.js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornJS {

	
	public static void main(String args[]) {
		
		
		
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        try {
        	        	
			nashorn.eval("print('hello') ");
		        // summing 2  numbers in  js  from  java code.
        Integer i = (Integer) nashorn.eval("200+ 300");
        System.out.println("sum from javascript : " + i);
        } catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
