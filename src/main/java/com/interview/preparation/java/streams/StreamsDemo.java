package com.interview.preparation.java.streams;

import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    List<Hotel> hotels = new ArrayList<Hotel>();

    public void filter(){
        hotels.stream().filter( hotel -> hotel.getCity().equals("London")).forEach(hotel -> System.out.println(hotel.getHotelName()+  " - " + hotel.getCity()));
    }

    public void sort(boolean reversed){
        Stream<Hotel> hotelStream =  null;
        if(reversed){
            hotelStream = hotels.stream().sorted(Comparator.comparing(Hotel::getPrice).reversed());
        } else {
            hotelStream = hotels.stream().sorted(Comparator.comparing(Hotel::getPrice));
        }
        hotelStream.forEach(hotel -> System.out.println(hotel.getHotelName()+ "-"+ hotel.getPrice()));

    }

    public void allMatch(){
        boolean isPriceGreaterthan60 = hotels.stream().allMatch(hotel -> hotel.getPrice() > 30.00);
        System.out.println(isPriceGreaterthan60);
    }

    public void anyMatch(){
        boolean anyHotelsInLondon = hotels.stream().anyMatch(hotel -> hotel.getCity().equals("London"));
        System.out.println(anyHotelsInLondon);
    }

    public void max(){
        hotels.stream().max(Comparator.comparing(Hotel::getPrice)).ifPresent(System.out::println);
    }

    public void min(){
        hotels.stream().min(Comparator.comparing(Hotel::getPrice)).ifPresent(System.out::println);
    }

    public void groupBy(){
        Map<String, List<Hotel>> groupByCityMap =  hotels.stream().collect(Collectors.groupingBy(Hotel::getCity));
        groupByCityMap.forEach(((city,hotel) -> {
            System.out.println(city);
            hotel.forEach(System.out::println);
        }));

    }

    public void addData(){
        hotels = (Arrays.asList(new Hotel("Park Grand","London",10,59.99),
                new Hotel("The Chilworth","London",15,65.00),
                new Hotel("The Bailey's","London",5,225.99),
                new Hotel("Rubens At The Palace","London",7,125.00),
                new Hotel("Ameritania","New York",2,175.00),
                new Hotel("Freehand New York","New York",20,185.00),
                new Hotel("Royalton","New York",6,325.00),
                new Hotel("Riu Plaza","New York",25,105.00),
                new Hotel("Holiday Inn","Toronto",12,95.00),
                new Hotel("DoubleTree","Toronto",11,99.99),
                new Hotel("Delta Hotels","Toronto",16,199.99),
                new Hotel("The Westin Harbour Castle","Toronto",35,329.99),
                new Hotel("The Clarence Park","Toronto",22,259.99),
                new Hotel("Kandy City Stay","Kandy",21,75.00),
                new Hotel("Lakewood","Kandy",15,109.99),
                new Hotel("Ceyloni Panorama Resort","Kandy",2,49.99)));
    }

    public static void main(String[] args) {
        StreamsDemo streamsDemo = new StreamsDemo();
        streamsDemo.addData();
        for (Hotel hotel: streamsDemo.hotels) {
            System.out.println(hotel.getHotelName() + "  "+ hotel.getCity());
        }

        System.out.println("--------------");
        streamsDemo.filter();

        System.out.println("--------------");
        streamsDemo.sort(false);

        System.out.println("--------------");
        streamsDemo.sort(true);

        System.out.println("--------------");
        streamsDemo.allMatch();

        System.out.println("--------------");
        streamsDemo.anyMatch();

        System.out.println("--------------");
        streamsDemo.max();

        System.out.println("--------------");
        streamsDemo.min();

        System.out.println("--------------");
        streamsDemo.groupBy();
    }

}
