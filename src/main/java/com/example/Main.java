package com.example;

import com.example.models.MaxProjectCountClient;
import com.example.service.DatabaseQueryService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseQueryService service = new DatabaseQueryService();
        List<MaxProjectCountClient> clients = service.findMaxProjectsClient();
        clients.forEach(client -> System.out.println(client.getName() + ": " + client.getProjectCount()));
    }
}
