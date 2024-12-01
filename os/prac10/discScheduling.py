initial_position = 100
work_queue = [23, 89, 132, 42, 187]

total_head_movement = 0
current_position = initial_position
request_flow = [initial_position]  

for request in work_queue:
    movement = abs(request - current_position)
    total_head_movement += movement
    current_position = request
    request_flow.append(current_position)  

print("Request Entertainment Flow:")
for position in request_flow:
    if position != request_flow[-1]:
        print(position, end=" -> ")
    else:
        print(position)

print("Total Head Movement:", total_head_movement)