using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class StudentView : IUserView<Student>
{
    public void sendOnConsole(List<Student> students)
    {
        foreach (Student user in students)
        {
            Console.WriteLine(user.ToString());
        }
    }
}