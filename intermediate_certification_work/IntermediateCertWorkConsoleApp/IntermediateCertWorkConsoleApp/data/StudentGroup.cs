using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class StudentGroup
{
    public List<Student> Students { get; }
    public Teacher Teacher { get; set; }

    public StudentGroup(Teacher teacher, List<Student> students)
    {
        Teacher = teacher;
        Students = students;
    }
}