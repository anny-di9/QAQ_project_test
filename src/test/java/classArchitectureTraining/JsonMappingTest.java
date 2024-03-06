package classArchitectureTraining;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonMappingTest {
    @Test
    public void jsonMappingExample() throws IOException {
        File fileExample = new File("src/test/resources/mockBody/jsonMappingExample.json");
        Candidate ivan = new ObjectMapper().readValue(fileExample, Candidate.class);
        Assert.assertEquals(ivan.getFirstName(), "Ivan");
        Assert.assertEquals(ivan.getLastName(), "Ivanov");
        Assert.assertEquals(ivan.getAge(), 20);
        Assert.assertTrue(ivan.getSkills().contains("QA"));
    }

    /**
     * Task: create json mapping for file clientCards.json
     */
    @Test
    public void jsonMappingClientCard() {

    }

}
