from Tram import Tram


class VolvoTram(Tram):
    def __init__(self):
        super().__init__(10000000, 7)

    def run_by_rails(self):
        print("run_by_rails: Volvo Tram")
