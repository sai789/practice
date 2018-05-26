class Student(object):
	def __init__(self, first_name, last_name):
		self.first_name = first_name
		self.last_name = last_name

	def name(self):
		return self.first_name + " " + self.last_name


def searchStudents(students, searchName):
	for i in range(0, len(students)):
		if students[i].name() == searchName:
			return "Found at " + str(i) + " Index :)"
	return "Name not found :("

student1 = Student("Saikumar", "Vantaku")
student2 = Student("Ramanamma", "Vantaku")
student3 = Student("Rishi", "Bandaru")
student4 = Student("Jaswanth", "Bandaru")
students = [student1, student2, student3, student4]
print searchStudents(students, "Saikumar Vantaku")
		