Bus Reservation System Using Java (Loops Only)
Overview
This Bus Reservation System is a Java-based application that enables users to book bus tickets while ensuring automatic seat allocation based on age. 
The system follows a simple structure using loops (if and nested if-else) to handle logic without relying on external libraries or databases.

Key Features
✅ User Authentication – Users can register and log in using basic credentials.
✅ Travel Details – Includes destination, pickup point, seat availability, and bus operator name.
✅ Seat Availability Check – Displays available seats before booking.
✅ Age-Based Seat Allocation –

Age ≤ 10 → Lower Berth
Age 10 - 50 → Upper Berth
Age > 50 → Lower Berth
✅ Simple Logic Implementation – Uses loops, if-else conditions, and basic input handling.

How It Works
User Registration & Login
--------------------------
New users register with basic details.
--------------------------------------
Registered users can log in using stored credentials.
Booking Process

Users select destination & pickup point.
----------------------------------------
The system checks seat availability before proceeding.
Based on the user's age, the system assigns a lower or upper berth automatically.
Seat Allocation Logic

If the user is ≤ 10 years, they get a Lower Berth.
If the user is between 10 and 50 years, they get an Upper Berth.
If the user is above 50 years, they are assigned a Lower Berth.
Booking Confirmation

The system confirms the booking and displays the seat details.

Technologies Used
🟢 Java (Core Java) – No external libraries, only loops and if-else conditions.
🟢 Console-Based Application – Uses standard input/output for interaction.

This is the output of the java application 
![image](https://github.com/user-attachments/assets/d7a78eab-bb30-4a05-a495-ee81819a714e)

![image](https://github.com/user-attachments/assets/d3c7b4ee-8f92-4f91-8608-d0e19fc31ac1)
