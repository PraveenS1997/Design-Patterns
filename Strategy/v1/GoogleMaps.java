package Strategy.v1;

import Strategy.TransportationMode;

public class GoogleMaps {
    // the below method violates SRP & OCP
    public void findRoute(String source, String destination, TransportationMode mode){
        if(mode == TransportationMode.CAR){
            // find the shortest path for car
            // this block will have the entire logic
            // to find the shortest route from
            // source --> destination for cars
            // ...
            System.out.println("calculating the route for cars");
        }
        if(mode == TransportationMode.BIKE){
            // find the shortest path for bike
            // this block will have the entire logic
            // to find the shortest route from
            // source --> destination for bikes
            // ...
            System.out.println("calculating the route for bikes");
        }
        if(mode == TransportationMode.WALK){
            // find the shortest path for walking
            // this block will have the entire logic
            // to find the shortest route from
            // source --> destination for walk
            // ...
            System.out.println("calculating the route for walking");
        }
    }
}
