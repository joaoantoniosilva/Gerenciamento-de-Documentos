package Repository

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DocumentVersionRepository extends JpaRepository<DocumentVersion, Long> {

    // Método de busca personalizado para encontrar versões de um documento específico
    List<DocumentVersion> findByDocument(Document document);

    // Método de busca personalizado para encontrar versões por data de upload
    List<DocumentVersion> findByUploadDateBetween(Date startDate, Date endDate);
}
