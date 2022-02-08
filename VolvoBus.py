from Bus import Bus


class VolvoBus(Bus):
    def __init__(self):
        super().__init__(6000000, 20)

    def run_by_road(self):
        print("run_by_road: Volvo Bus")
