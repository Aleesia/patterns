from TransportFactory import TransportFactory
from VolvoBus import VolvoBus
from VolvoTram import VolvoTram
from VolvoTrolleybus import VolvoTrolleybus


class VolvoFactory(TransportFactory):
    def __init__(self):
        pass

    def create_bus(self):
        return VolvoBus()

    def create_tram(self):
        return VolvoTram()

    def create_trolleybus(self):
        return VolvoTrolleybus()
