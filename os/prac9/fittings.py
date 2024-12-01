def first_fit(memory_blocks, process_sizes):
    allocation = [-1] * len(process_sizes)  
    for i in range(len(process_sizes)):
        for j in range(len(memory_blocks)):
            if memory_blocks[j] >= process_sizes[i]:  
                allocation[i] = j  
                memory_blocks[j] -= process_sizes[i]  
                break
    return allocation


def worst_fit(memory_blocks, process_sizes):
    allocation = [-1] * len(process_sizes)  
    for i in range(len(process_sizes)):
        worst_index = -1
        for j in range(len(memory_blocks)):
            if memory_blocks[j] >= process_sizes[i]:  
                if worst_index == -1 or memory_blocks[j] > memory_blocks[worst_index]:
                    worst_index = j  
        if worst_index != -1:  
            allocation[i] = worst_index
            memory_blocks[worst_index] -= process_sizes[i]  
    return allocation


def display_allocation(process_sizes, allocation):
    print("\nProcess No.\tProcess Size\tBlock No.")
    for i in range(len(process_sizes)):
        if allocation[i] != -1:
            print(f"   {i+1}   \t   {process_sizes[i]}   \t   {allocation[i]+1}")
        else:
            print(f"   {i+1}   \t   {process_sizes[i]}   \t   Not Allocated")


memory_blocks = [10, 20, 15, 25, 30]  
process_sizes = [12, 18, 5, 35]  

print("First Fit Allocation:")
ff_memory_blocks = memory_blocks.copy()
ff_allocation = first_fit(ff_memory_blocks, process_sizes)
display_allocation(process_sizes, ff_allocation)

print("\nWorst Fit Allocation:")
wf_memory_blocks = memory_blocks.copy()
wf_allocation = worst_fit(wf_memory_blocks, process_sizes)
display_allocation(process_sizes, wf_allocation)