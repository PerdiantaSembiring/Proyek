package com.inducesmile.taxirental.entity;


import java.util.List;

/**
 * Created by Perdianta on 01/05/2019.
 */

public class DirectionObject {

    private List<RouteObject> routes;

    private String status;

    public DirectionObject(List<RouteObject> routes, String status) {
        this.routes = routes;
        this.status = status;
    }

    public List<RouteObject> getRoutes() {
        return routes;
    }

    public String getStatus() {
        return status;
    }
}
