package Controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentRestController {

    @Autowired
    private DocumentService documentService;

    @GetMapping
    public List<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @GetMapping("/{id}")
    public Document getDocumentById(@PathVariable Long id) {
        return documentService.getDocumentById(id);
    }

    @GetMapping("/search")
    public List<Document> searchDocumentsByTitle(@RequestParam String title) {
        return documentService.searchDocumentsByTitle(title);
    }

    @PostMapping
    public Document createDocument(@RequestBody Document document) {
        return documentService.createDocument(document);
    }

    @PutMapping("/{id}")
    public Document updateDocument(@PathVariable Long id, @RequestBody Document document) {
        return documentService.updateDocument(id, document);
    }

    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable Long id) {
        documentService.deleteDocument(id);
    }
}
