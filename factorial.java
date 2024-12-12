class Stack:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        else:
            return None


def factorial_iterative_stack(n):
    if n == 0 or n == 1:
        return 1

    stack = Stack()
    product = 1

    for i in range(2, n + 1):
        stack.push(i)

    while not stack.is_empty():
        product *= stack.pop()

    return product


# Input
num = 10
# Calculate factorial
result = factorial_iterative_stack(num)
# Output result
print(f"Factorial of {num} is: {result}")
