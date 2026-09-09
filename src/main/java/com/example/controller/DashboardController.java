package com.example.controller;
import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController public class DashboardController {
 @GetMapping("/api/deployments") public Map<String,Object> data(){return Map.of("total",86,"successful",79,"failed",4,"running",3,"releases",List.of(
 Map.of("application","commerce-api","version","2.4.1","environment","PROD","status","Successful"),
 Map.of("application","payment-service","version","3.1.0","environment","UAT","status","Running"),
 Map.of("application","user-service","version","1.9.3","environment","PROD","status","Successful"),
 Map.of("application","notification-service","version","4.0.2","environment","UAT","status","Failed")));}}
