def is_safe(processes, available, max_demand, allocation, need):
    n = len(processes)
    m = len(available)
    
    work = available[:]
    
    finish = [False] * n
    
    safe_sequence = []
    
    while len(safe_sequence) < n:
        found_process = False
        for i in range(n):
            if not finish[i]:
                if all(need[i][j] <= work[j] for j in range(m)):
                    for j in range(m):
                        work[j] += allocation[i][j]
                    finish[i] = True
                    found_process = True
                    safe_sequence.append(processes[i])
                    break
        if not found_process:
            return False, []
    
    return True, safe_sequence

def bankers_algorithm():
    processes = ['P1', 'P2', 'P3', 'P4', 'P5']
    resource_types = ['A', 'B', 'C']
    
    available = [3, 3, 2] 
    
    max_demand = [
        [7, 5, 3],  
        [3, 2, 2],  
        [9, 0, 2],  
        [2, 2, 2],  
        [4, 3, 3]   
    ]
    
    allocation = [
        [0, 1, 0],
        [2, 0, 0],
        [3, 0, 2],
        [2, 1, 1],
        [0, 0, 2] 
    ]
    
    need = [[max_demand[i][j] - allocation[i][j] for j in range(3)] for i in range(5)]
    
    safe, safe_sequence = is_safe(processes, available, max_demand, allocation, need)
    
    if safe:
        print("The system is in a safe state.")
        print("Safe sequence:", " -> ".join(safe_sequence))
    else:
        print("The system is not in a safe state.")

bankers_algorithm()
