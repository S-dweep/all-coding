def cylinder_volume(r,h):
    volume=3.14*(r**2)*h
    return volume

r=float(input("enter radius: "))
h=float(input("enter height: "))
print("volume : ",cylinder_volume(r,h))