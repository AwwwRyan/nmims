# Aryan Srivastava
# B3 A073
def is_valid_ip(ip):
    parts = ip.split('.')
    
    if len(parts) != 4:
        return False
    
    for part in parts:
        if not part.isdigit(): 
            return False
        num = int(part)
        if num < 0 or num > 255:
            return False
    
    return True

def classify_ip(ip):
    first_octet = int(ip.split('.')[0])
    
    if first_octet >= 1 and first_octet <= 126:
        return "Class A"
    elif first_octet >= 128 and first_octet <= 191:
        return "Class B"
    elif first_octet >= 192 and first_octet <= 223:
        return "Class C"
    elif first_octet >= 224 and first_octet <= 239:
        return "Class D"
    else:
        return "Class E"
    
def ip_to_binary(ip):
    binary_ip = ""
    
    parts = ip.split('.')
    
    for part in parts:
        number = int(part)
        binary_part = ""
        
        while number > 0:
            remainder = number % 2
            binary_part = str(remainder) + binary_part
            number = number // 2
        
        while len(binary_part) < 8:
            binary_part = "0" + binary_part
        
        binary_ip += binary_part + "."
    
    binary_ip = binary_ip[:-1]
    
    return binary_ip

def binary_to_ip(binary_ip):
    decimal_ip = ""
    
    for part in binary_ip.split('.'):
        decimal_part = str(int(part, 2))  
        decimal_ip += decimal_part + "."
    
    decimal_ip = decimal_ip[:-1]
    
    return decimal_ip

ip = input("Enter an IP address: ")
    
if is_valid_ip(ip):
    print(f"The IP address {ip} is valid.")
        
    ip_class = classify_ip(ip)
    print(f"The IP address {ip} belongs to {ip_class}.")
        
    binary_ip = ip_to_binary(ip)
    print(f"The IP address {ip} in binary is {binary_ip}.")
        
    decimal_ip = binary_to_ip(binary_ip)
    print(f"The binary IP address {binary_ip} converted back to decimal is {decimal_ip}.")
else:
    print(f"The IP address {ip} is not valid.")