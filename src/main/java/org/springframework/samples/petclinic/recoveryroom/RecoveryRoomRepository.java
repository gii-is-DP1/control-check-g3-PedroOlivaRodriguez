package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecoveryRoomRepository extends CrudRepository<RecoveryRoom, Integer>{
    List<RecoveryRoom> findAll();
    
    @Query(value = "SELECT rrtype FROM RecoveryRoomType rrtype")
    List<RecoveryRoomType> findAllRecoveryRoomTypes();
    
    Optional<RecoveryRoom> findById(int id);
    RecoveryRoom save(RecoveryRoom p);
    
    @Query(value = "SELECT rrtype FROM RecoveryRoomType rrtype where rrtype.name=:name")
    RecoveryRoomType getRecoveryRoomType(String name);
    
    @Query(value = "SELECT rroom FROM RecoveryRoom rroom where rroom.size>:size")
    List<RecoveryRoom> findBySizeMoreThan(double size);
}
