# Ease-Stay-Project

Hotel Administer (superuser or top-level admin per hotel group) can:

Perform CRUD on Hotels

Create Hotel Managers (with login credentials)

Hotel Managers (per individual hotel) can:

Perform CRUD on Rooms, Bookings, Pricing for their assigned hotel

B2C Users can:

Browse hotels, search/filter rooms, and book them


💡 Use Case: Bargaining Feature
🔄 Workflow:
User selects a room and clicks “Negotiate Price”.

User submits an offer (e.g., ₹1800 instead of ₹2000).

Hotel Manager gets notified and can:

Accept the offer (user books at the new price)

Reject the offer (user sees rejection)

Counter offer (e.g., ₹1900 → user accepts/rejects)

If accepted, user proceeds to booking with the agreed price.
-----------------------------------------------------------------







Project Name: EASE Stay
Client: EASE Stay
Tech Stack: React.js (Frontend), Spring Boot (Backend), MySQL (Database)
________________________________________
1. Introduction
This document outlines the development plan and structure for a hotel management website designed to simplify the booking process, manage room availability, and enhance user engagement. The platform will support both customers and hotel staff (admins).
________________________________________
2. Objectives
•	Provide a seamless room booking experience for customers.
•	Allow admin users to manage rooms, bookings, and customer information.
•	Display hotel services, rooms, and contact information in an attractive layout.
•	Integrate secure authentication for admin access.
•	Enable communication between customers and hotel staff for personalized offers and price negotiation.
________________________________________
3. Features
3.1 Customer Features
•	Home page with welcome message and hotel highlights
•	Browse available rooms with filters
•	View individual room details
•	Online room booking form
•	Contact page with form and hotel information
•	Real-time chat or messaging feature to communicate with hotel staff for inquiries and bargain requests
3.2 Admin Features
•	Login authentication
•	Admin dashboard for managing rooms and bookings
•	Add, update, delete room entries
•	View list of bookings with details
________________________________________
4. Technology Stack
Frontend
•	React.js (Vite setup)
•	Tailwind CSS for UI styling
•	Axios for API calls
•	React Router for navigation
Backend
•	Spring Boot (Java)
•	Spring Data JPA
•	Spring Security (optional for admin login)
•	MySQL Database
•	REST APIs with JSON responses
________________________________________
5. Route Map
 <br>Customer Routes
 Component	Description
Home	       Homepage with overview
About	       Info about the hotel
Rooms	       List all available rooms
Room Details   View single room details
Booking Form    Book a room
Contact	        Contact form and info
Admin Routes
Component	Description
Login	        Admin login page
Admin Dashboard	Admin room & booking manager
________________________________________
6. Database Structure
Tables:
•	Users (id, name, email, password, role)
•	Rooms (id, name, description, price, status, image_url)
•	Bookings (id, user_id, room_id, checkin_date, checkout_date, guests)
•	Messages (id, user_id, admin_id, content, timestamp) (for chat/bargain communication)
________________________________________
7. API Endpoints (Sample)
Public APIs
•	Get list of rooms
•	Get room details
•	Submit booking form
•	Send message to hotel staff
•	Fetch messages for a user
Admin APIs
•	Login as admin
•	Add new room
•	Update room
•	Delete room
•	Get all bookings
•	View communication with customers
________________________________________
8. Deployment Plan
•	Frontend: Vercel or Netlify
•	Backend: Render, Railway, or deployed on VPS
•	Database: Hosted MySQL (e.g., ClearDB or Railway DB)
________________________________________
9. Payment gateway
•	Payment gateway integration
•	Email confirmation on booking
•	Room availability calendar
•	Role-based admin system
•	Multi-language support
•	AI-powered chat assistant for customer inquiries
________________________________________
src
└── main
    └── java
        └── com.example.New_Esae_Stay
            ├── controller   (API Layer)
            ├── service       (Business Layer)
            ├── repository    (Database Layer)
            └── entity        (Table Models)
    └── resources
        ├── application.properties (for DB connection)


<img width="463" alt="image" src="https://github.com/user-attachments/assets/1f5701c4-9fb6-4f33-853f-b2275d72ee1d" />
<img width="281" alt="image" src="https://github.com/user-attachments/assets/d3c8c138-6939-418c-8ed8-1a42bd7bc0ea" />
<img width="299" alt="image" src="https://github.com/user-attachments/assets/2a83d46c-6b37-4cd4-bc64-06e2771928b1" />
<img width="355" alt="image" src="https://github.com/user-attachments/assets/6538def6-76ce-4d0c-bd1b-4d1f707604bf" />
<img width="245" alt="image" src="https://github.com/user-attachments/assets/802147d8-2009-4f9f-bc6a-27e130f528f1" />






