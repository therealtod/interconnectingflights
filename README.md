# Interconnecting Flights

This codebase was created to implement a simple rest API with Spring Boot.
The application only accepts GET requests to the following URL:

http://<HOST>/<CONTEXT>/interconnections?departure={departure}&arrival=
{arrival}&departureDateTime={departureDateTime}&arrivalDateTime={arrivalDateTime} 

where:
- departure - a departure airport IATA code
- departureDateTime - a departure datetime in the departure airport timezone in
ISO format
- arrival - an arrival airport IATA code
- arrivalDateTime - an arrival datetime in the arrival airport timezone in ISO format


The application returns a list of Solutions (sequences of flights) departing 
from a given departure airport not
earlier than the specified departure datetime and arriving to a given arrival airport not
later than the specified arrival datetime.
The list con of:
- all direct flights if available 
- all interconnected flights with a maximum of one stop if available 

For interconnected flights the difference between the arrival and the next departure
is always 2h or greater

# Getting started

You need Java installed.

    ./gradlew bootRun
    open http://localhost:8080


# Run tests

The repository is poor on tests, please contribute by adding tests!

    ./gradlew test

# Help

Please fork and PR to improve the code.