# time dependence jo pahele aaya voh pahele execute
# after the first proicess then see the shortest burst time

def sort_by_burst_time(processes):
    for i in range(len(processes)):
        for j in range(i + 1, len(processes)):
            if processes[i]['burst_time'] > processes[j]['burst_time']:
                processes[i], processes[j] = processes[j], processes[i]
        
processes = [
    {'name': 'P1', 'burst_time': 6},
    {'name': 'P2', 'burst_time': 8},
    {'name': 'P3', 'burst_time': 7},
    {'name': 'P4', 'burst_time': 3}
]

sort_by_burst_time(processes)
print(processes)

total_burst_time = 0
print("Process\tBurst Time\tWaiting Time\tTurnaround Time")

for process in processes:
    burst_time = process['burst_time']
        
    waiting_time = total_burst_time
        
    turnaround_time = waiting_time + burst_time
        
    print(f"{process['name']}\t{burst_time}\t\t{waiting_time}\t\t{turnaround_time}")
        
    total_burst_time += burst_time
    