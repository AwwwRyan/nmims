def calculate_avg_times(processes, n):
    total_wt = 0
    total_tat = 0
    for process in processes:
        total_wt += process['waiting_time']
        total_tat += process['turnaround_time']
    avg_wt = total_wt / n
    avg_tat = total_tat / n
    return avg_wt, avg_tat

def sort_by_priority(processes):
    for i in range(len(processes)):
        for j in range(i + 1, len(processes)):
            if processes[i]['priority'] > processes[j]['priority']:
                processes[i], processes[j] = processes[j], processes[i]

def non_preemptive_priority_scheduling(processes):
    n = len(processes)
    sort_by_priority(processes)

    processes[0]['waiting_time'] = 0
    processes[0]['turnaround_time'] = processes[0]['burst_time']

    for i in range(1, n):
        processes[i]['waiting_time'] = processes[i-1]['waiting_time'] + processes[i-1]['burst_time']
        processes[i]['turnaround_time'] = processes[i]['waiting_time'] + processes[i]['burst_time']

    avg_wt, avg_tat = calculate_avg_times(processes, n)

    print("Non-Preemptive Priority Scheduling:")
    print("Gantt Chart: ")
    for process in processes:
        print(f"P{process['id']} ", end="")
    print("\nAverage Waiting Time:", avg_wt)
    print("Average Turnaround Time:", avg_tat)

def preemptive_priority_scheduling(processes):
    n = len(processes)
    remaining_burst_time = [process['burst_time'] for process in processes]
    time = 0
    completed = 0
    prev_process = -1
    gantt_chart = []

    while completed < n:
        index = -1
        highest_priority = float('inf')

        for i in range(n):
            if remaining_burst_time[i] > 0 and processes[i]['priority'] < highest_priority:
                highest_priority = processes[i]['priority']
                index = i

        if index == -1:
            time += 1
            continue

        if prev_process != index:
            gantt_chart.append(f"P{processes[index]['id']}")
            prev_process = index

        remaining_burst_time[index] -= 1
        time += 1

        if remaining_burst_time[index] == 0:
            completed += 1
            processes[index]['completion_time'] = time
            processes[index]['turnaround_time'] = time
            processes[index]['waiting_time'] = processes[index]['turnaround_time'] - processes[index]['burst_time']

    avg_wt, avg_tat = calculate_avg_times(processes, n)

    print("\nPreemptive Priority Scheduling:")
    print("Gantt Chart: ")
    for item in gantt_chart:
        print(item, end=" ")
    print("\nAverage Waiting Time:", avg_wt)
    print("Average Turnaround Time:", avg_tat)

processes = [
    {'id': 1, 'burst_time': 10, 'priority': 3, 'waiting_time': 0, 'turnaround_time': 0},
    {'id': 2, 'burst_time': 1, 'priority': 1, 'waiting_time': 0, 'turnaround_time': 0},
    {'id': 3, 'burst_time': 2, 'priority': 4, 'waiting_time': 0, 'turnaround_time': 0},
    {'id': 4, 'burst_time': 1, 'priority': 5, 'waiting_time': 0, 'turnaround_time': 0},
    {'id': 5, 'burst_time': 5, 'priority': 2, 'waiting_time': 0, 'turnaround_time': 0}
]

non_preemptive_priority_scheduling(processes)

#reset
for process in processes:
    process['waiting_time'] = 0
    process['turnaround_time'] = 0

preemptive_priority_scheduling(processes)
