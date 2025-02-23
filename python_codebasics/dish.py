indian=["samosa","vadapav","idli"]
pakistani=["nihari","paya","karahi"]
bangladeshi=["pantabhat","muitha","sutki"]

dish=input("enter dish: ")

if dish in indian:
    print(f"{dish} is indian")
elif dish in pakistani:
    print(f"{dish} is pakistani")
elif dish in bangladeshi:
    print(f"{dish} is bangladeshi")
else:
    print(f"{dish} unidentified")