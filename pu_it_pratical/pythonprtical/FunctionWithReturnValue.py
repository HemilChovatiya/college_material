def conversion_upper(message):
    return message.upper()
def conversion_lower(message):
    return message.lower()
def student_name(func):
    stu_name = func('Hemil')
    print(stu_name)
student_name(conversion_lower)
student_name(conversion_upper)




