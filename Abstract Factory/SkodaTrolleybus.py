from Trolleybus import Trolleybus


class SkodaTrolleybus(Trolleybus):
    def __init__(self):
        super().__init__(6800000, 13)

    def run_by_contact_network(self):
        print("run_by_contact_network: Skoda Trolleybus")
