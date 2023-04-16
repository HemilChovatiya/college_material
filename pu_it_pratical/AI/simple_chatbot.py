import random
hello_msg=["hello","hii","hi","how are you"]
bye_msg=["bye","by","see you later","nothing much"]
while True:
        ip_msg=input()
        if ip_msg.lower() in hello_msg:
            reply_msg=["hyy sir","how can i help you"]
            print(random.choice(reply_msg))
        elif ip_msg.lower() in bye_msg:
            reply_msg=["bye sir","have a good day"]
            print(random.choice(reply_msg))
        else:
            print("sorry in can't understand")