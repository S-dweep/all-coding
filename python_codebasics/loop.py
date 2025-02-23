expenses=[1200,1500,1300,1700]
total=0
for i in expenses:
    total=total+i
    
print(total)

for i in range(10):
    print(i)
    
for i in range(len(expenses)):
    print(f"month {i+1}, expense: {expenses[i]}")
    total+=expenses[i]
    
print(total)

keyLoc="chair"
location=["sofa","garage","chair","table","closet"]
k=0

for loc in location:
    if keyLoc==loc:
        print("found in",loc)
        k=1
        break
    
if k==0:
    print("not found")
    
for i in range(11):
    if i%2==0:
        continue
    print(i)

n=0
while n<10:
    print(n)
    n+=1