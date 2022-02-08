from Bus import Bus


class SkodaBus(Bus):
    def __init__(self):
        super().__init__(4500000, 25)

    def run_by_road(self):
        print("run_by_road: Skoda Bus")
