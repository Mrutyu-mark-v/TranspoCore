package com.tc.dao;

import com.tc.model.Route;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RouteDAO {

    public static List<Route> getRoutes(String source, String destination) {

        List<Route> list = new ArrayList<>();

        String sql = """
                SELECT * FROM routes
                WHERE source = ? AND destination = ?
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, source);
            ps.setString(2, destination);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Route r = new Route();

                r.setRouteId(rs.getInt("route_id"));
                r.setSource(rs.getString("source"));
                r.setDestination(rs.getString("destination"));
                r.setRouteName(rs.getString("route_name"));
                r.setDistanceKm(rs.getDouble("distance_km"));
                r.setExpectedTime(rs.getInt("expected_time_min"));
                r.setRoadQuality(rs.getInt("road_quality"));
                r.setRiskLevel(rs.getInt("risk_level"));
                r.setTrafficScore(rs.getDouble("traffic_score"));

                list.add(r);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}