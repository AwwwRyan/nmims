function ValidateContactForm() {
    const username = document.getElementById('Username').value;
    const password = document.getElementById('Password').value;
    const email = document.getElementById('Email').value;
    const aadhar = document.getElementById('Aadhar').value;
    const pan = document.getElementById('PAN').value;
    const phone = document.getElementById('Phone').value;

    const usernameRegex = /^[a-zA-Z0-9]{3,}$/;
    if (usernameRegex.test(username) == false) {
        alert('Username must be at least 3 characters long and contain only letters and numbers.');
        return false;
    }

    const passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$/;
    if (passwordRegex.test(password) == false) {
        alert('Password must be at least 6 characters long and contain at least one letter and one number.');
        return false;
    }

    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (emailRegex.test(email) == false) {
        alert('Please enter a valid email address.');
        return false;
    }

    const aadharRegex = /^\d{12}$/;
    if (aadharRegex.test(aadhar) == false) {
        alert('Aadhar must be exactly 12 digits.');
        return false;
    }

    const panRegex = /^[A-Z]{5}\d{4}[A-Z]$/;
    if (panRegex.test(pan) == false) {
        alert('PAN must be in the format ABCDE1234F.');
        return false;
    }

    const phoneRegex = /^\d{10}$/;
    if (phoneRegex.test(phone) == false) {
        alert('Phone number must be exactly 10 digits.');
        return false;
    }

    alert("submitted")

    return true;
}
