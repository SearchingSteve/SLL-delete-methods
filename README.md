# SLL-Delete-Methods

The **SLL-Delete-Methods** repository contains a Java implementation of a generic Singly Linked List (SLL) that demonstrates various node deletion techniques. This project provides a robust implementation for deleting nodes at the beginning, end, or any specified position in the list, with comprehensive error handling and edge case management.

## Features

- **Generic Implementation**: Supports any data type through Java generics (`LinkedList<T>`)
- **Node Management**:
  - Add nodes at the end of the list
  - Delete the first node (head)
  - Delete the last node (tail)
  - Delete a node at any specified index
- **Comprehensive Error Handling**:
  - Empty list validation
  - Index bounds checking
  - Null pointer protection
- **List Visualization**: Print functionality to display the current state of the list

## Technical Implementation

### Core Classes

#### `LinkedList<T>`
- Generic class that manages the linked list operations
- Contains inner `Node` class for list element representation
- Maintains a single reference to the head node

#### `Node` (Inner Class)
- Stores generic data of type T
- Contains reference to the next node
- Initialized with data, next reference defaults to null

### Key Methods

```java
public void addNode(T data)           // Adds a new node at the end of the list
public void deleteHead()              // Removes the first node
public void deleteTail()              // Removes the last node
public void deleteAtIndex(int index)  // Removes node at specified index
public void printList()               // Displays all list elements
```

## Usage Example

```java
LinkedList<Integer> list = new LinkedList<>();

// Adding elements
list.addNode(1);
list.addNode(2);
list.addNode(3);
list.addNode(4);
list.addNode(5);

// Print initial list
System.out.println("Initial list:");
list.printList();  // Output: 1 2 3 4 5

// Delete head
list.deleteHead();
System.out.println("After deleting head:");
list.printList();  // Output: 2 3 4 5

// Delete tail
list.deleteTail();
System.out.println("After deleting tail:");
list.printList();  // Output: 2 3 4

// Delete at index 1
list.deleteAtIndex(1);
System.out.println("After deleting index 1:");
list.printList();  // Output: 2 4
```

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/SearchingSteve/SLL-delete-methods.git
   ```

2. Navigate to the project directory:
   ```bash
   cd SLL-delete-methods
   ```

3. Compile the source code:
   ```bash
   javac LinkedList.java
   ```

4. Run the program:
   ```bash
   java LinkedList
   ```

## Time Complexity

| Operation | Time Complexity |
|-----------|----------------|
| Add Node | O(n) |
| Delete Head | O(1) |
| Delete Tail | O(n) |
| Delete at Index | O(n) |
| Print List | O(n) |

Where n is the number of nodes in the list.

## Contributing

1. Fork the repository
2. Create a feature branch: `git checkout -b feature-name`
3. Commit changes: `git commit -am 'Add feature'`
4. Push to the branch: `git push origin feature-name`
5. Submit a Pull Request

## Testing

The implementation has been tested with various data types and edge cases:
- Empty list operations
- Single node operations
- Multiple node operations
- Invalid index handling
- Null data handling

## License

This project is licensed for educational purposes only. Redistribution, modification, or commercial use requires prior written permission.

## Author

- **Stephen Crocker**
- GitHub: [SearchingSteve](https://github.com/SearchingSteve)

## Version History

- 1.0.0
  - Initial release
  - Basic deletion operations
  - Generic implementation
  - Error handling

## Acknowledgments

- Thanks to all contributors who have helped with testing and verification
- Special thanks to the Java community for valuable feedback and suggestions
