import csv

with open('C:/PyEx/sample1.csv', mode='r') as csv_file:
    csv_reader = csv.DictReader(csv_file)
    line_count = 0

    for row in csv_reader:
        if line_count == 0:
            print(f'The column names are as follows : {", ".join(row)}')
            line_count += 1

        print(f'\t{row["Sno"]} of \t{row["FirstName"]} lives in {row["City"]} ')
        line_count += 1

    print(f'Processed {line_count} lines.')