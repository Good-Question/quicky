def unique(ints):
    new_ints = []
    cur = None
    for i in ints:
        if i != cur:
            new_ints.append(i)
            cur = i
    return new_ints

i = unique([1,1,1,1,1,1])
print i
j = unique([1,1,2,2,3,3])
print j
k = unique([1,2,3,4,5,6])
print k
