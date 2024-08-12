package com.keyin;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/binary")
public class BinaryTreeController {

    private final BinaryTreeService binaryTreeService;

    @Autowired
    public BinaryTreeController(BinaryTreeService binaryTreeService) {
        this.binaryTreeService = binaryTreeService;
    }

    @PostMapping("/tree")
    public String buildTree(@RequestBody List<Integer> numbers) {
        return binaryTreeService.buildTreeJson(numbers);
    }

    @GetMapping("/alltrees")
    public List<BinaryTreeEntity> getAllTrees() {
        return binaryTreeService.getAllTrees();
    }
}
