f=open("C:/Users/Sayandeep Mondal/OneDrive/Desktop/coding/python_codebasics/fun.txt", "r")
lines=f.readlines()
print(lines)
f.close()
f=open("C:/Users/Sayandeep Mondal/OneDrive/Desktop/coding/python_codebasics/fun.txt", "w")
f.write("i love you beby")
f.close()
f=open("C:/Users/Sayandeep Mondal/OneDrive/Desktop/coding/python_codebasics/fun.txt", "w")
f.write("i love you janemon")
f.close()
f=open("C:/Users/Sayandeep Mondal/OneDrive/Desktop/coding/python_codebasics/fun.txt", "a")
f.write("\nomago turu lobh")
f.close()
f=open("C:/Users/Sayandeep Mondal/OneDrive/Desktop/coding/python_codebasics/fun.txt", "w")
f.writelines(["i love you beby","\nsona amar","\namar mon tomar jonne kemon kortase"])
f.close()
with open("C:/Users/Sayandeep Mondal/OneDrive/Desktop/coding/python_codebasics/fun.txt","r") as f:
    lines=f.readlines()
f.close()
