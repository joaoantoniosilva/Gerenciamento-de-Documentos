package Controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/document-versions")
public class DocumentVersionRestController {

    @Autowired
    private DocumentVersionService documentVersionService;

    @GetMapping
    public List<DocumentVersion> getAllDocumentVersions() {
        return documentVersionService.getAllDocumentVersions();
    }

    @GetMapping("/document/{documentId}")
    public List<DocumentVersion> getVersionsByDocument(@PathVariable Long documentId) {
        return documentVersionService.getVersionsByDocument(documentId);
    }

    @GetMapping("/search")
    public List<DocumentVersion> searchVersionsByDate(@RequestParam String startDate, @RequestParam String endDate) {
        return documentVersionService.searchVersionsByDate(startDate, endDate);
    }

    @PostMapping
    public DocumentVersion createDocumentVersion(@RequestBody DocumentVersion documentVersion) {
        return documentVersionService.createDocumentVersion(documentVersion);
    }

    @DeleteMapping("/{id}")
    public void deleteDocumentVersion(@PathVariable Long id) {
        documentVersionService.deleteDocumentVersion(id);
    }
}
