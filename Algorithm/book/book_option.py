
def main():
    manager = BookManager()
    while True:
        print("""
Menu:
1. Add book
2. Remove book
3. Suggest books
4. Show books
5. Exit
        """)
        try:
            choice = int(input("Choose an option (1-5): "))
        except ValueError:
            print("Please enter a number.")
            continue

        match choice:
            case 1:
                manager.add_book()
            case 2:
                manager.remove_book()
            case 3:
                manager.suggest_book()
            case 4:
                manager.show_books()
            case 5:
                print("Quitting the app.")
                break
            case _:
                print("Invalid option. Please try again.")

if __name__ == "_main_":
    main()
