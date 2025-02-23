sweet=['kajubarfi','rasgulla','gulabjamun','rasmalai']
print(type(sweet))
print(sweet[0])
print(sweet[2])
print(sweet[-2])
print(sweet[1:3])
print(sweet[:3])
print(sweet[:])
print(sweet[-3:])
print(len(sweet))
print('samosa' in sweet)
print('gulabjamun' in sweet)
print('kheer' not in sweet)
sweet.append('laddu')
print(sweet)
sweet.insert(2,'sandesh')
print(sweet)
spicy=['samosa','golgappe']
print(spicy)
food=spicy+sweet #can only concatenate list to list
print(food)
sweet[0]='chomchom' #this cannot be done with string but can be done with list
print(sweet)
sweet[0:2]='rajbhog'
print(sweet)
print(sweet[0:7])
sweet[0:7]=['jalebi']
print(sweet)
sweet[0:2]=['pantua']
print(sweet)
sweet[0:2]=[1,2,4]
print(sweet)
print(type(sweet[0]))
print(type(sweet[4]))
print(sweet.index('rasmalai'))
sweet.reverse()
print(sweet)
print(dir(sweet))