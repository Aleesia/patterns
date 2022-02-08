from VolvoFactory import VolvoFactory
from SkodaFactory import SkodaFactory


if __name__ == '__main__':
    numberBuses = 20
    numberTrams = 5
    numberTrolleys = 15

    buses = []
    trams = []
    trolleybuses = []

    factory = SkodaFactory()
    #factory = VolvoFactory()

    N = 200000

    for b in range(numberBuses):
        buses.append(factory.create_bus())

    for tr in range(numberTrams):
        trams.append(factory.create_tram())

    for trolley in range(numberTrolleys):
        trolleybuses.append(factory.create_trolleybus())

    finalCostContract = 0

    for bus in buses:
        finalCostContract += bus.getCost() + bus.getUsagecost() * N

    for tram in trams:
        finalCostContract += tram.getCost() + tram.getUsagecost() * N

    for trolleybus in trolleybuses:
        finalCostContract += trolleybus.getCost() + trolleybus.getUsagecost() * N

    print(finalCostContract)