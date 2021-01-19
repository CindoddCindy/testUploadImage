package uploadimage.testuploadimage.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uploadimage.testuploadimage.model.DBFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String>{
}
