class Vendor:
    datalist = []

    def __init__(self, id, name, mobile, city):
        self.id = id
        self.name = name
        self.mobile = mobile
        self.city = city

    def __str__(self):
        return "vendor id " +str(self.id) + " Name " +self.name + \
                " Mobile " +str(self.mobile) + " City " +self.city

    def addVendor(self, vendor):
        self.datalist.append(vendor)

    def show(self):
        for v in self.datalist:
            print(v)

obj = Vendor(1, '', 1, '')
v1 = Vendor(101, 'Atulya', 7608913489, 'HYD')
v2 = Vendor(102, 'Ramehs', 452589636, 'banglore')
v3 = Vendor(103, 'suresh', 489336147, 'chennai')
v4 = Vendor(104, 'ravi', 7893641725, 'pune')
obj.addVendor(v1)
obj.addVendor(v2)
obj.addVendor(v3)
obj.addVendor(v4)

obj.show()