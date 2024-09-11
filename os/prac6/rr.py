def round_robin_scheduling(processes, burst_times, arrival_times, time_quantum):
    n = len(processes)
    remaining_times = burst_times[:]
    time = 0
    completed_processes = []
    process_queue = []
    gantt_chart = []
    completion_times = [0] * n

    for i in range(n):
        if arrival_times[i] <= time:
            process_queue.append(i)

    while process_queue:
        process_index = process_queue.pop(0)

        if remaining_times[process_index] <= time_quantum:
            gantt_chart.append((processes[process_index], time, time + remaining_times[process_index]))
            time += remaining_times[process_index]
            remaining_times[process_index] = 0
            completion_times[process_index] = time 
            completed_processes.append((processes[process_index], time))
        else:
            gantt_chart.append((processes[process_index], time, time + time_quantum))
            time += time_quantum
            remaining_times[process_index] -= time_quantum
            process_queue.append(process_index)

        for i in range(n):
            if arrival_times[i] <= time and remaining_times[i] > 0 and i not in process_queue:
                process_queue.append(i)

    waiting_times = [0] * n
    turnaround_times = [0] * n

    for i in range(n):
        turnaround_times[i] = completion_times[i] - arrival_times[i]
        waiting_times[i] = turnaround_times[i] - burst_times[i]

    average_waiting_time = sum(waiting_times) / n
    average_turnaround_time = sum(turnaround_times) / n

    return completed_processes, gantt_chart, waiting_times, turnaround_times, average_waiting_time, average_turnaround_time

def draw_gantt_chart(gantt_chart):
    chart = ""
    for process, start_time, end_time in gantt_chart:
        chart += f"{start_time} --> {process} " + "-" * (end_time - start_time) + f" {end_time}\n"
    return chart

number_of_processes = 5
# number_of_processes = int(input("Enter the number of processes: "))

processes = ['p1','p2','p3','p4','p5']
burst_times = [5, 3, 1, 2, 3]
arrival_times = [0, 1, 2, 3, 4]

# for i in range(number_of_processes):
#     process_name = input(f"Enter the name of process {i + 1}: ")
#     burst_time = int(input(f"Enter the burst time for {process_name}: "))
#     arrival_time = int(input(f"Enter the arrival time for {process_name}: "))
    
#     processes.append(process_name)
#     burst_times.append(burst_time)
#     arrival_times.append(arrival_time)

time_quantum = int(input("Enter the time quantum: "))

completed_processes, gantt_chart, waiting_times, turnaround_times, average_waiting_time, average_turnaround_time = round_robin_scheduling(
    processes, burst_times, arrival_times, time_quantum
)

print("Completed Processes:", completed_processes)
gantt_chart_text = draw_gantt_chart(gantt_chart)
print("\nGantt Chart:")
print(gantt_chart_text)

print("Waiting Times:", waiting_times)
print("Turnaround Times:", turnaround_times)
print(f"Average Waiting Time: {average_waiting_time:.2f}")
print(f"Average Turnaround Time: {average_turnaround_time:.2f}")