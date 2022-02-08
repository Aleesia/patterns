from Trolleybus import Trolleybus


class VolvoTrolleybus(Trolleybus):
    def __init__(self):
        super().__init__(7000000, 31)

    def run_by_contact_network(self):
        print("run_by_contact_network: VolvoTrolleybus")
