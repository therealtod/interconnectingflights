package two.task.interconnectingflights;

public class Constants {
    public static final String routesApiResponse = "[\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"AAR\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"ACE\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CANARY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"LPA\",\n" +
            "            \"MLA\",\n" +
            "            \"NCE\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"AGP\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"ACE\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"LPA\",\n" +
            "            \"MLA\",\n" +
            "            \"NCE\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"ALC\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"ACE\",\n" +
            "            \"AGP\",\n" +
            "            \"FAO\",\n" +
            "            \"LPA\",\n" +
            "            \"MLA\",\n" +
            "            \"NCE\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"AMS\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BVA\",\n" +
            "            \"CPH\",\n" +
            "            \"CRL\",\n" +
            "            \"LIS\",\n" +
            "            \"LPL\",\n" +
            "            \"SXF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"ATH\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BGY\",\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"OPO\",\n" +
            "            \"STN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BCN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"MAD\",\n" +
            "            \"OPO\",\n" +
            "            \"SVQ\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BDS\",\n" +
            "        \"connectingAirport\": \"BGY\",\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BGY\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BLQ\",\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"MAD\",\n" +
            "            \"OTP\",\n" +
            "            \"TSF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BHX\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"CPH\",\n" +
            "            \"GLA\",\n" +
            "            \"LPL\",\n" +
            "            \"MAD\",\n" +
            "            \"MAN\",\n" +
            "            \"STN\",\n" +
            "            \"SXF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BIQ\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BJV\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BLL\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BLQ\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"MAD\",\n" +
            "            \"OPO\",\n" +
            "            \"SVQ\",\n" +
            "            \"TSF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BOD\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BOH\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BRE\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BRI\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BRS\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BHX\",\n" +
            "            \"CPH\",\n" +
            "            \"GLA\",\n" +
            "            \"LPL\",\n" +
            "            \"MAN\",\n" +
            "            \"STN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BRU\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"CPH\",\n" +
            "            \"LIS\",\n" +
            "            \"MAD\",\n" +
            "            \"OPO\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BSL\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BVA\",\n" +
            "            \"CPH\",\n" +
            "            \"CRL\",\n" +
            "            \"HHN\",\n" +
            "            \"OPO\",\n" +
            "            \"SXF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BTS\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BUD\",\n" +
            "            \"CRL\",\n" +
            "            \"KRK\",\n" +
            "            \"LIS\",\n" +
            "            \"OTP\",\n" +
            "            \"PRG\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BUD\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BTS\",\n" +
            "            \"CIA\",\n" +
            "            \"CPH\",\n" +
            "            \"CRL\",\n" +
            "            \"OTP\",\n" +
            "            \"PRG\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BVA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BGY\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"LIS\",\n" +
            "            \"MAD\",\n" +
            "            \"OTP\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"BZG\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"EDI\",\n" +
            "            \"HHN\",\n" +
            "            \"KRK\",\n" +
            "            \"MAN\",\n" +
            "            \"OTP\",\n" +
            "            \"STN\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"CAG\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"CCF\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"CPH\",\n" +
            "            \"EDI\",\n" +
            "            \"LIS\",\n" +
            "            \"STN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"CGN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"CPH\",\n" +
            "            \"CRL\",\n" +
            "            \"HHN\",\n" +
            "            \"OPO\",\n" +
            "            \"OTP\",\n" +
            "            \"SXF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"CHQ\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"CIA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BGY\",\n" +
            "            \"BVA\",\n" +
            "            \"CRL\",\n" +
            "            \"LIS\",\n" +
            "            \"MAD\",\n" +
            "            \"OTP\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"CPH\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BGY\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"LIS\",\n" +
            "            \"STN\",\n" +
            "            \"SXF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"CRL\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"CPH\",\n" +
            "            \"LIS\",\n" +
            "            \"MAD\",\n" +
            "            \"OPO\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"CWL\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"DBV\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"DLM\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"EDI\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"GLA\",\n" +
            "            \"LIS\",\n" +
            "            \"LPL\",\n" +
            "            \"STN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"EIN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AMS\",\n" +
            "            \"BCN\",\n" +
            "            \"BGY\",\n" +
            "            \"CGN\",\n" +
            "            \"CRL\",\n" +
            "            \"OPO\",\n" +
            "            \"OTP\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"EMA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BHX\",\n" +
            "            \"GLA\",\n" +
            "            \"LPL\",\n" +
            "            \"MAN\",\n" +
            "            \"OTP\",\n" +
            "            \"STN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"FAO\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"ACE\",\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"MLA\",\n" +
            "            \"NCE\",\n" +
            "            \"OPO\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"FMM\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BVA\",\n" +
            "            \"CGN\",\n" +
            "            \"CIA\",\n" +
            "            \"HHN\",\n" +
            "            \"OPO\",\n" +
            "            \"TSF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"FRA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"FUE\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CANARY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"ACE\",\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"LPA\",\n" +
            "            \"MLA\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"GDN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"KRK\",\n" +
            "            \"LIS\",\n" +
            "            \"OPO\",\n" +
            "            \"OTP\",\n" +
            "            \"STN\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"GLA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BHX\",\n" +
            "            \"CRL\",\n" +
            "            \"EDI\",\n" +
            "            \"LIS\",\n" +
            "            \"LPL\",\n" +
            "            \"MAN\",\n" +
            "            \"STN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"GNB\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"GOT\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"GRO\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"HAM\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"HHN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BLQ\",\n" +
            "            \"BUD\",\n" +
            "            \"CGN\",\n" +
            "            \"CRL\",\n" +
            "            \"OPO\",\n" +
            "            \"OTP\",\n" +
            "            \"SXF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"IBZ\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"INN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"KBP\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"KRK\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BTS\",\n" +
            "            \"CIA\",\n" +
            "            \"LIS\",\n" +
            "            \"OTP\",\n" +
            "            \"PRG\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"KTW\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"KRK\",\n" +
            "            \"LIS\",\n" +
            "            \"LPL\",\n" +
            "            \"MAN\",\n" +
            "            \"OTP\",\n" +
            "            \"STN\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"KUN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"HHN\",\n" +
            "            \"LPL\",\n" +
            "            \"MAD\",\n" +
            "            \"MAN\",\n" +
            "            \"RIX\",\n" +
            "            \"STN\",\n" +
            "            \"VNO\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LBA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BHX\",\n" +
            "            \"GLA\",\n" +
            "            \"LPL\",\n" +
            "            \"MAN\",\n" +
            "            \"OTP\",\n" +
            "            \"STN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LCJ\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"KRK\",\n" +
            "            \"MAN\",\n" +
            "            \"OTP\",\n" +
            "            \"PRG\",\n" +
            "            \"STN\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LDE\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LEI\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LGW\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BHX\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"EDI\",\n" +
            "            \"GLA\",\n" +
            "            \"LIS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LIS\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BGY\",\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"MAD\",\n" +
            "            \"OPO\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LPA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CANARY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"ACE\",\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"FUE\",\n" +
            "            \"MLA\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LPL\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AMS\",\n" +
            "            \"BCN\",\n" +
            "            \"BHX\",\n" +
            "            \"EDI\",\n" +
            "            \"GLA\",\n" +
            "            \"KRK\",\n" +
            "            \"MAN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LRH\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LTN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BHX\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"EDI\",\n" +
            "            \"GLA\",\n" +
            "            \"LIS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LUX\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"LUZ\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"MAD\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BGY\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"LIS\",\n" +
            "            \"OPO\",\n" +
            "            \"SVQ\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"MAN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AMS\",\n" +
            "            \"BGY\",\n" +
            "            \"BHX\",\n" +
            "            \"CRL\",\n" +
            "            \"GLA\",\n" +
            "            \"LPL\",\n" +
            "            \"STN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"MJV\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BHX\",\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"LGW\",\n" +
            "            \"LPL\",\n" +
            "            \"PRG\",\n" +
            "            \"STN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"MLA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"ACE\",\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"LPA\",\n" +
            "            \"NCE\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"MRS\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"MUC\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"MXP\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"NAP\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"NCE\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"NCL\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AMS\",\n" +
            "            \"BHX\",\n" +
            "            \"EDI\",\n" +
            "            \"GLA\",\n" +
            "            \"LPL\",\n" +
            "            \"MAN\",\n" +
            "            \"PRG\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"NTE\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AMS\",\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"LGW\",\n" +
            "            \"OPO\",\n" +
            "            \"PRG\",\n" +
            "            \"STN\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"OPO\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BGY\",\n" +
            "            \"CRL\",\n" +
            "            \"LIS\",\n" +
            "            \"MAD\",\n" +
            "            \"OTP\",\n" +
            "            \"SXF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"OTP\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BUD\",\n" +
            "            \"BVA\",\n" +
            "            \"CIA\",\n" +
            "            \"HHN\",\n" +
            "            \"MAD\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"PFO\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"PIS\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"PMI\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"PMO\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"POZ\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"CIA\",\n" +
            "            \"KRK\",\n" +
            "            \"OTP\",\n" +
            "            \"PRG\",\n" +
            "            \"STN\",\n" +
            "            \"SXF\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"PRG\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BTS\",\n" +
            "            \"BUD\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"KRK\",\n" +
            "            \"LIS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"PSA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"RAK\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"RDZ\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"REU\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"RIX\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BTS\",\n" +
            "            \"CGN\",\n" +
            "            \"CPH\",\n" +
            "            \"HHN\",\n" +
            "            \"OTP\",\n" +
            "            \"VNO\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"RMU\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"RYG\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"RZE\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AMS\",\n" +
            "            \"EDI\",\n" +
            "            \"KRK\",\n" +
            "            \"LGW\",\n" +
            "            \"OTP\",\n" +
            "            \"STN\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"SDR\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"SEN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"SKG\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"SOF\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"SPU\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"STN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"UKP\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"BHX\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"EDI\",\n" +
            "            \"GLA\",\n" +
            "            \"LIS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"STR\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"SUF\",\n" +
            "        \"connectingAirport\": \"BGY\",\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"SVQ\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BGY\",\n" +
            "            \"BLQ\",\n" +
            "            \"CIA\",\n" +
            "            \"LIS\",\n" +
            "            \"MAD\",\n" +
            "            \"OPO\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"SXF\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AMS\",\n" +
            "            \"BCN\",\n" +
            "            \"CGN\",\n" +
            "            \"CPH\",\n" +
            "            \"CRL\",\n" +
            "            \"LIS\",\n" +
            "            \"OPO\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"SZG\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"SZZ\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AMS\",\n" +
            "            \"KRK\",\n" +
            "            \"LGW\",\n" +
            "            \"OTP\",\n" +
            "            \"STN\",\n" +
            "            \"SXF\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"TFS\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CANARY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"ACE\",\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"FUE\",\n" +
            "            \"LPA\",\n" +
            "            \"MLA\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"TLL\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"TLS\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"TRN\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"TSF\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BCN\",\n" +
            "            \"BGY\",\n" +
            "            \"BLQ\",\n" +
            "            \"BUD\",\n" +
            "            \"CIA\",\n" +
            "            \"CRL\",\n" +
            "            \"OTP\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"TUF\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"VGO\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CITY\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"VIE\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"VLC\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"VNO\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AMS\",\n" +
            "            \"BLQ\",\n" +
            "            \"HHN\",\n" +
            "            \"LGW\",\n" +
            "            \"RIX\",\n" +
            "            \"STN\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"WMI\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"CRL\",\n" +
            "            \"KRK\",\n" +
            "            \"LIS\",\n" +
            "            \"MAD\",\n" +
            "            \"OTP\",\n" +
            "            \"SXF\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"WRO\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"ETHNIC\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"BGY\",\n" +
            "            \"KRK\",\n" +
            "            \"LIS\",\n" +
            "            \"OTP\",\n" +
            "            \"PRG\",\n" +
            "            \"SXF\",\n" +
            "            \"WMI\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DUB\",\n" +
            "        \"airportTo\": \"ZAD\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"LEISURE\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    }\n" +
            "]";

    public static final String airportAAARoutes = "[\n" +
            "    {\n" +
            "        \"airportFrom\": \"AAA\",\n" +
            "        \"airportTo\": \"BBB\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"AAA\",\n" +
            "        \"airportTo\": \"CCC\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CANARY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"LPA\",\n" +
            "            \"MLA\",\n" +
            "            \"NCE\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"AAA\",\n" +
            "        \"airportTo\": \"DDD\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CANARY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"LPA\",\n" +
            "            \"MLA\",\n" +
            "            \"NCE\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    }]";

    public static final String airportBBBRoutes = "[\n" +
            "    {\n" +
            "        \"airportFrom\": \"BBB\",\n" +
            "        \"airportTo\": \"DDD\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"BBB\",\n" +
            "        \"airportTo\": \"AAA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CANARY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"LPA\",\n" +
            "            \"MLA\",\n" +
            "            \"NCE\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    }]";

    public static final String airportCCCRoutes = "[\n" +
            "    {\n" +
            "        \"airportFrom\": \"CCC\",\n" +
            "        \"airportTo\": \"BBB\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"CCC\",\n" +
            "        \"airportTo\": \"AAA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CANARY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"LPA\",\n" +
            "            \"MLA\",\n" +
            "            \"NCE\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    }]";

    public static final String airportDDDRoutes = "[\n" +
            "    {\n" +
            "        \"airportFrom\": \"DDD\",\n" +
            "        \"airportTo\": \"BBB\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"GENERIC\",\n" +
            "        \"similarArrivalAirportCodes\": [],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"airportFrom\": \"DDD\",\n" +
            "        \"airportTo\": \"AAA\",\n" +
            "        \"connectingAirport\": null,\n" +
            "        \"newRoute\": false,\n" +
            "        \"seasonalRoute\": false,\n" +
            "        \"operator\": \"RYANAIR\",\n" +
            "        \"group\": \"CANARY\",\n" +
            "        \"similarArrivalAirportCodes\": [\n" +
            "            \"AGP\",\n" +
            "            \"ALC\",\n" +
            "            \"FAO\",\n" +
            "            \"LPA\",\n" +
            "            \"MLA\",\n" +
            "            \"NCE\",\n" +
            "            \"TFS\"\n" +
            "        ],\n" +
            "        \"tags\": [],\n" +
            "        \"carrierCode\": \"FR\"\n" +
            "    }]";

    public static final String schedulesAPIresponse = "{\"month\":12,\"days\":[{\"day\":3,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"14:50\",\"arrivalTime\":\"16:35\"}]},{\"day\":5,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"13:40\",\"arrivalTime\":\"15:25\"}]},{\"day\":7,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"11:40\",\"arrivalTime\":\"13:25\"}]},{\"day\":10,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"14:50\",\"arrivalTime\":\"16:35\"}]},{\"day\":12,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"13:40\",\"arrivalTime\":\"15:25\"}]},{\"day\":14,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"11:40\",\"arrivalTime\":\"13:25\"}]},{\"day\":17,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"14:50\",\"arrivalTime\":\"16:35\"}]},{\"day\":19,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"13:40\",\"arrivalTime\":\"15:25\"}]},{\"day\":21,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"11:40\",\"arrivalTime\":\"13:25\"}]},{\"day\":24,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"16:05\",\"arrivalTime\":\"17:50\"}]},{\"day\":26,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"14:30\",\"arrivalTime\":\"16:15\"}]},{\"day\":28,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"11:40\",\"arrivalTime\":\"13:25\"}]},{\"day\":31,\"flights\":[{\"carrierCode\":\"FR\",\"number\":\"8373\",\"departureTime\":\"14:50\",\"arrivalTime\":\"16:35\"}]}]}";

}
