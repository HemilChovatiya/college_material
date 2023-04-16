import xlrd
loc=("C:\Users\\\\z\raj\Desktop\\\po.xlsx")
wb = xlrd.open_workbook(loc)
sheet=wb.sheet_by_index(0) #sheet value

print(sheet.row_values(3))
print(sheet.ncols) #total column
print(sheet.nrows)  #total Rows