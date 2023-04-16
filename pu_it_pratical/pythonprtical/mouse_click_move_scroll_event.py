from pynput.mouse import Listener
def on_move(x, y):
    print('Mouse moved to :', x, ',', y)
def on_click(x, y, button, pressed):
    if pressed:
        print('Mouse clicked at ', x, ',', y, ',', button)
        listener.stop()
def on_scroll(x, y, dx, dy):
    print('Mouse scrolled at :', x, ',', y, ',', dx, ',', dy)
    listener.stop()
with Listener(on_move=on_move, on_click=on_click, on_scroll=on_scroll) as listener:
    listener.join()