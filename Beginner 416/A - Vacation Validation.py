#  https://atcoder.jp/contests/abc416/tasks/abc416_a

n, l, r = map(int, input().strip().split())
s = input().strip()
flag = True

for i in range(l-1, r):
    if s[i] != "o":
        flag = False
        break

if flag:
    print("Yes")        
else:
    print("No")    