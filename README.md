# 🛒 Buy Local

Buy Local is an Android app built to support local fast retailing stores that deal with **groceries** and **stationery items**. Developed with the modern **Jetpack Compose** toolkit and a **local SQL database**, the app is designed to provide a fast, reliable, and beautiful shopping experience directly from your phone.

---

## 🚀 Aim

Our goal is to **empower local vendors** by giving them a platform to list their inventory digitally. This app allows users to:
- Browse available groceries and stationery items.
- Add items to their cart.
- Place orders easily and efficiently.
- Support their neighborhood businesses through digital retail.

---

## 🛠 Tech Stack

- **Kotlin + Jetpack Compose** - Modern Android UI toolkit for building native UI.
- **Room (SQL Database)** - To handle all local data storage and operations.
- **MVVM Architecture** - Clean separation of concerns and easy scalability.
- **State Management** - Compose’s built-in tools for reactive UI updates.

---

## 📱 App Flow

1. **Splash Screen**
   - Displays app logo and transitions to Home screen.

2. **Home Screen**
   - Lists available product categories: *Groceries* and *Stationery*.
   - Option to search or filter items.

3. **Product Listing**
   - Shows all items under selected category.
   - Includes product name, image, price, and "Add to Cart" option.

4. **Cart**
   - Lists added products with quantity control and price summary.
   - Checkout option available.

5. **Checkout & Confirmation**
   - Summary of the order.
   - Confirmation message after successful placement.

---

## 🖼 Screenshots

| Splash Screen | Home Screen | Product List | Cart |
|---------------|-------------|--------------|------|
| ![Splash](screenshots/splash.png) | ![Home](screenshots/home.png) | ![Product](screenshots/products.png) | ![Cart](screenshots/cart.png) |

> Add your screenshots in the `/screenshots` folder and update the paths above accordingly.

---

## 📦 Folder Structure

📦 BuyLocal/ ├── 📁 data/ # Room database, DAO, Entities ├── 📁 ui/ # Composables and Screens ├── 📁 viewmodel/ # State management & business logic ├── 📁 utils/ # Constants, helpers, etc. ├── MainActivity.kt └── README.md



---

## 🧠 Future Plans

- 🛍 Add support for online payments
- 📍 Show nearby stores using Maps API
- 🔔 Push notifications for offers and order updates
- 🧾 Order history and user profiles

---



## ⭐️ Star the repo if you like our work!

