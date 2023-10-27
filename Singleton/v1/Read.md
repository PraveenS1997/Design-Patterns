Steps to make a class Singleton:

    1. Make the constructor private
    2. Create a static method to return the DatabaseConnection instance
    3. Create a static variable of type DatabaseConnection & initialize with null
    4. Have checks in the getInstance() method,
        - If the object is created -> return
        - else -> create new object & return

