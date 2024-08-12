package com.keyin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BinaryTreeService {

    private final BinaryTreeRepository repository;

    @Autowired
    public BinaryTreeService(BinaryTreeRepository repository) {
        this.repository = repository;
    }

    public String buildTreeJson(List<Integer> numbers) {
        BinaryTree tree = new BinaryTree();
        for (int number : numbers) {
            tree.insertRoot(number);
        }
        // Call toJson() without any arguments
        String json = tree.toJson();
        saveTree(json);
        return json;
    }

    public void saveTree(String json) {
        BinaryTreeEntity entity = new BinaryTreeEntity();
        entity.setJsonRepresentation(json);
        repository.save(entity);
    }

    public List<BinaryTreeEntity> getAllTrees() {
        return repository.findAll();
    }
}