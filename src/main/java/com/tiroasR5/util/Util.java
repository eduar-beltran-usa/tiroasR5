package com.tiroasR5.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Danilo Beltran
 */
public class Util {

    /**
     *
     * @param request
     * @return
     */
    public static String buildObjectAsJSON(Object request) {
        try {
            return new ObjectMapper().writeValueAsString(request);
        } catch (JsonProcessingException e) {
            e.getCause();
        }
        return "{}";
    }
}
