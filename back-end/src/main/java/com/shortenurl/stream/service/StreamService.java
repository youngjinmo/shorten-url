package com.shortenurl.stream.service;

import java.util.List;
import java.util.Map;

public interface StreamService {
    void produce(String key, Map<String, String> message);
    List<Map<String, String>> consume(String key);
    List<Map<String, String>> consume(String key, int limit);
    void remove(String key, List<Map<String, String>> records);
}
