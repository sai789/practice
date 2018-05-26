#let's handle IndexError exception
b = 30
print b
try:
	eval('b <<< 10')
except SyntaxError:
	print 'Error is handled! Python does not know circular left shift'
finally:
	print 'Go smooth!'