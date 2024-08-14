processQueue = []

def addToQueue(process):
    processQueue.append(process)

def removeFromQueue(process):
    processQueue.remove(process)

process = {}

numberOfProcesses = int(input("Enter the number of processes: "))

for i in range(numberOfProcesses):
    processName = input("\nEnter the name of the process: ")
    if processName not in process:
        processBurstTime = int(input("Enter the burst time for this process: "))
        process[processName] = [processBurstTime]
        addToQueue(processName)

waitingTime = 0
totalWaitingTime = 0
totalTurnaroundTime = 0

for processName in processQueue:
    process[processName].append(waitingTime)  
    totalWaitingTime += waitingTime  
    waitingTime += process[processName][0] 

for processName in processQueue:
    burstTime = process[processName][0]
    waitingTime = process[processName][1]
    turnaroundTime = burstTime + waitingTime
    process[processName].append(turnaroundTime)
    totalTurnaroundTime += turnaroundTime 
    
averageWaitingTime = totalWaitingTime / numberOfProcesses
averageTurnaroundTime = totalTurnaroundTime / numberOfProcesses

print("\nProcess: [Burst Time, Waiting Time, Turnaround Time]")
for processName, times in process.items():
    print(f"{processName}: {times}")

print(f"\nAverage Waiting Time: {averageWaitingTime}")
print(f"Average Turnaround Time: {averageTurnaroundTime}")
