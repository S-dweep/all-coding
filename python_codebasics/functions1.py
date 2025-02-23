def totalexp(exp):
    total=0
    for i in exp:
        total+=i
    return total

sm_exp=[20,35,27]
up_exp=[17,22,64]

smtotal=totalexp(sm_exp)
uptotal=totalexp(up_exp)

print(smtotal)
print(uptotal)
print(help(totalexp))