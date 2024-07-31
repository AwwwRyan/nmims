nums=[2,7,11,15]
target=9
twoSum=[]

for i in range(0,len(nums)):
    for j in range(i+1,len(nums)):
        if (nums[i]+nums[j])==target:
            twoSum.append(i)
            twoSum.append(j)
            break

print(twoSum)