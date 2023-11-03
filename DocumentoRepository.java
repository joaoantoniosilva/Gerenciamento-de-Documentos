package Repository

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    // Método de busca personalizado para encontrar documentos por título
    List<Document> findByTitleContaining(String title);

    // Método de busca personalizado para encontrar documentos por data de upload
    List<Document> findByUploadDateBetween(Date startDate, Date endDate);
}
