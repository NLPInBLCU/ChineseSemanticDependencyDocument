


###也就是求所有ABA子串的个数


##要求从中心出发：并且|A|>=K

#也就是s[i+1:i+K]=s[i-k:i]
s = input()
i=3
k=2
print(s[i+1:i+k+1])
if i-k>0:
	print(s[i-k:i])

# K = int(input())