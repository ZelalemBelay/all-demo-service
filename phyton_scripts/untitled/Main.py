# Define a list of employees as dictionaries
# All will be part of a criteria object.
employees1 = [
    {"name": "Alice", "salary": 70000},
    {"name": "Bob", "salary": 50000},
    {"name": "Charlie", "salary": 90000},
    {"name": "Diana", "salary": 60000}
]

# Ask the user for a salary threshold

# threshold = int(input("Enter minimum salary to filter: "))

# Filter and print employees with salary >= threshold
# print("\nEmployees earning at least", threshold)
# for emp in employees1:
#     if emp["salary"] >= threshold:
        # print(f"{emp['name']} - ${emp['salary']}")

employees = [
    {"name": "Alice", "department": "Sales", "salary": 60000},
    {"name": "Bob", "department": "Marketing", "salary": 70000},
    {"name": "Charlie", "department": "Sales", "salary": 55000},
    {"name": "David", "department": "Engineering", "salary": 80000},
]

def filter_employees(employees, criteria, value):
    """
    Filters a list of employee dictionaries based on the given criteria and value.

    Args:
        employees (list): A list of employee dictionaries.
        criteria (str): The key to filter by (e.g., "department", "salary").
        value: The value to filter for.

    Returns:
        list: A new list containing only the employees that match the filter criteria.
    """

    if criteria == "department":
        return [employee for employee in employees if employee[criteria] == value]
    else:
        return [employee for employee in employees if employee[criteria] > value]

# Example usage:
sales_employees = filter_employees(employees, "department", "Sales")
print("Sales Employees:", sales_employees)

high_earners = filter_employees(employees, "salary", 60000)
print("High Earners:", high_earners)


