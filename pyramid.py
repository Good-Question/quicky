#! python3

# pyramid.py - Creates a pyramid with a decided number of rows that is composed of
#              a decided letter.

# pyramid: (String) (Number) -> (ListOfString)
# Creates a pyramid with the aforementioned details
def pyramid(letter, rows):
        # Produces an empty list containing a number of empty lists equal to the number of rows
        mainList = [[] for x in range(rows)]

        # Appends spaces, letters, spaces to each row of pyramid
        for i in range(rows):
                mainList[i].append(''.join(' ' * (rows - i - 1) + letter.upper() * (1 + 2 * i) + ' ' * (rows - i - 1)))
                mainList[i] = ''.join(mainList[i])

        print('\n'.join(mainList))
