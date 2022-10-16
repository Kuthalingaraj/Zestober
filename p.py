import string;
def rangoli_Pattern(n):
    L=[]
    alpha = string.ascii_lowercase
    for i in range(n):
        s = "-".join(alpha[i:n])
        L.append((s[::-1]+s[1:]).center(4*n-3,"-"))
        print('\n'.join(L[:0:-1]+L))

n = int (input("Enter Number :"))
rangoli_Pattern(n);