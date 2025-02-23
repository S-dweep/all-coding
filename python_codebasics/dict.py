captains={"india":"virat","pakistan":"babar","australia":"cummins"}
print(type(captains))
print(captains)
print(captains["india"])
print(captains.keys())
print(captains.values())
captains["england"]="root"
print(captains)
for team in captains:
    print(team,"-->",captains[team])
for team,cap in captains.items():
    print(team,"-->",cap)
print("australia" in captains)
print("sri lanka" in captains)
captains.clear()
print(captains)
print(dir(captains))
captains={"india":"virat","pakistan":"babar","australia":"cummins"}
print(captains.get("india"))
print(captains.get("india","miller"))
print(captains.get("south africa","miller"))
emp={}
emp["name"]="sayandeep"
emp["age"]=21
emp["id"]=108
print(emp)