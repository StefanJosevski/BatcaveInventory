# Batcave Gadget Inventory

**Name:** Stefan Josevski
**Email:** stefan.josevski04@gmail.com
**Course:** CSI 3620 Data Structures & Algorithms (optional project)

## What it does

A command-line inventory system for Batman's gadgets. You can add gadgets, look them up by ID, check them out, restock them, remove them, see everything sorted A-Z, and see which gadgets are low on stock.

## Data structures used (and why)

- **Hash Table (my own, chaining):** stores every gadget by its ID. I picked it because I almost always already know the ID, so lookup, add, remove and check out are O(1) on average.
- **Binary Search Tree sorted by name:** prints all gadgets A-Z with an in-order walk, O(n).
- **Binary Search Tree sorted by quantity:** "show low stock" starts at the smallest quantity and stops as soon as it passes the threshold, so it doesn't have to look at every gadget.

All three structures point to the same Gadget objects. When a quantity changes, the gadget is taken out of the quantity tree, updated, and put back in so the tree stays in order.

## Project files

```
BatcaveInventory/
├── src/
│   ├── Gadget.java
│   ├── HashTable.java
│   ├── BinarySearchTree.java
│   └── Main.java
└── README.md
```

## How to compile and run

You need Java (JDK 11 or newer).

```
cd BatcaveInventory
mkdir out
javac -d out src/*.java
java -cp out Main
```

The program starts with 5 gadgets already loaded so you can try it right away.

## Video presentation

YOUR_VIDEO_LINK_HERE
