n=input()
l=[]
for i in range(0,len(n),2):
    l.append(n[i])
l.sort()
for i in range(len(l)-1):
    print(l[i]+"+",end="")
print(l[-1])