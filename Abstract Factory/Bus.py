class Bus:
    def __init__(self, cost, usagecost):
        self.cost = cost
        self.usagecost = usagecost

    def getCost(self):
        return self.cost

    def getUsagecost(self):
        return self.usagecost

    def run_by_road(self):
        pass
