def fibb(length):
        base = [0, 1]
        for i in range(length-2):
                base.append(base[i] + base[(i + 1)])
        print(base)
