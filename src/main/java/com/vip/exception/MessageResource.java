package com.vip.exception;


import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MessageResource {
	 
	    private ResourceBundle rb; //资源绑定  
	  
	    /** 
	     * @param props Properties 资源绑定 
	     */  
	    public MessageResource(ResourceBundle rb) {  
	        this.rb = rb;  
	    }  
	  
	    /** 
	     * @param key String 键 
	     * @return String 
	     */  
	    public String getString(String key) {  
	        try {  
	            return rb.getString(key);  
	        } catch (MissingResourceException ex) {  
	            return " resource file conversion exception.";  
	        }  
	    }  
	  
	    /** 
	     * @param key String 键 
	     * @param args Object[] 动态消息 
	     * @return String 
	     */  
	    @SuppressWarnings("static-access")
		public String getString(String key, Object[] args) {  
	    	try {  
	            String temp = rb.getString(key); 
	            MessageFormat mFormat = new MessageFormat(temp);  
	            return mFormat.format(temp, args);  
	        } catch (MissingResourceException ex) {  
	        	return " resource file conversion exception.";  
	        } 
	    } 
}
