from TransportFactory import TransportFactory
from SkodaTram import SkodaTram
from SkodaBus import SkodaBus
from SkodaTrolleybus import SkodaTrolleybus


class SkodaFactory(TransportFactory):
    def create_bus(self):
        return SkodaBus()

    def create_tram(self):
        return SkodaTram()

    def create_trolleybus(self):
        return SkodaTrolleybus()