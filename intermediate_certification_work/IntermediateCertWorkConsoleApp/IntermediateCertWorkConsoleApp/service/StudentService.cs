using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

public class StudentService
{
    public static List<Student> CreateStudents()
    {
        List<Student> list = new List<Student>();
        int countMax = 500;
        while (countMax > 0)
        {
            Student student = new Student("Vasay " + countMax, "Pupkin " + countMax, "Aleshkovich " + countMax, DateTime.Now);
            list.Add(student);
            countMax--;
        }
      
       return list;
    }
}
