package com.tc.model;

public class Route {

    private int routeId;
    private String source;
    private String destination;
    private String routeName;
    private double distanceKm;
    private int expectedTime;
    private int roadQuality;
    private int riskLevel;
    private double trafficScore;

    // getters and setters

    public int getRouteId() { return routeId; }
    public void setRouteId(int routeId) { this.routeId = routeId; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getRouteName() { return routeName; }
    public void setRouteName(String routeName) { this.routeName = routeName; }

    public double getDistanceKm() { return distanceKm; }
    public void setDistanceKm(double distanceKm) { this.distanceKm = distanceKm; }

    public int getExpectedTime() { return expectedTime; }
    public void setExpectedTime(int expectedTime) { this.expectedTime = expectedTime; }

    public int getRoadQuality() { return roadQuality; }
    public void setRoadQuality(int roadQuality) { this.roadQuality = roadQuality; }

    public int getRiskLevel() { return riskLevel; }
    public void setRiskLevel(int riskLevel) { this.riskLevel = riskLevel; }

    public double getTrafficScore() { return trafficScore; }
    public void setTrafficScore(double trafficScore) { this.trafficScore = trafficScore; }
}