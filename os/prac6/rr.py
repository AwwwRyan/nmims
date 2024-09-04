def round_robin_scheduling(processes, burst_times, arrival_times, time_quantum):
    n = len(processes)
    remaining_times = burst_times[:]
    time = 0
    completed_processes = []
    process_queue = []

    for i in range(n):
        if arrival_times[i] <= time:
            process_queue.append(i)

    while process_queue:
        process_index = process_queue.pop(0)

        if remaining_times[process_index] <= time_quantum:
            time += remaining_times[process_index]
            remaining_times[process_index] = 0
            completed_processes.append((processes[process_index], time))
        else:
            time += time_quantum
            remaining_times[process_index] -= time_quantum
            process_queue.append(process_index)

        for i in range(n):
            if arrival_times[i] <= time and remaining_times[i] > 0 and i not in process_queue:
                process_queue.append(i)

    return completed_processes

number_of_processes = int(input("Enter the number of processes: "))

processes = []
burst_times = []
arrival_times = []

for i in range(number_of_processes):
    process_name = input(f"Enter the name of process {i + 1}: ")
    burst_time = int(input(f"Enter the burst time for {process_name}: "))
    arrival_time = int(input(f"Enter the arrival time for {process_name}: "))
    
    processes.append(process_name)
    burst_times.append(burst_time)
    arrival_times.append(arrival_time)

time_quantum = int(input("Enter the time quantum: "))

completed_processes = round_robin_scheduling(processes, burst_times, arrival_times, time_quantum)

print(completed_processes)