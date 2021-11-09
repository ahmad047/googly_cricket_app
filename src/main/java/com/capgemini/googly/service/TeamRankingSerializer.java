package com.capgemini.googly.service;

import com.capgemini.googly.generated.model.Team;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.TextNode;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class TeamRankingSerializer extends JsonDeserializer<Team> {

    @Override
    public Team deserialize(JsonParser jsonParser,
            DeserializationContext deserializationContext) throws IOException,
            JsonProcessingException {

        TreeNode treeNode = jsonParser.getCodec().readTree(jsonParser);
        TextNode data
                = (TextNode) treeNode.get("data");
        System.out.println(data);
        return new Team();
    }
}
