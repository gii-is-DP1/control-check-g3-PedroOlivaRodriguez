package org.springframework.samples.petclinic.recoveryroom;

import java.text.ParseException;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class RecoveryRoomTypeFormatter implements Formatter<RecoveryRoomType>{

	@Autowired
	private RecoveryRoomService rrs;
	
    @Override
    public String print(RecoveryRoomType object, Locale locale) {
        return object.getName();
    }

    @Override
    public RecoveryRoomType parse(String text, Locale locale) throws ParseException {
    	RecoveryRoomType rrtype = rrs.getRecoveryRoomType(text);
    	if(rrtype==null) {
    		throw new ParseException(text, 0);
    	}
    	else {
    		return rrtype;
    	}
    }
    
}
