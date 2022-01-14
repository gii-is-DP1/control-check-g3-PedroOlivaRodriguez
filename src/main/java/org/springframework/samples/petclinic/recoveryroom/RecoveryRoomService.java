package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecoveryRoomService {
	
	@Autowired
	private RecoveryRoomRepository rrr;
	
    public List<RecoveryRoom> getAll(){
        return rrr.findAll();
    }

    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        return null;
    }

    public RecoveryRoomType getRecoveryRoomType(String typeName) {
        return rrr.getRecoveryRoomType(typeName);
    }

    public List<RecoveryRoom> getRecoveryRoomsBiggerThan(double size) {
        return rrr.findBySizeMoreThan(size);
    }

    public RecoveryRoom save(RecoveryRoom p) {
        return null;       
    }

    
}
