def calculator(x, y, z):
    if z == "+":
        return "ADD: " + str(x+y)
    if z == "-":
        return "SUB: " + str(x-y)
    if z == "*":
        return "Mult: " + str(x*y)
    if z == "/":
        return "DIV: " + str(x/y)


v = str(input("+-*/: Enter one: "))
while v == "+" or v == "-" or v == "/" or v == "*":
    print(calculator(4, 5, v))
    v = str(input("+-*/: Enter one: "))

