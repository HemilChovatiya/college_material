

def NumbertoWord(x):
    l = ["Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ",
         "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "NineTeen ", "Twenty ",
         "Thirty ", "Fourty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety ", "Hundred ", "Thousand ", "Lakh ",
         "Crore ", ""]
    lst2digit = int(x % 100)  # reads 15689 as 89
    onedigit = int(x % 10)  # reads 15 as 5
    tendigit = int((x % 100) / 10)  # reads 50 as 5
    hundreddigit = int((x % 1000) / 100)  # reads 100 as 1
    thousanddigit = int((x % 100000) / 1000)  # reads 12500 as 12
    thousanddigit1 = int(thousanddigit % 10)  # reads 12548 as 2
    thousanddigit2 = int((thousanddigit % 100) / 10)  # reads 12548 as 1
    p = l[-4]
    q = l[-5]
    if ((onedigit) == 0):
        onedigit = -1
    if (tendigit) == 0:
        tendigit = -19
    if (lst2digit) == (0):
        lst2digit -= 1
    if thousanddigit1 == 0:
        thousanddigit1 = -1
    if thousanddigit2 == 0:
        thousanddigit2 = -1
    if thousanddigit == 0:
        p = l[-1]
    if hundreddigit == 0:
        hundreddigit = -1
        q = l[-1]

    if (x < 21):
        print(l[x])
    elif (x < 100):
        print(l[tendigit + 18] + l[onedigit])
    elif (x < 1000):
        if (lst2digit) < 21:  # x%100 is last 2 digit
            print(l[hundreddigit] + q + l[lst2digit])
        else:
            print(l[hundreddigit] + q + l[tendigit + 18] + l[onedigit])
    elif (x < 100000):
        if (lst2digit) < 21:
            if (thousanddigit < 21):
                print(l[thousanddigit] + p + l[hundreddigit] + q + l[lst2digit])
            else:
                print(l[thousanddigit2 + 18] + l[thousanddigit1] + p + l[hundreddigit] + q + l[lst2digit])
        elif (lst2digit) >= 21:
            if (thousanddigit < 21):
                print(l[thousanddigit] + p + l[hundreddigit] + q + l[tendigit + 18] +
                      l[onedigit])
            else:
                print(l[thousanddigit2 + 18] + l[thousanddigit1] + p + l[hundreddigit] + q + l[tendigit + 18] +
                      l[onedigit])
    else:
        print("out of range of thousand")

x = int(input("Enter Number : "))
NumbertoWord(x)
print(int("46"))


