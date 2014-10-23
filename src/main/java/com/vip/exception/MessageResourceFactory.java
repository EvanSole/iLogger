package com.vip.exception;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class MessageResourceFactory {
	
	private static MessageResourceFactory factory = new MessageResourceFactory();  
    
	private Map<String, MessageResource> msgResourceMap = null; //存放消息资源  
  
    private MessageResourceFactory() {  
        msgResourceMap = new HashMap<String,MessageResource>();  
    }  
  
    public static MessageResourceFactory getInstance() {  
        return factory;  
    }  
  
    /** 
     * 读取资源 
     * @param moduleName 资源文件名 
     * @param locale Locale  
     * @return MessageResource 
     */  
    public MessageResource createMessageResource() {  
    	
    	/**定义资源文件名称**/
    	String moduleName = "i18n/exception_message"; 
    	
    	Locale locale = Locale.getDefault();
    	
    	/**默认取Map数据**/
    	Object object = msgResourceMap.get(moduleName);  
       
    	if (object == null) {               
            
    		ResourceBundle resourceBundle = ResourceBundle.getBundle(moduleName, locale);  
           
    		MessageResource messageResource = new MessageResource(resourceBundle);  
          
    		msgResourceMap.put(moduleName, messageResource);  
           
    		return messageResource;  
        
    	} else {  
    		/**返回map数据，减少读取文件次数**/
    		return (MessageResource)object;  
    	}  
    } 
}
