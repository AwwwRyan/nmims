processQueue=[]

def addToQueue(process):
    processQueue.append(process)
def removeFromQueue(process):
    processQueue.remove(process)

process={}

numberOfProcesses=int(input("enter the number of processes: "))

#burst time
for i in range(0,numberOfProcesses):
    processName=input("\nenter the name of the process: ")
    processQueue.append(processName)
    if processName not in process:
        processBurstTime=int(input("enter the burst time for the this process: "))
        process[processName]=[processBurstTime]

#waiting time
waitingTime=0
for i in processQueue:
    process[i].append(waitingTime)
    waitingTime+=process[i][0]

for i in processQueue:
    process[i].append(process[i][0]+process[i][1])

print("\n",processQueue)
print(process)